package springsourcecode.designpatterns.adapter.objectadapter;

import springsourcecode.designpatterns.adapter.classadapter.Adaptee;
import springsourcecode.designpatterns.adapter.classadapter.Targer;

public class OTest {
    public static void main(String[] args) {
         Targer oAdapter = new OAdapter(new Adaptee());
         oAdapter.request();
    }
}
