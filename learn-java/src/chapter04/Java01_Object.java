package chapter04;

public class Java01_Object {
    public static void main(String[] args) {
        // TODO 面向对象
        // 围绕事或物为中心来进行分析

        // 类和对象
        // 类表示归纳和整理
        // 对象表示具体的事物

        // TODO class(类)
        /*
            class 类名{
                特征(属性)
                功能(方法)
            }
         */

        // 做一道菜：红烧排骨
        // 类：菜，对象：红烧排骨

        // TODO 1. 先声明类
        // class 类名
        // TODO 2. 创建对象
        Cooking cooking = new Cooking();
        // TODO 3. 声明属性
        cooking.name = "红烧排骨";
        cooking.food = "排骨";
        // TODO 4. 声明方法
        // void 方法名
        // TODO 5. 执行方法
        cooking.execute();

    }
}

class Cooking {
    // 属性
    String name;
    String food;

    // 方法
    void execute() {
        System.out.println("准备食材: " + food);
    }
}