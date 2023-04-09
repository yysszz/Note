package springsourcecode.designpatternnote.chapter56_observer.demo;

public interface Subject {

    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers(Message message);
}
