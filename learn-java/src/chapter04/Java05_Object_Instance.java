package chapter04;

public class Java05_Object_Instance {
    public static void main(String[] args) {
        System.out.println("before");
        User2 user2 = new User2();
        System.out.println("after");

        // TODO 面向对象-构造方法
        // 如果一个类中没有任何的构造方法时，那么JVM会自动添加一个公共的，无参的构造方法，方便对象的调用
        // 构造方法名与类名完全相同
        User2 user3 = new User2("pupuoo");
        System.out.println(user3.username);

    }
}

class User2{
    String username;
    // 构造方法
    User2() {
        System.out.println("User2...");
    }

    // new之前就加载代码块
    {
        System.out.println("代码块1...");
    }

    User2(String name) {
        username = name;
    }

    {
        System.out.println("代码块2...");
    }

    void test(){
        System.out.println("test...");
    }

}
