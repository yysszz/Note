package springsourcecode.designpatterns.iterator;

import com.google.common.collect.Lists;

import java.util.List;

public class ConcreIterator implements IteratorInterface {

    private List<Object> list = Lists.newArrayList();

    private int index = -1;

    public ConcreIterator(List<Object> list){
        this.list = list;
    }

    @Override
    public boolean hashNext() {
        if(index < list.size() - 1){
            return true;
        }
        return false;
    }


    @Override
    public Object first() {
        Object o = null;
        index = 0;
        if(list.get(index) != null){
            o = list.get(index);
        }
        return o;
    }

    @Override
    public Object next() {
        Object o = null;
        if(this.hashNext()){
            o = list.get(++index);
        }
        return o;
    }
}
