package impl;

import java.util.concurrent.Callable;

public class Test2 {
    public static void main(String[] args) {
        Thread thread = new Thread(((Callable<Integer>) () -> 1 >> 2).toString());
        thread.start();
        System.out.println();

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                try {
                    System.out.println(i);
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        thread1.start();
        System.exit(0);
    }
}
