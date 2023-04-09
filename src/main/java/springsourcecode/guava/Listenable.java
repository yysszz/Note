package springsourcecode.guava;

import com.google.common.util.concurrent.*;

import java.util.concurrent.*;

public class Listenable {

    private final static ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(10,30,100, TimeUnit.SECONDS,new LinkedBlockingDeque<>(20));

    private final static ListeningExecutorService executorService = MoreExecutors.listeningDecorator(threadPoolExecutor);

    public static void main(String[] args) {
        System.out.println("开始调用异步接口");
        addCallable();
        addListener();
        System.out.println("结束调用异步接口");
    }

    private static void addCallable(){
        System.out.println("任务1开始执行");
        ListenableFuture<String> future1 = executorService.submit(() -> "任务1异步执行");
        System.out.println("方法执行完成，异步结果未返回");


        Futures.addCallback(future1,new FutureCallback<String>() {
            @Override
            public void onSuccess(String s) {
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("任务1成功");
            }

            @Override
            public void onFailure(Throwable throwable) {
                System.out.println("任务1失败,记录日志手动重试");
            }
        },executorService);

    }

    private static void addListener(){
        ListenableFuture<String> future2 = executorService.submit(() -> "任务2异步执行");
        future2.addListener(() -> {
            try{
                Thread.sleep(10000);
                System.out.println("异步成功执行");
            }catch (Exception e){
                //捕获到异常记录日志重试
                System.out.println("异步失败执行");
            }
        },executorService);
    }
}
