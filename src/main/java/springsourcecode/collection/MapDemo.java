package springsourcecode.collection;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author
 */
public class MapDemo {

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    static class Person{
        private Integer age;

        @Override
        public boolean equals(Object object) {
            if (this == object) return true;
            if (object == null || getClass() != object.getClass()) return false;

            Person person = (Person) object;

            return age.equals(person.age);
        }

        @Override
        public int hashCode() {
            return age.hashCode();
        }
    }

    public static void main(String[] args) {
        Map<Person,String> treeMap = new TreeMap<>((o1, o2) ->
                Integer.compare(o1.getAge() - o2.getAge(),0));
        treeMap.put(new Person(14),"Person1");
        treeMap.put(new Person(4),"Person2");
        treeMap.put(new Person(73),"Person3");
        treeMap.put(new Person(61),"Person4");
        treeMap.put(new Person(42),"Person5");

        treeMap.entrySet().stream().forEach(
                System.out::println
        );
        Person person = new Person(11);
        System.out.println(person.hashCode());

    }
}
