package chapter07;

import java.util.HashSet;
import java.util.Objects;

public class Java07_Collection_HashSet {
    public static void main(String[] args) {
        // TODO HashSet 无序无重复 集合类
        // 属于 Set 接口的实现类，底层通过 HashMap 实现
        // 不保证元素顺序，存进去的顺序和取出来的顺序可能不一样

        HashSet<String> set = new HashSet<>();

        set.add("apple");
        set.add("banana");
        set.add("apple"); // 重复添加，不会加入
        set.remove("banana");
        System.out.println(set.contains("apple"));
        System.out.println(set.size());
        System.out.println(set.isEmpty());
        set.clear(); // 清空集合

        set.add("apple");
        set.add("banana");
        set.add("orange");
        System.out.println(set); // 无序输出，去重


        // TODO 如果你添加的是自定义对象，要重写 hashCode() 和 equals() 方法，否则无法正确判断重复
        // 当你 add(obj) 一个对象时，HashSet 会：
        // 1. 先调用 hashCode() 看对象应该放在哪个“桶”（bucket）里
        // 2. 然后在该桶里调用 equals()，判断是否已经有“等于”的对象了
        // 3. 如果 equals() 返回 true，则认为是“重复”，不添加
        HashSet<Person7> users = new HashSet<>();
        users.add(new Person7("pupu"));
        users.add(new Person7("yuyu"));
        users.add(new Person7("pupu")); // 重复，不会添加

        System.out.println(users.size());
    }
}

class Person7{
    String name;

    Person7(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Person7)) return false;
        Person7 person7 = (Person7) o;
        return Objects.equals(name, person7.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}













