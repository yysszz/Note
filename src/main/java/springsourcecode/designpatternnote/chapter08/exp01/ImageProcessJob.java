package springsourcecode.designpatternnote.chapter08.exp01;

import javafx.scene.image.Image;

public class ImageProcessJob {

    private static final String BUCKET_NAME = "ai_image_bucket";

    public void process(){
        Image image = new Image("");
        AliyunImageStore aliyunImageStore = new AliyunImageStore();
        aliyunImageStore.createBucketIfNotExisting(BUCKET_NAME);
        String accessToken = aliyunImageStore.generateAccessToken();
        aliyunImageStore.uploadToAliyun(image,BUCKET_NAME,accessToken);
    }
}
