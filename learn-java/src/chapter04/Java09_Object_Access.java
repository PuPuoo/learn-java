package chapter04;

public class Java09_Object_Access {
    public static void main(String[] args) {
        // TODO 面向对象-访问权限
        // public: 公共的，访问权限修饰符
        // java源码中公共类只有一个，而且必须和源码文件名相同
        // main: main方法是JVM调用的，JVM调用时应该可以任意调用，而不用考虑权限问题

        // TODO Java中的访问权限主要分为 4 种

        // 1. public: 公共的，任意使用
        // 2. default: 默认权限，当不设定任何权限时，会默认提供权限，包(相同路径)权限
        // 3. protected: 受保护的权限，子类可以访问
        // 4. private: 私有的，同一个类中可以使用



    }
}

class User3 {
    private String name;
}