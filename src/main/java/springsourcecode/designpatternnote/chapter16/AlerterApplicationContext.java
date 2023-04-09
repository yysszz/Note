package springsourcecode.designpatternnote.chapter16;

public class AlerterApplicationContext {

    private AlertRule alertRule;
    private Notification notification;
    private Alert alert;

    public void intializeBeans(){
        alertRule = new AlertRule();
        notification = new Notification();
        alert = new Alert();

        alert.addHandler(new TpsAlertHandler(alertRule,notification));
        alert.addHandler(new ErrorAlertHandler(alertRule,notification));
    }

    public Alert getAlert(){
        return this.alert;
    }

    private static final AlerterApplicationContext instance = new AlerterApplicationContext();
    private AlerterApplicationContext(){
        instance.intializeBeans();
    }

    public static AlerterApplicationContext getInstance(){
        return instance;
    }

    public static void main(String[] args) {
        ApiStateInfo apiStateInfo = new ApiStateInfo();
        AlerterApplicationContext.getInstance().getAlert().check(apiStateInfo);
    }
}
