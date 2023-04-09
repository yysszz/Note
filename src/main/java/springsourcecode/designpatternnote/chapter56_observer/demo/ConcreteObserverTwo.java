package springsourcecode.designpatternnote.chapter56_observer.demo;

public class ConcreteObserverTwo implements Observer {
    @Override
    public void update(Message message) {
        System.out.println("ConcreteObserverTwo is notified");
    }
}
