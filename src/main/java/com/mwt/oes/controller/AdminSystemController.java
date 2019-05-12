package com.mwt.oes.controller;

import com.mwt.oes.domain.Admin;
import com.mwt.oes.service.AdminSystemService;
import com.mwt.oes.util.ServerResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/admin")
public class AdminSystemController {

    @Autowired
    private AdminSystemService adminSystemService;

    /*
        校验教师登录
     */
    @RequestMapping(value = "/adminLogin", method = RequestMethod.POST)
    public ServerResponse adminLogin(@RequestBody(required = false)Admin admin,
                                       HttpServletRequest request){

        HttpSession session = request.getSession();

        String ano = admin.getAno();
        String psw = admin.getAdmPsw();
        if (ano.equals(""))
            return ServerResponse.createByError("管理员号为空");
        if (psw.equals(""))
            return ServerResponse.createByError("密码为空");
        //判断管理员号密码是否匹配
        List<Admin> resultList = adminSystemService.adminLogin(ano, psw);
        if (resultList != null && resultList.size() > 0){
            //更新最近登录时间
            Admin updateAdminObj = resultList.get(0);
            updateAdminObj.setAdmLastLoginTime(new Date());
            boolean isUpdate = adminSystemService.updateAdmin(updateAdminObj);
            if(isUpdate){
                //将登录成功后的教师信息存入session
                session.setAttribute("admObj",updateAdminObj);
                //返回给前台json数据
                return ServerResponse.createBySuccess("登录成功",updateAdminObj);
            }
            //更新最近登录时间失败
            else {
                return ServerResponse.createByError("登录失败，后台数据库更新最近登录时间错误");
            }
        }
        else {
            return ServerResponse.createByError("管理员号或密码错误");
        }
    }

    /*
        管理员退出登录
     */
    @RequestMapping("/adminLogOut")
    public ServerResponse adminLogOut(HttpServletRequest request){
        HttpSession session = request.getSession();
        session.invalidate();
        return ServerResponse.createBySuccess("退出登录成功",null);
    }
}
