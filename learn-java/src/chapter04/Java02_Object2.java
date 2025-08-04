package chapter04;

public class Java02_Object2 {
    public static void sayHello(){
        System.out.println("hello!");
    }

    public static void main(String[] args) {
        // TODO 面向对象
        // 狗：2只，小黑和小白
        // 类：狗
        // 对象：小黑和小白
        Dog dog1 = new Dog();
        dog1.color = "black";

        Dog dog2 = new Dog();
        dog2.color = "white";

    }
}

class Dog{
    String color;
}

