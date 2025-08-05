package chapter05;

public class Java01_Object {
    public static void main(String[] args) {
        // TODO 常见类和对象
        // java.lang.Object
        Object obj = new Person();


        // 将对象变成字符串
        // TODO toString()默认打印的就是对象的内存地址
        String s = obj.toString();
        System.out.println(s); // chapter05.User@75a1cd57

        // TODO hashCode()获取对象的内存地址
        int i = obj.hashCode();
        System.out.println(i);

        // TODO equals()判断两个对象是否相等
        // 默认对比的是两个对象的内存地址
        System.out.println(obj.equals(new Person()));

        // TODO getClass()获取对象的类型信息
        System.out.println(obj.getClass());
    }
}

class Person {
    public String name;

    @Override
    public String toString() {
        return "Person[" + name + "]";
    }
}

class User extends Person {

}
