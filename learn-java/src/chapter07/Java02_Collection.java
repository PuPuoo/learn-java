package chapter07;

import java.util.ArrayList;

public class Java02_Collection {
    public static void main(String[] args) {
        // TODO ArrayList 数组 + 列表

        // 创建集合对象
        ArrayList list = new ArrayList(); // 底层数组为空
        ArrayList list2 = new ArrayList(3); // 传入数组长度

        // 增加数据
        // 添加数据时，如果集合中没有任何数据，则会自动开辟长度为10的数组
        list.add("pupu");
        list.add("yuyu");

        // 打印集合
        System.out.println(list);

        // 获取集合中数据的个数
        System.out.println(list.size());

        // 获取指定位置的数据
        System.out.println(list.get(0));

        // 遍历集合
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        for (Object obj : list) {
            System.out.println(obj);
        }

        // 修改集合
        // 方法会返回结果，更新前的值
        System.out.println(list.set(0, "pupuoo"));

        // 删除数据
        // 会返回删除的数据
        System.out.println(list.remove(0));
    }
}
