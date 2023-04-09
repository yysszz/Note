package springsourcecode.designpatternnote.chapter56_observer.evenbus;

import com.google.common.eventbus.Subscribe;

public class RegNotificationObserver {

    private NotificationService notificationService;

    @Subscribe
    public void handleRegSuccess(long userId){
    notificationService.sendInBoxMessage(userId,"");
    }
}
