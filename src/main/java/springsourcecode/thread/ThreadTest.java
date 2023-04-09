package springsourcecode.thread;

import java.util.concurrent.*;

public class ThreadTest {

    public static void main(String[] args) throws Exception {
        BlockingQueue workQueue = new LinkedBlockingDeque();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 5, 5, TimeUnit.MINUTES, workQueue);
        ExecutorService executorService = new ThreadPoolExecutor(5, 10, 5, TimeUnit.MINUTES, workQueue);
        ExecutorService executorService1 = Executors.newFixedThreadPool(5);
        System.out.println("主程序开始执行");

//        FutureTask futureTask = new FutureTask<>(new Callable<String>() {
//            @Override
//            public String call() throws Exception {
//                System.out.println("开始执行异步任务");
//                Thread.sleep(2000);
//                System.out.println("结束执行异步任务");
//                return "阻塞完毕，返回";
//            }
//        });
        Future<?> submit = executorService.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                System.out.println("开始执行异步任务");
                Thread.sleep(2000);
                System.out.println("结束执行异步任务");
                return "阻塞完毕，返回";
            }
        });
        System.out.println("执行方法内其他代码");
        Thread.sleep(10000);
        System.out.println("获取异步执行结果");
        String result = (String) submit.get();
        System.out.println(result);
        System.out.println("主程序结束执行");


        if (!executorService.isShutdown()) {
            executorService.shutdown();
        }
    }
}

