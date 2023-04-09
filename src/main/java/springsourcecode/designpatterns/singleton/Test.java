package springsourcecode.designpatterns.singleton;

import java.util.concurrent.*;

public class Test {
    public static void main(String[] args) {

        SingleTonTest singleTonTest = SingleTonTest.instanceA;

        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 5, 5, TimeUnit.MINUTES, new SynchronousQueue<Runnable>());
        FutureTask<String> futureTask = new FutureTask(new Callable() {
            @Override
            public Object call() throws Exception {
                Thread.sleep(20000);
                return null;
            }
        });
        threadPoolExecutor.submit(futureTask);
//        Runnable runnable1 = new Runnable() {
//            @Override
//            public void run() {
//                SingleTonTest instanceA = SingleTonTest.instanceA;
//                System.out.println(instanceA.getName() + "" + instanceA.getAge());
//                instanceA.setName("C");
//            }
//        };
//        Runnable runnable2 = new Runnable() {
//            @Override
//            public void run() {
//                SingleTonTest instanceA = SingleTonTest.instanceA;
//                System.out.println(instanceA.getName() + "" + instanceA.getAge());
//                instanceA.setName("C");
//            }
//        };
//        threadPoolExecutor.execute(runnable1);
//        threadPoolExecutor.execute(runnable2);
        SingleTonTest singleTonTest1 = SingleTonTest.instanceB;
        SingleTonTest singleTonTest2 = SingleTonTest.instanceA;
        System.out.println(singleTonTest == singleTonTest1);
        System.out.println(singleTonTest == singleTonTest2);
        System.out.println(singleTonTest.getName() + "" + singleTonTest.getAge());
    }
}
