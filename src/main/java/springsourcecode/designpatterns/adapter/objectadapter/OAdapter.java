package springsourcecode.designpatterns.adapter.objectadapter;

import springsourcecode.designpatterns.adapter.classadapter.Adaptee;
import springsourcecode.designpatterns.adapter.classadapter.Targer;

public class OAdapter implements Targer {

    private Adaptee adaptee;

    public OAdapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.execute();
    }

}
