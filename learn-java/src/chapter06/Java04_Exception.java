package chapter06;

public class Java04_Exception {
    public static void main(String[] args) throws Exception{
        User4 user4 = new User4();

        int i = 10;
        int j = 0;

        user4.test(i, j);
    }
}

class User4 {
    public void test(int i, int j) throws Exception{
        // 如果方法中可能会出现问题，那么需哟提前声明，告诉其他人，我的方法可能会出问题
        // throws

        // 如果程序中需要手动抛出异常对象，那么需要throw，然后new出异常对象
        try {
            System.out.println(i / j);
        } catch (ArithmeticException e) {
            throw new Exception();
        }
    }
}
