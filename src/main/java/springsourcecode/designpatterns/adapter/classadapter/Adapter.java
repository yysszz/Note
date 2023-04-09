package springsourcecode.designpatterns.adapter.classadapter;

public class Adapter extends Adaptee implements Targer {


    @Override
    public void request() {
        execute();
    }
}
