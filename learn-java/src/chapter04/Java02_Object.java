package chapter04;

public class Java02_Object {
    public static void main(String[] args) {
        // TODO 面向对象
        // 类：动物
        // 对象：猫，狗
        Animal cat = new Animal();
        cat.name = "黑子";
        cat.run();

        Animal dog = new Animal();
        dog.name = "lucky";
        dog.run();


    }
}

class Animal{
    String name;

    void run(){
        System.out.println("跑开了。。。。");
    }
}