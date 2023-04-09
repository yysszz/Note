package springsourcecode.designpatterns.singleton.exp2;

public class InnerClassSingleton {

    private static class InnerClassSingletonHolder{
        private static final InnerClassSingletonHolder INSTANCE = new InnerClassSingletonHolder();
    }

    private InnerClassSingleton() {
    }

    public static InnerClassSingletonHolder getInstance(){
        return InnerClassSingletonHolder.INSTANCE;
    }
}
