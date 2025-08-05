package chapter06;

public class Java03_Exception {
    public static void main(String[] args) {
        // TODO 常见异常
        // 1. 除数为0的算术异常 ArithmeticException

        // 2. 空指针异常 NullPointerException
        User3 user3 = null;
//        System.out.println(user3.toString());

        // 3. 索引越界 ArrayIndexOutOfBoundsException
        String[] names = new String[3];
//        names[4] = "pupu";

        // 4. 字符串索引越界 StringIndexOutOfBoundsException
        String s1 = "abc";
//        System.out.println(s1.charAt(3));

        // 5. 格式化异常 NumberFormatException
        String s2 = "a123";
//        Integer i = Integer.parseInt(s2);

        // 6. 类型转换错误：ClassCastException
        Object obj = new User3();
        if (obj instanceof Emp5) {
            Emp5 emp5 = (Emp5) obj;
        }
    }
}
class User3 {

}

class Emp5 {

}