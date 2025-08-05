package chapter06;

public class Java05_Exception {
    public static void divide(int a, int b) {
        if (b == 0) {
            throw new MyRuntimeException("除数不能为0！");
        }
        System.out.println("结果：" + a / b);
    }

    public static void main(String[] args) {
        try {
            divide(10, 0);
        } catch (MyRuntimeException e) {
            System.out.println("运行时异常：" + e.getMessage());
        }
    }
}

class MyRuntimeException extends RuntimeException {
    public MyRuntimeException(String message) {
        // 调用父类的构造方法
        // 必须放在构造函数第一行
        super(message);
    }
}