package springsourcecode.designpatternnote.chapter56_observer.evenbus;

import com.google.common.eventbus.AsyncEventBus;
import com.google.common.eventbus.EventBus;

import java.util.List;
import java.util.concurrent.Executors;

public class UserController {

    private UserService userService;
    private EventBus eventBus;
    private static final int DEFAULT_EVENTBUS_THREAD_POOL_SIZE = 20;

    public UserController(){
        //同步阻塞
        //eventBus = new EventBus();
        //异步非阻塞
        eventBus = new AsyncEventBus(Executors.newFixedThreadPool(DEFAULT_EVENTBUS_THREAD_POOL_SIZE));
    }

    public void setRegObservers(List<Object> observers){
        for (Object observer : observers) {
            eventBus.register(observer);
        }
    }

    public Long register(String telephone,String password){
        long userId = userService.register(telephone,password);
        eventBus.post(userId);
        return userId;
    }
}
