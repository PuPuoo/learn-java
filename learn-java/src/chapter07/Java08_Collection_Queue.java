package chapter07;

import java.util.LinkedList;
import java.util.Queue;

public class Java08_Collection_Queue {
    public static void main(String[] args) {
        // TODO Queue
        // 队列 是一种 先进先出（FIFO） 的线性数据结构

        Queue<String> queue = new LinkedList<>();

        queue.offer("A"); // 入队
        queue.offer("B");
        queue.offer("C");

        System.out.println(queue.peek()); // 查看队首 → A
        System.out.println(queue.poll()); // 出队 → A
        System.out.println(queue.poll()); // 出队 → B
        System.out.println(queue.poll()); // 出队 → C
        System.out.println(queue.poll()); // 空了，返回 null
    }
}
