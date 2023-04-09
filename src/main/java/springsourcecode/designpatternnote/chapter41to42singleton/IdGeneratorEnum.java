package springsourcecode.designpatternnote.chapter41to42singleton;

import java.util.concurrent.atomic.AtomicLong;

public enum  IdGeneratorEnum {
    INSTANCE;
    private AtomicLong id = new AtomicLong();

    public long getId() {
        return id.incrementAndGet();
    }
}
