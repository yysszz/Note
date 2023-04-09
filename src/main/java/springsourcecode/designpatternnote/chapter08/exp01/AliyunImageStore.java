package springsourcecode.designpatternnote.chapter08.exp01;

import javafx.scene.image.Image;

public class AliyunImageStore {

    public void createBucketIfNotExisting(String bucketName){

    }

    public String generateAccessToken(){
        return "token";
    }

    public String uploadToAliyun(Image image,String bucketName,String accessTo){

        return "阿里云url";
    }

    public Image downloadFromAliyun(String url,String accessToken){
        return new Image("");
    }
}
