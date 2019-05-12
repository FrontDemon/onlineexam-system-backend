package com.mwt.oes.util;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindContentWithImage {
    /*
     * 如果选择题的题干中有 “[[[xxxx.xxx]]]”的图片，则返回图片绝对路径，否则返回空字符串
     */
    public  static Map<String, String> findContentWithImage(String content){
        Map<String, String> map = new HashMap<>();
//        Pattern pattern = Pattern.compile("\\[{3}\\w+\\.\\w+\\]{3}"); //匹配 “[[[xxxx.xxx]]]”
        Pattern pattern = Pattern.compile("\\[{3}[0-9a-z]{8}-[0-9a-z]{4}-[0-9a-z]{4}-[0-9a-z]{4}-[0-9a-z]{12}\\]{3}"); //匹配 “[[[xxxx.xxx]]]”
        Matcher matcher = pattern.matcher(content);
        String pictureFile = null;
        if(matcher.find()){
            pictureFile = matcher.group();
            pictureFile = pictureFile.substring(3, pictureFile.length()-3);
            String beforePicNameContent = content.substring(0,matcher.start());
            String afterPicNameContent = "http://qiniu.maweitao.top/programImages/" + pictureFile;
            map.put("content",beforePicNameContent);
            map.put("pictureSrc",afterPicNameContent);
            return map;
        }else{
            map.put("content",content);
            map.put("pictureSrc","");
            return map;
        }
    }
}
