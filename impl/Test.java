package impl;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            threads.add(new Thread(new ThreadImpl()));
        }
        threads.forEach(Thread::start);
        threads.forEach(t -> {
            try {
                t.join();
            } catch (InterruptedException ignored) {
            }
        });
    }

    private static class ThreadImpl implements Runnable {

        private static int counter = 0;

        @Override
        public synchronized void run() {
            int localValue = ++counter;
            System.out.println(localValue);
        }
    }
}
