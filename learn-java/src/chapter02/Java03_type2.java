package chapter02;

public class Java03_type2 {
    public static void main(String[] args) {
        // TODO 数据类型的转换
        byte b = 10;

        short s = b;

        int i = s;

        long l = i;

        float f = l;

        double d = f;

        // 范围小的数据可以直接转换为范围大的数据，但是数据大的数据无法直接转换成小的
        // 可以用强制转换
        int i1 = (int) d;

    }
}
