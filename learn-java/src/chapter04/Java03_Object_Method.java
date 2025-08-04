package chapter04;

public class Java03_Object_Method {
    public static void sayHello(){
        System.out.println("hello!");
    }



    public static void main(String[] args) {
        // TODO 面向对象-方法
        int i = 10;
        test(i);
        System.out.println(i);

        String s = "abc";
        test2(s);
        System.out.println(s);


    }

    public static int test(int i) {
        i = i + 10;
        return i;
    }

    public static String test2(String s) {
        s = s + 10;
        return s;
    }
}

class User{
    void sayHello(){
        System.out.println("hello!");
    }

    void sayHello2(String name){
        System.out.println("hello!" + name);
    }

    // 当参数个数不确定时，“...”可以用在类型相同时，采用特殊的参数语法声明，可变参数
    void sayHello3(String... name){
        System.out.println("hello!" + name);
    }
}
