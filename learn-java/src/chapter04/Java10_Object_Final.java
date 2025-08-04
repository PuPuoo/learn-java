package chapter04;

public class Java10_Object_Final {
    public static void main(String[] args) {
        // TODO final
        // 可以在数据初始化后不被修改
        // final 可以修饰变量，变量的值一旦初始化后无法修改
        // final 修饰后，JVM不能自动初始化了，属性值不能发生变化
        final String name = "pupuoo";
    }
}

// final 修饰类，则不能有子类进行继承了
final class User5 {
    public final String name;

    // 用构造方法就能实现外部传参赋值属性的值了
    public User5(String name) {
        this.name = name;
    }

    // final 还可以修饰方法参数，一旦修饰，变量则不可更改
//    public User5(final String age) {
//
//    }

    // final 修饰方法，这样子类就不能进行方法重写了
    // 但final 不能修饰构造方法
    public final void test() {

    }
}
