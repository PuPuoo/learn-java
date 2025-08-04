package chapter04;

public class Java14_Object {
    public static void main(String[] args) {
        // TODO 匿名类
        // 在某些场合下，类的名字不重要
        Me me = new Me();
        me.sayHello(new Person14() {
            @Override
            public String name() {
                return "pupuoo";
            }
        });

        Animal14 dog = new Animal14() {
            @Override
            public void eat() {
                System.out.println("旺旺旺!");
            }
        };
        dog.eat();
    }
}

abstract class Person14 {
    public abstract String name();
}

class Me {
    public void sayHello(Person14 person14) {
        System.out.println("hello" + person14.name());
    }
}

interface Animal14 {
    void eat();
}


