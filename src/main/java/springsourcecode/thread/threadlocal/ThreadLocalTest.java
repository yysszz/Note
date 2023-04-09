package springsourcecode.thread.threadlocal;


public class ThreadLocalTest {

    static ThreadLocal threadLocal = new ThreadLocal();

    public static void main(String[] args) {
         threadLocal.set("String");
//        String o = (String)threadLocal.get();
//        System.out.println(o);
        threadLocal.set(new ThreadLocalTest());
        ThreadLocalTest o1 = (ThreadLocalTest)threadLocal.get();
        System.out.println(o1);
    }
}
