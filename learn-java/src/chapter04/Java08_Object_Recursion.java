package chapter04;

public class Java08_Object_Recursion {
    public static void main(String[] args) {
        // TODO 面向对象-递归
        // 方法调用自身，称之为递归方法
        // 1 + 3 + 5 + 7 + 9 + ... + 19
        int res = computeAP(10);
        System.out.println(res);

        // 1. 递归方法要有跳出的逻辑
        // 2. 调用自身时，传递的参数需要有规律

    }

    public static int computeAP(int num) {
        num = num % 2 == 0? num - 1 : num;

        if (num == 1) {
            return 1;
        } else {
            return num + computeAP(num - 2);
        }
    }
}
