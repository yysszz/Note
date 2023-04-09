package springsourcecode.designpatternnote.chapter16;

public class ErrorAlertHandler extends AlertHandler {

    public ErrorAlertHandler(AlertRule rule, Notification notification) {
        super(rule, notification);
    }

    @Override
    public void check(ApiStateInfo apiStateInfo) {
//        if (apiStatInfo.getErrorCount() > rule.getMatchedRule(apiStatInfo.getApi())
//            notification.notify(NotificationEmergencyLevel.SEVERE, "...");
//        }
    }
}
