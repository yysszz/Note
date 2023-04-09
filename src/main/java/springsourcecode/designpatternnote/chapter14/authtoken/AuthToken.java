package springsourcecode.designpatternnote.chapter14.authtoken;

import java.util.Base64;

public class AuthToken {

    private static final long DEFAULT_EXPIRED_TIME_INTERVAL = 1*60*1000;

    private String token;

    private long createTime;

    private long expiredTimeInterval = DEFAULT_EXPIRED_TIME_INTERVAL;

    public AuthToken(String token,long createTime){
        this.token = token;
        this.createTime = createTime;
    }

    public AuthToken(String token, long createTime, long expiredTimeInterval) {
        this.token = token;
        this.createTime = createTime;
        this.expiredTimeInterval = expiredTimeInterval;
    }

    public static AuthToken generate(String baseUrl, long createTime, String appId,String password){
        StringBuilder builder = new StringBuilder();
        builder.append(baseUrl);
        builder.append(createTime);
        builder.append(appId);
        builder.append(password);
        return new AuthToken(Base64.getEncoder().encodeToString(builder.toString().getBytes()),1);
    }

    public String getToken(){
        return token;
    }

    public boolean isExpired(){
        return createTime + expiredTimeInterval < System.currentTimeMillis();
    }

    public boolean match(AuthToken authToken){
        return this.token.equals(authToken.token);
    }

}
