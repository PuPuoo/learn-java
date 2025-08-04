package chapter04;

// TODO 单例模式
// 这段代码实现了一个 “单例模式”的基本写法，意思是：一个类只能有一个实例。

public class Java09_Object3 {
    public static void main(String[] args) {
        User4 instance = User4.getInstance();
        User4 instance2 = User4.getInstance();
        User4 instance3 = User4.getInstance();
        User4 instance4 = User4.getInstance();
        // User4 user4 = new User4();
        // 这样就new不了了
    }
}

class User4 {
    // 用 private 是为了防止外部直接访问或修改这个变量，确保类的封装性和安全性。
    private static User4 user4 = null; // 静态变量，只存一份，用来存唯一对象

    private User4() {
        // 私有构造器，禁止外部 new
    }

    /*
        public User() {
            // 默认构造方法，什么都不做
        }
     */

    public static User4 getInstance() {
        if (user4 == null) {
            user4 = new User4();
        }
        return user4; // 返回唯一对象
    }
}
