package springsourcecode.collection;

import com.google.common.base.Objects;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class ListDemo {


    public static void main(String[] args) {

        Person aaa = new Person(111, "aaa");
        System.out.println(aaa.hashCode());
        List<Object> objects = new LinkedList<>();
        List<Integer> objects1 = new ArrayList<>();
        objects1.add(4);
        objects1.add(5);
        objects1.add(6);
        objects1.add(7);
        objects1.add(1);
        objects1.add(2);
        objects1.add(3);
        System.out.println(objects1);
        Collections.sort(objects1);
        System.out.println(objects1);
        Collections.reverse(objects1);
        System.out.println(objects1);

        TreeMap<Person, String> map = new TreeMap<>();
        map.put(new Person(89,"aaa"),"aaa");
        map.put(new Person(12,"aaa"),"bbb");
        map.put(new Person(41,"aaa"),"ccc");
        map.put(new Person(13,"aaa"),"ddd");
        map.put(new Person(1,"aaa"),"eee");
        for (Map.Entry<Person, String> entry : map.entrySet()) {
            System.out.println("key:" + entry.getKey() + ",Value:" + entry.getValue());
        }

        Set<Person> set = new HashSet<>();
        set.add(new Person(235,"zhangsan"));
        set.add(new Person(27,"lisi"));
        set.add(new Person(123,"wangwu"));
        set.add(new Person(53,"bbobo"));
        set.add(new Person(53,"bbobo"));
        set.add(new Person(53,"bbobo"));
        for (Person person : set) {
            System.out.println(person);
        }
        List<Person> list = Lists.newArrayList();
        list.add(new Person(124214,"takeTwo"));
        list.add(new Person(4523,"takeThree"));
        list.add(new Person(12,"takeFour"));
        list.add(new Person(452435,"takeFive"));
        list.add(new Person(123,"takeSix"));
        Collections.sort(list, Comparator.comparingInt(Person::getAge));
        System.out.println(list);

        List<Object> list1 = new ArrayList<>();
        List<Object> list2 = Lists.newArrayList();
        List<Object> objects2 = new LinkedList<>();
        List<Object> objects3 = Lists.newLinkedList();

        Set<Object> objects5 = new HashSet<>();
        Set<Object> objects4 = Sets.newHashSet();
        Set<Object> objects6 = new LinkedHashSet<>();
        Set<Object> objects7 = Sets.newLinkedHashSet();
        Set<Object> treeSet = new TreeSet<>();
        SortedSet<Object> objects8 = new TreeSet<>();
        TreeSet<Comparable> comparables = Sets.newTreeSet();

        Map<Object, Object> hashMap = new HashMap<>();
        Map<Object, Object> objectObjectHashMap = Maps.newHashMap();
        Hashtable<Object, Object> hashtable = new Hashtable<>();
        Collections.unmodifiableList(Lists.newArrayList());
        TreeMap<Object, Object> treeMap = new TreeMap<>();
        LinkedHashMap<Object, Object> map1 = new LinkedHashMap<>();
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    private static class Person implements Comparable<Person>{

        private int age;

        private String name;

        @Override
        public int compareTo(Person p1) {
            if (this.age > p1.age) {
                return 1;
            }
            if (this.age < p1.age) {
                return -1;
            }
            return 0;
        }

        @Override
        public boolean equals(Object object) {
            if (this == object) return true;
            if (object == null || getClass() != object.getClass()) return false;
            Person person = (Person) object;
            return age == person.age &&
                    Objects.equal(name, person.name);
        }

        @Override
        public int hashCode() {
            return Objects.hashCode(age, name);
        }
    }
}
