package chapter07;

import java.util.ArrayList;

public class Java03_Collection_ArrayList {
    public static void main(String[] args) {
        // TODO ArrayList 数组 + 列表

        ArrayList list = new ArrayList();
        ArrayList list2 = new ArrayList();

        list.add("pupu");
        list.add("yuyu");
        list.add("didi");

        list2.add(1);
        list2.add(2);
        list2.add(3);

        // 指定位置加数据
        list.add(1, "yiyi");

        // 加集合
        list.addAll(list2);

        // 集合数量
        System.out.println(list.size());
        System.out.println(list.isEmpty());

        // 清空数据
        // list.clear();
        // 删除指定集合中的数据
        list.removeAll(list2);

        // 是否包含指定数据
        System.out.println(list.contains("pupu"));

        // 查询数据的索引，不存在返回-1
        System.out.println(list.indexOf("pupu"));
        System.out.println(list.lastIndexOf("pupu"));

        // 复制一份新集合
        Object clone = list.clone();
        ArrayList list1 = (ArrayList) clone;

        System.out.println(list);
    }
}
