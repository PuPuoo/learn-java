package chapter07;

import java.util.LinkedList;

public class Java04_Collection_LinkedList {
    public static void main(String[] args) {
        // TODO LinkedList
        LinkedList list = new LinkedList();

        list.add("a");               // 尾部添加
        list.addFirst("head");       // 头部添加
        list.addLast("tail");        // 尾部添加（等价于 add）
        list.add(2, "middle");       // 指定索引插入

        list.remove();               // 移除第一个元素
        list.remove(1);              // 移除指定索引
        list.remove("a");            // 移除第一个匹配的对象
        list.removeFirst();          // 移除头部
        list.removeLast();           // 移除尾部

        list.get(0);                 // 根据索引获取元素
        list.getFirst();             // 获取第一个元素
        list.getLast();              // 获取最后一个元素

        list.contains("a");          // 是否包含某元素
        list.indexOf("a");           // 第一次出现的索引
        list.lastIndexOf("a");       // 最后一次出现的索引

        list.set(1, "new");          // 替换指定位置元素

        list.clear();                // 清空链表
        list.isEmpty();              // 判断是否为空
        list.size();                 // 获取链表长度

        // 1. for-each
        for (Object s : list) {
            System.out.println(s);
        }

        // 2. 普通 for
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }


        System.out.println(list.getFirst());
        System.out.println(list.getLast());
    }
}
