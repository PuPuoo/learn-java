package chapter05;

public class Java02_Object {
    public static void main(String[] args) {
        // TODO 常见类和对象
        // 数组

        // TODO 数组的声明方式：类型[] 变量
        // TODO 数组的创建方式：new 类型[容量]
        User2[] users = new User2[3];
        // TODO 数组的添加方式
        users[0] = new User2();

        // 二维数组
        String[][] names = new String[3][3];
        names[0][0] = "pupuoo";
        names[0][1] = "yuyuee";

    }
}

class User2 {
    public void test () {
        System.out.println("test");
    }
}
