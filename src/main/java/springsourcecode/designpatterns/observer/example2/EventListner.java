package springsourcecode.designpatterns.observer.example2;

import com.google.common.eventbus.Subscribe;

public class EventListner {

    //订阅注解标识这个方法是事件处理方法
    @Subscribe
    public void handle(NotifyEvent notifyEvent){
        System.out.println("发送Im消息" + notifyEvent.getImNo());
        System.out.println("发送短信消息" + notifyEvent.getMobileNo());
        System.out.println("发送email消息" + notifyEvent.getEmailNo());
    }


}
