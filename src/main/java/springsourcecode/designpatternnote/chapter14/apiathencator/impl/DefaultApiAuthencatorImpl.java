package springsourcecode.designpatternnote.chapter14.apiathencator.impl;

import springsourcecode.designpatternnote.chapter14.apiathencator.ApiAuthencator;
import springsourcecode.designpatternnote.chapter14.apirequest.ApiRequest;
import springsourcecode.designpatternnote.chapter14.authtoken.AuthToken;
import springsourcecode.designpatternnote.chapter14.credentialstorage.CredentialStorage;
import springsourcecode.designpatternnote.chapter14.credentialstorage.impl.MysqlCredntialStorage;

public class DefaultApiAuthencatorImpl implements ApiAuthencator {

    private CredentialStorage credentialStorage;

    public DefaultApiAuthencatorImpl(){
        this.credentialStorage = new MysqlCredntialStorage();
    }

    public DefaultApiAuthencatorImpl(CredentialStorage credentialStorage){
        this.credentialStorage = credentialStorage;
    }

    @Override
    public void auth(String url) {
        ApiRequest apiRequest = ApiRequest.createFromFullUrl(url);
        auth(apiRequest);
    }

    @Override
    public void auth(ApiRequest apiRequest) {
        String appId = apiRequest.getAppId();
        String token = apiRequest.getToken();
        long timeStamp = apiRequest.getTimeStamp();
        String baseUrl = apiRequest.getBaseUrl();

        AuthToken clientAuthToken = new AuthToken(token, timeStamp);
        if (clientAuthToken.isExpired()) {
            throw new RuntimeException("Token is Expired!");
        }

        String password = credentialStorage.getPasswordByAppId(appId);
        AuthToken serverAuthToken = AuthToken.generate(baseUrl, timeStamp, appId, password);
        if (!serverAuthToken.match(clientAuthToken)) {
           throw new RuntimeException("Token Verification Failed");
        }
    }
}
