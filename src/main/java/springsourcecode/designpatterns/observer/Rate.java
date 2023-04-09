package springsourcecode.designpatterns.observer;

import com.google.common.collect.Lists;

import java.util.List;

public abstract class Rate {

    List<Company> list = Lists.newArrayList();

    public void add(Company company){
        list.add(company);
    }

    public void remove(Company company){
        list.remove(company);
    }

    public abstract void change(int number);
}
