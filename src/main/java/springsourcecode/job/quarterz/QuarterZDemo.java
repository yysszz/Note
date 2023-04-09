package springsourcecode.job.quarterz;

import org.quartz.Job;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.Scheduler;
import org.quartz.SimpleScheduleBuilder;
import org.quartz.SimpleTrigger;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;

public class QuarterZDemo implements Job {


    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        System.out.println("执行...");
    }

    public static void main(String[] args) throws Exception{
        //创建任务
        JobDetail jobDetail = JobBuilder.newJob(QuarterZDemo.class)
                .withIdentity("job1", "group1")
                .build();
        //创建触发器
        Trigger trigger = TriggerBuilder.newTrigger()
                .withIdentity("trigger1", "group3")
                .withSchedule(
                        SimpleScheduleBuilder
                                .simpleSchedule()
                                .withIntervalInSeconds(3)
                                .repeatForever()
                ).build();
        Scheduler scheduler = new StdSchedulerFactory().getScheduler();
        //将任务及触发器放入调度器
        scheduler.scheduleJob(jobDetail,trigger);
        //调度器开始调度任务
        scheduler.start();
    }
}
