package chapter04;

public class Java11_Object_Abstract {
    public static void main(String[] args) {
        // TODO abstract 抽象
        // 分析问题：对象（具体）-> 类（抽象）
        // 抽象方法：只有声明，没有实现的方法
        // 抽象类：不完整的类，不能直接构建对象，但可以通过子类间接构建对象
        // 如果抽象类中含有抽象方法，子类需要重写该方法

    }
}

abstract class Person2 {
    public abstract void eat() ;
}
