package chapter07;

import java.util.*;

public class Java09_Collection_Iterator {
    public static void main(String[] args) {
        // TODO 迭代器 Iterator
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");

        // remove()	删除当前元素（只能在调用 next() 之后使用）

        // list迭代器
        Iterator<String> it = list.iterator();
        while (it.hasNext()) { // 是否还有元素
            String s = it.next(); // 取出下一个元素
            System.out.println(s);
        }

        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);

        // map迭代器
        // ❌（不能直接）→ 可以通过 entrySet()、keySet() 等获取迭代器
        Iterator<Map.Entry<String, Integer>> it2 = map.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry<String, Integer> kv = it2.next();
            System.out.println(kv.getKey() + " = " + kv.getValue());
        }
    }
}
