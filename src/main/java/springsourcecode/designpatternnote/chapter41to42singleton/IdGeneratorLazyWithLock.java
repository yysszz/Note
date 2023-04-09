package springsourcecode.designpatternnote.chapter41to42singleton;

import java.util.concurrent.atomic.AtomicLong;

public class IdGeneratorLazyWithLock {
    private AtomicLong id = new AtomicLong();
    private static IdGeneratorLazyWithLock instance;
    private IdGeneratorLazyWithLock(){}
    public static synchronized IdGeneratorLazyWithLock getInstance(){
        if (instance == null) {
            instance = new IdGeneratorLazyWithLock();
        }
        return instance;
    }

    public long getId(){
        return id.incrementAndGet();
    }
}
