package chapter07;

import java.util.HashMap;
import java.util.Map;

public class Java09_Collection_HashMap {
    public static void main(String[] args) {
        // TODO HashMap 基于哈希表的 Map 实现类
        // 每个元素都是一个 键值对（key → value）
        // 支持 null 键 和 null 值
        // key 不可重复，value 可以重复

        // 1. 添加和读取元素
        HashMap<String, Integer> map = new HashMap<>();
        map.put("apple", 10);
        map.put("banana", 5);
        map.put("orange", 7);

        // 获取
        System.out.println(map.get("apple"));

        // 2. key 不可重复（新值会覆盖旧值）
        map.put("banana", 15);
        System.out.println(map.get("banana")); // 15（原来是 5，被覆盖了）

        // 3. 删除元素
        map.remove("apple");
        System.out.println(map.containsKey("apple")); // false

        // 4. 遍历
        /*
            keySet()	返回所有 key 的集合
            values()	返回所有 value 的集合
            entrySet()	返回所有键值对的集合（Map.Entry）
         */
        for (String key : map.keySet()) {
            System.out.println(key + " = " + map.get(key));
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}
