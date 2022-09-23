package impl;

import impl.queue.MyQueue;

public class Main {
    public static void main(String[] args) {

        int n = 5;

        MyQueue<MyQueue<Integer>> queueOfQueue = new MyQueue<>(n);

        for (int i = 1; i <= n; i++) {
            MyQueue<Integer> item = new MyQueue<>(i);
            for (int j = 0; j < i; j++) {
                item.enqueue(j + 1);
            }
            queueOfQueue.enqueue(item);
        }

        System.out.println(queueOfQueue);
    }
}
