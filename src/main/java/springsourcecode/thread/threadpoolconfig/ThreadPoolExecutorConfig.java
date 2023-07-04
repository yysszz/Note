package springsourcecode.thread.threadpoolconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

@Configuration
@EnableAsync
public class ThreadPoolExecutorConfig {

    @Bean(name = "threadPoolExecutor")
    public Executor threadPoolExecutor(){
        ThreadPoolTaskExecutor threadPoolTaskExecutor = new ThreadPoolTaskExecutor();
        //返回处理器可用的Java虚拟机的数量
        int processNum = Runtime.getRuntime().availableProcessors();
        int corePoolSize = (int)(processNum / (1 - 0.2));
        int maxPoolSize = (int)(processNum / (1 - 0.5));
        //核心线程数
        threadPoolTaskExecutor.setCorePoolSize(corePoolSize);
        //最大线程数
        threadPoolTaskExecutor.setMaxPoolSize(maxPoolSize);
        //等待队列大小
        threadPoolTaskExecutor.setQueueCapacity(maxPoolSize * 1000);
        //线程优先级
        threadPoolTaskExecutor.setThreadPriority(Thread.MAX_PRIORITY);
        //
        threadPoolTaskExecutor.setDaemon(false);
        //允许线程空闲时间
        threadPoolTaskExecutor.setKeepAliveSeconds(300);
        //线程前缀
        threadPoolTaskExecutor.setThreadNamePrefix("test-Executor-");
        //同步等待线程池结束的时间,超时抛出interruptException,单位毫秒
        threadPoolTaskExecutor.setAwaitTerminationMillis(100);
        //单位秒
        threadPoolTaskExecutor.setAwaitTerminationSeconds(5);
        //RejectedExecutorHandler
        threadPoolTaskExecutor.setRejectedExecutionHandler((r, executor) -> {
            //实现拒绝策略接口方法
        });
        threadPoolTaskExecutor.setRejectedExecutionHandler(new ThreadPoolExecutor.AbortPolicy());
        //
        threadPoolTaskExecutor.setAllowCoreThreadTimeOut(false);
        //调用shutdown方法时是否等待任务执行完成 shutDown/shotDownNow
        threadPoolTaskExecutor.setWaitForTasksToCompleteOnShutdown(true);
        return threadPoolTaskExecutor;
    }
}
