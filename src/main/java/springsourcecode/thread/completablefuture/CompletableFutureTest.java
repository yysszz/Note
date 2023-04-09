package springsourcecode.thread.completablefuture;


import java.util.concurrent.*;

public class CompletableFutureTest {


    static ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 10, 100, TimeUnit.SECONDS, new SynchronousQueue());
    static ExecutorService executorService = Executors.newFixedThreadPool(5);
    public static void main(String[] args) throws Exception{
        CompletableFuture completableFuture = CompletableFuture.runAsync(() ->{
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("异步执行");
            System.out.println("阻塞5秒");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName());
        });

        CompletableFuture<String> completableFuture1 = CompletableFuture.supplyAsync(CompletableFutureTest::supplyAsyncMethod);

        completableFuture1.thenAccept((result) -> {
            System.out.println(Thread.currentThread().getName());
            System.out.println("执行成功:" + result);
        });

        Future<String> future = executorService.submit(() -> {
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            Thread.sleep(15000);
            System.out.println("异步执行,阻塞15秒");
            return "执行成功,ThreadName:" + Thread.currentThread().getName();
        });
        System.out.println(future.get());



    }

    static String supplyAsyncMethod(){
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "阻塞10秒";
    }
}
