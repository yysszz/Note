package springsourcecode.designpatternnote.chapter14.credentialstorage;

public interface CredentialStorage {

    String getPasswordByAppId(String appId);
}
