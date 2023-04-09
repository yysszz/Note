package springsourcecode.designpatterns.iterator;

import com.google.common.collect.Lists;

public class IteratorTest {

    public static void main(String[] args) {
        ConcreAggregate concreAggregate = new ConcreAggregate(Lists.newArrayList(new String[]{"aa","bb","cc"}));
        ConcreIterator iterator = concreAggregate.getIterator();
        while (iterator.hashNext()) {
            System.out.println(iterator.next());
        }
        System.out.println(iterator.first());
    }
}
