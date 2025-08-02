package chapter03;

public class Java02_FlowControl {
    public static void main(String[] args) {
        // TODO 流程控制
        // 1. 重复执行 while
        System.out.println("第一步");
        int age = 30;
        while (age < 40) {
            System.out.println("循环ing");
            age++;
        }

        // 2. do...while
        /*
            基本用法结构：
            do {
                循环代码
            } while (条件表达式)
         */
        // 与while区别是，循环代码至少执行一次
        do {
            System.out.println("循环2ing");
        } while (age < 40);

        // 3. for
        for (int i = 0; i <= age; i++) {
            System.out.println("循环3ing");
        }
    }
}
