package chapter07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Java06_Collection {
    public static void main(String[] args) {
        // TODO 比较器
        // sort 排序

        // TODO Comparable 类内部排序 只能有一个排序规则
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 23));
        people.add(new Person("Bob", 19));
        people.add(new Person("Charlie", 25));

        System.out.println("原始顺序：");
        System.out.println(people);

        Collections.sort(people);  // 使用 compareTo
        System.out.println("默认排序（按年龄升序）：");
        System.out.println(people);

        // TODO Comparator 类外排序 可定义多个排序规则
        Collections.sort(people, new NameComparator());
        System.out.println("按姓名升序排序：");
        System.out.println(people);
    }
}

class Person implements Comparable<Person>{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // 按年龄升序
    @Override
    public int compareTo(Person o) {
        return Integer.compare(this.age, o.age);
    }

    @Override
    public String toString() {
        return name + " - " + age;
    }
}


class NameComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return o1.getName().compareTo(o2.getName());
    }
}