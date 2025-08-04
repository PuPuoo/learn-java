package chapter04;

public class Java06_Object_Extends {
    public static void main(String[] args) {
        // TODO 面向对象-继承
        // 面向对象的3个非常重要的特性：继承、封装、多态
        // 类存在父子关系，子类可以直接获取到父类的成员属性和成员方法
        // 类的继承是单继承，一个类只能有一个父类，但一个父类可以有多个子类
        Child c =  new Child();
        System.out.println(c.name);
        c.test();

        // TODO 面向对象-继承-super & this
        // 如果父类和子类有相同的属性，那么可以采用特殊的关键字来区分
        // super & this
        // super是上一级，this是当前级

        // TODO 面向对象-继承-构造方法
        // 父类对象是在子类对象前创建前创建完成，创建子类对象前，会调用父类的构造方法完成父类的创建
        Child c2 = new Child();
        Child c3 = new Child();
    }
}

class Parent {
    String name = "pupu";

    Parent() {
        System.out.println("Parent...");
    }

    Parent(String name) {
        System.out.println("Parent: " + name);
    }

    void test() {
        System.out.println(name); // 默认用this
    }
}

class Child extends Parent {
    String name = "yuyu";

    Child() {
        // 如果父类提供带有参数构造方法，那么JVM不会提供默认的构造方法super()
        // 需要用super(参数)进行显示调用来构造父类对象
        super("yuyu");
        System.out.println("Child...");
    }

    void test() {
        System.out.println(super.name);
        System.out.println(this.name);
    }
}