package springsourcecode.designpatternnote.chapter14.credentialstorage.impl;

import springsourcecode.designpatternnote.chapter14.credentialstorage.CredentialStorage;

public class MysqlCredntialStorage implements CredentialStorage {
    @Override
    public String getPasswordByAppId(String appId) {
        return "password";
    }
}
