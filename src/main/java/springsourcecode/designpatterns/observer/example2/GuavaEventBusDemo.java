package springsourcecode.designpatterns.observer.example2;

public class GuavaEventBusDemo {

    public static void main(String[] args) {

        EventListner eventListner = new EventListner();

        EvenBusCenter.register(eventListner);
        EvenBusCenter.post(new NotifyEvent("17759711676","6@qq.com","648442581"));
    }
}
