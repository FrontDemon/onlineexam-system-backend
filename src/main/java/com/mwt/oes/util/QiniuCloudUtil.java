package com.mwt.oes.util;

import com.google.gson.Gson;
import com.qiniu.common.QiniuException;
import com.qiniu.common.Zone;
import com.qiniu.http.Response;
import com.qiniu.storage.BucketManager;
import com.qiniu.storage.Configuration;
import com.qiniu.storage.UploadManager;
import com.qiniu.storage.model.DefaultPutRet;
import com.qiniu.util.Auth;

public class QiniuCloudUtil {

    // 设置需要操作的账号的AK和SK
    private static final String ACCESS_KEY = "veckoKb-xqTeNo1YuKWq4wZf2303KLlg_jNDOoLr";
    private static final String SECRET_KEY = "lk_1rBf1LMvZgOqEw1ufCFO-FqbYD2k-9alx86Pd";

    // 要上传的空间
    private static final String bucketname = "onlineexam_system";

    // 密钥
    private static final Auth auth = Auth.create(ACCESS_KEY, SECRET_KEY);

    //base64方式上传
    public static String put64image(byte[] data, String key){
        //图片的外链地址
        StringBuffer imgUrl  = new StringBuffer("http://qiniu.maweitao.top/");

        //构造一个带指定Zone对象的配置类
        Configuration cfg = new Configuration(Zone.zone0());

        UploadManager uploadManager = new UploadManager(cfg);
        //...生成上传凭证，然后准备上传
        String upToken = auth.uploadToken(bucketname);

        //默认不指定key的情况下，以文件内容的hash值作为文件名
//        String key = null;

        try {
            //上传文件
            Response response = uploadManager.put(data,key,upToken);

            //解析上传成功的结果
            DefaultPutRet putRet = new Gson().fromJson(response.bodyString(), DefaultPutRet.class);
            imgUrl.append(putRet.key);
        } catch (QiniuException ex) {
            Response r = ex.response;
            System.err.println(r.toString());
            try {
                System.err.println(r.bodyString());
            } catch (QiniuException ex2) {
                //ignore
            }
        }
        return imgUrl.toString();
    }

    //删除图片
    public static void deleteImage(String imgSrc) {
        try {
            //图片的外链地址
//            StringBuffer imgUrl  = new StringBuffer("http://qiniu.maweitao.top/");

            //构造一个带指定Zone对象的配置类
            Configuration cfg = new Configuration(Zone.zone0());
            BucketManager bucketManager = new BucketManager(auth, cfg);
            String key = imgSrc.substring(26);
            bucketManager.delete(bucketname, key);
        } catch (QiniuException ex) {
            Response r = ex.response;
            System.err.println(r.toString());
        }
    }

    class Ret {
        public long fsize;
        public String key;
        public String hash;
        public int width;
        public int height;
    }
}
