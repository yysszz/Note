package springsourcecode.designpatterns.iterator;

import com.google.common.collect.Lists;

import java.util.List;

public class ConcreAggregate extends Aggregate {

    private List<Object> list = Lists.newArrayList();

    public ConcreAggregate(List<Object> list){
        this.list = list;
    }

    @Override
    void add(Object o) {
        list.add(o);
    }

    @Override
    void remove(Object o) {
        list.remove(o);
    }

    @Override
    ConcreIterator getIterator() {
        return new ConcreIterator(list);
    }
}
