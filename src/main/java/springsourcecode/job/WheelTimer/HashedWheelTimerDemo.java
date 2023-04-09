package springsourcecode.job.WheelTimer;

import io.netty.util.HashedWheelTimer;
import io.netty.util.Timeout;
import io.netty.util.TimerTask;

import java.util.concurrent.TimeUnit;

public class HashedWheelTimerDemo {

    static class MyTimerTask implements TimerTask{

        boolean flag;

        public MyTimerTask(boolean flag){
            this.flag = flag;
        }

        @Override
        public void run(Timeout timeout) throws Exception {
            System.out.println("执行...");
            this.flag = false;
        }
    }

    public static void main(String[] args) {
        MyTimerTask myTimerTask = new MyTimerTask(true);
        HashedWheelTimer hashedWheelTimer = new HashedWheelTimer();
        hashedWheelTimer.newTimeout(myTimerTask,5, TimeUnit.SECONDS);
        int i = 1;
        while (myTimerTask.flag) {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println(i + "秒过去了");
            i++;
        }

    }
}
