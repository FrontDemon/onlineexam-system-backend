/*
package com.mwt.oes.util;

import com.mwt.oes.controller.StudentSystemController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class TempProfileImageSavaUtil {
    */
/** 头像保存路径 *//*

    public static final String WINDOWS_PROFILES_PATH = "D:\\onlineexam-system-backend\\src\\main\\resources\\static\\tempProfiles\\";
    public static final String LINUX_PROFILES_PATH = "/root/super_meeting/tempProfiles/";

    public static Logger log = LoggerFactory.getLogger(StudentSystemController.class);

    public static String imageSava(MultipartFile newProfile,String oldImgSrc){
        // 根据Windows和Linux配置不同的头像保存路径
        String OSName = System.getProperty("os.name");
        String profilesPath = OSName.toLowerCase().startsWith("win") ? WINDOWS_PROFILES_PATH
                : LINUX_PROFILES_PATH;

        if (!newProfile.isEmpty()) {
            String profilePathAndNameDB = oldImgSrc;
            // 默认以原来的头像名称为新头像的名称，这样可以直接替换掉文件夹中对应的旧头像
            String newImgSrc = profilePathAndNameDB;
            String imgName = profilePathAndNameDB.substring(profilePathAndNameDB.lastIndexOf("\\"));
//            log.info(imgName);
            String newDistName = profilesPath + imgName;
            // 若头像名称不存在
            if (profilePathAndNameDB == null || "".equals(profilePathAndNameDB)) {
                String name = System.currentTimeMillis() + newProfile.getOriginalFilename();
                newImgSrc = "http:\\\\localhost:8080\\api\\tempProfiles\\" + name;
                newDistName = profilesPath+ name;
            }
            // 磁盘保存
            BufferedOutputStream out = null;
            try {
                File folder = new File(profilesPath);
                if (!folder.exists())
                    folder.mkdirs();
                out = new BufferedOutputStream(new FileOutputStream(newDistName));
                // 写入新文件
                out.write(newProfile.getBytes());
                out.flush();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            return newImgSrc;
        } else {
            return "";
        }
    }
}
*/
