package springsourcecode.designpatternnote.chapter41to42singleton;

import java.util.concurrent.atomic.AtomicLong;

public class IdGeneratorDoubleCheck {
    private AtomicLong id = new AtomicLong();
    private static IdGeneratorDoubleCheck instance;
    private IdGeneratorDoubleCheck(){}
    public static IdGeneratorDoubleCheck getInstance(){
        if (instance == null) {
            synchronized (IdGeneratorDoubleCheck.class){
                if (instance == null) {
                    instance = new IdGeneratorDoubleCheck();
                }
            }
        }
        return instance;
    }

    public long getId(){
        return id.incrementAndGet();
    }
}
