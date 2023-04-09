package springsourcecode.designpatternnote.chapter41to42singleton;

import java.util.concurrent.atomic.AtomicLong;

public class IdGeneratorHungry {
    private AtomicLong id = new AtomicLong();
    private final static IdGeneratorHungry instance = new IdGeneratorHungry();
    //单例私有构造
    private IdGeneratorHungry(){}
    public static IdGeneratorHungry getInstance(){
        return instance;
    }
    public long getId(){
        return id.incrementAndGet();
    }
}
