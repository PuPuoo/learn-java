package chapter04;

public class Java07_Object {
    public static void main(String[] args) {
        // TODO 面向对象-多态
        // 多态：其实就是一个对象在不同场景下表现出来的不同状态和形态
        // 多态其实就是对对象的使用场景进行了约束
        Person p =  new Person();
        Person p1 = new Boy();
        Person p2 = new Girl();
    }
}

class Person{

}

class Boy extends Person{
}

class Girl extends Person{
}
