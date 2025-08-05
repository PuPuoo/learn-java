package chapter05;

import java.util.Locale;

public class Java06_String {
    public static void main(String[] args) {
        // TODO 字符串
        // java.lang.String类
        char[] chars = {'a','b','c'};

        String s = new String(chars);
        System.out.println(s);

        // TODO 字符串拼接 + concat
        // 将多个字符串连接在一起
        // 1. +
        String s1 = "a" + "b";
        String s2 = "c";

        // 2. concat
        String s3 = s1.concat(s2);
        System.out.println(s3);

        // TODO 字符串比较 equals equalsIgnoreCase compareTo
        String s4 = "a";
        String s5 = "b";
        // 相等
        System.out.println(s4.equals(s5));
        // 忽略大小写的相等
        System.out.println(s4.equalsIgnoreCase(s5));
        // i > 0, s4 > s5
        // i < 0, s4 < s5
        // i = 0, s4 = s5
        int i = s4.compareTo(s5);
        System.out.println(i);

        // TODO 字符串截断 substring split trim
        String s6 = "Hello world";
        System.out.println(s6.substring(0,5));
        System.out.println(s6.substring(0, "hello".length()));

        // 分解字符串
        String[] ss = s6.split(" ");
        for (String sss : ss) {
            System.out.println(sss);
        }

        // 去掉首尾空格
        System.out.println(" 123 456 ".trim());

        // TODO 字符串替换 replace replaceAll
        System.out.println(s6.replace("world", "java"));

        // 整体替换
        System.out.println(s6.replaceAll("world|pupu", "yuyu"));


        // TODO 字符串大小写转换 toLowerCase toUpperCase
        System.out.println(s6.toLowerCase());
        System.out.println(s6.toUpperCase());
        String className = "user";
        String s7 = className.substring(0,1);
        String s8 = className.substring(1);
        System.out.println(s7.toUpperCase() + s8);


        // TODO 字符串查找 indexOf lastIndexOf contains startsWith endsWith isEmpty
        char[] chars2 = s6.toCharArray();
        for (char c1:chars2) {
            System.out.println(c1);
        }

        // 获取字符串中第一次出现的索引位置
        System.out.println(s6.indexOf("Hello"));
        // 获取字符串中最后一次出现的索引位置
        System.out.println(s6.lastIndexOf("Hello"));
        // 是否包含子串
        System.out.println(s6.contains("Hello"));
        // 判断是否以指定子串开头
        System.out.println(s6.startsWith("Hello"));
        // 判断是否以指定子串结尾
        System.out.println(s6.endsWith("world"));
        // 判断是否为空
        System.out.println(s6.isEmpty());

        // TODO StringBuilder 构建字符串
        // 为什么用 StringBuilder 而不用 String？
        // Java 中的 String 是不可变对象，每次修改都会创建新对象，效率低。
        StringBuilder srr = new StringBuilder();
        srr.append("abc");
        System.out.println(srr);

        // 反转字符串
        System.out.println(srr.reverse());

        // 插入
        System.out.println(srr.insert(3,"d"));


    }
}
