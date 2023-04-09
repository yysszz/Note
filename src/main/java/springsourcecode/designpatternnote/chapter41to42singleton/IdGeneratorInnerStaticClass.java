package springsourcecode.designpatternnote.chapter41to42singleton;

import java.util.concurrent.atomic.AtomicLong;

public class IdGeneratorInnerStaticClass {
    private AtomicLong id = new AtomicLong();
    private IdGeneratorInnerStaticClass(){}
    private static class SingletonHolder{
        private static final IdGeneratorInnerStaticClass instance = new IdGeneratorInnerStaticClass();
    }
    public static IdGeneratorInnerStaticClass getInstance(){
        return SingletonHolder.instance;
    }

    public long getId(){
        return id.incrementAndGet();
    }
}
