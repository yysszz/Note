package springsourcecode.designpatterns.singleton.exp2;

public class EHanSingleton {

    private static EHanSingleton instance = new EHanSingleton();

    private EHanSingleton() {
    }

    public static EHanSingleton getInstance(){
        return instance;
    }
}
