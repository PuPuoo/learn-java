package chapter04;

public class Java04_Object_Static {
    public static void main(String[] args) {
        // 与类相关的方法，static
        // 可以直接用类名引用
        // 不依赖具体对象的“状态”或“数据”，只进行通用计算、逻辑处理时
        Bird.fly();

    }
}

class Bird{
    static void fly() {
        System.out.println("fly");
    }
}
