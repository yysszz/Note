package springsourcecode.lock.reetrantlock;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantlockTest {

    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();
        lock.lock();

    }
}
