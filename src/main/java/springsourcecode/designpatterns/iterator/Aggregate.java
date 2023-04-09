package springsourcecode.designpatterns.iterator;

public abstract class Aggregate {

    abstract void add(Object o);

    abstract void remove(Object o);

    abstract ConcreIterator getIterator();
}
