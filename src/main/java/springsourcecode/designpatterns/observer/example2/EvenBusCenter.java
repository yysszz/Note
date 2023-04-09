package springsourcecode.designpatterns.observer.example2;

import com.google.common.eventbus.EventBus;

public class EvenBusCenter {

    private static EventBus eventBus = new EventBus();

    private EvenBusCenter(){

    }

    public static EventBus getInstance(){
        return eventBus;
    }

    //注册观察者
    public static void register(Object object){
        eventBus.register(object);
    }

    //移除观察者
    public static void unRegister(Object object){
        eventBus.unregister(object);
    }

    //推送消息给观察者
    public static void post(Object object){
        eventBus.post(object);
    }
}
