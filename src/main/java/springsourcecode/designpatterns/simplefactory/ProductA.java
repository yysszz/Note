package springsourcecode.designpatterns.simplefactory;

import springsourcecode.designpatterns.singleton.TestInterface;

public class ProductA extends Product {
    @Override
    public void show() {
        System.out.println("展示A产品" + TestInterface.ModuleName.A);
    }
}
