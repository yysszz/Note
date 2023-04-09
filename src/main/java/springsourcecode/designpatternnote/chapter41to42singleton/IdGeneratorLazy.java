package springsourcecode.designpatternnote.chapter41to42singleton;

import java.util.concurrent.atomic.AtomicLong;

public class IdGeneratorLazy {
    private AtomicLong id = new AtomicLong();
    private static IdGeneratorLazy instance;
    private IdGeneratorLazy(){}
    public static IdGeneratorLazy getInstance(){
        if (instance == null) {
            instance = new IdGeneratorLazy();
        }
        return instance;
    }
    public long getId(){
        return id.incrementAndGet();
    }
}
