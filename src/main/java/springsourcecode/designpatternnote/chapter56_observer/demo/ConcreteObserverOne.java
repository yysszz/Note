package springsourcecode.designpatternnote.chapter56_observer.demo;

public class ConcreteObserverOne implements Observer {
    @Override
    public void update(Message message) {
        System.out.println("ConcreteObserverOne is notified");
    }
}
