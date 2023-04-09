package springsourcecode.designpatternnote.chapter56_observer.evenbus;

import com.google.common.eventbus.Subscribe;

public class RegPromotionObserver {

    private PromotionService promotionService;

    @Subscribe
    public void handleRegSuccess(long userId){
        promotionService.issueNewUserExperienceCash(userId);
    }
}
