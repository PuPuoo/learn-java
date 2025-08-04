package chapter04;

public class Java12_Object_Interface {
    public static void main(String[] args) {
        // TODO 接口
        // 所谓的接口，可以简单理解为规则
        // interface 接口名称 {规则属性，规则的行为}
        // 规则的属性必须为固定值，而且不能修改
        // 行为应该是抽象的
        // 属性是静态的
        // 权限均为公开
        // 类可以实现多个接口
        Animal2 myDog = new Dog2();  // 向上转型为接口类型
        myDog.eat();               // 输出：Dog eats bones.
        myDog.sleep();             // 输出：Dog sleeps in a kennel.

        Animal2 myCat = new Cat2();
        myCat.eat();               // 输出：Cat eats fish.
        myCat.sleep();             // 输出：Cat sleeps on the sofa.
    }
}

// 定义接口
interface Animal2 {
    void eat();
    void sleep();
}

// Dog类实现Animal接口
class Dog2 implements Animal2 {
    @Override
    public void eat() {
        System.out.println("Dog eats bones.");
    }

    @Override
    public void sleep() {
        System.out.println("Dog sleeps in a kennel.");
    }
}

// Cat类实现Animal接口
class Cat2 implements Animal2 {
    @Override
    public void eat() {
        System.out.println("Cat eats fish.");
    }

    @Override
    public void sleep() {
        System.out.println("Cat sleeps on the sofa.");
    }
}
