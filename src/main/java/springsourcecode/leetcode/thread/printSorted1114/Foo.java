package springsourcecode.leetcode.thread.printSorted1114;

import lombok.SneakyThrows;

import javax.annotation.security.RunAs;
import java.util.Scanner;
import java.util.concurrent.Future;
import java.util.concurrent.Semaphore;

class Foo {
     public  Semaphore first_two = new Semaphore(0);
     public  Semaphore two_second = new Semaphore(0);
    public Foo()  {

    }

    public void first(Runnable printFirst) throws InterruptedException {
        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        first_two.release();
    }

    public void second(Runnable printSecond) throws InterruptedException {
        first_two.acquire();
        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();
        two_second.release();
    }

    public void third(Runnable printThird) throws InterruptedException {
        two_second.acquire();
        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
    }
}
