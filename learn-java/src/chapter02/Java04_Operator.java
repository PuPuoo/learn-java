package chapter02;

public class Java04_Operator {
    public static void main(String[] args) {
        // TODO 运算符

        // TODO 算术运算符
        // 1. 二元运算法 两个元素参与运算
        // 最小使用的类型为 int 类型
        System.out.println(1 + 2);
        System.out.println(2 - 2);
        System.out.println(3 * 2);
        System.out.println(4 / 2);
        System.out.println(1 / 2); // int / int = int
        System.out.println(1.0 / 2); // double / int = double
        System.out.println(5 % 2); // 取余

        byte b1 = 10;
        byte b2 = 10;
        byte b3 = (byte) (b1 + b2); // 最小使用的类型为 int 类型，得强制转换，可小转大，大转小得强制转换

        // 2. 一元运算符 一个元素参与运算
        // ++, --
        int i = 0;
        // int j = i;
        // i = i + 1;
        int j = i++; // 先赋值，再 + 1
        int k = ++i; // 先 + 1，再赋值

        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);



    }
}
