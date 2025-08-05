package chapter06;

public class Java01_Exception {
    public static void main(String[] args) {
        // TODO 错误
        // 1. 类型转换出现了错误
        /*String s = "123";
        Integer i = (Integer) s;*/

        // 2. 递归没有跳出的逻辑：StackOverflowError 严重问题（系统级错误）
        // 尽量避免
        // test();

        // 3. 访问一个为空的对象的成员方法时，出现了错误：NullPointerException(异常) 可处理的问题（程序级异常）
        // 3.1 可以通过代码恢复正常逻辑执行的异常，称之为运行期异常：RuntimeException
        // 3.2 不可以通过代码恢复正常逻辑执行的异常，称之为编译器异常: Exception
        User user = null;
        System.out.println(user.toString());


    }

    public static void test() {
        test();
    }
}

class User {

}
