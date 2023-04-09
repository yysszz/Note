package springsourcecode.designpatterns.singleton.exp2;

public enum EnumSingleton {

    INSTANCE;

    public EnumSingleton getInstance(){
        return INSTANCE;
    }
}
