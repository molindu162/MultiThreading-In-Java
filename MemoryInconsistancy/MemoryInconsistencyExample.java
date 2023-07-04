import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MemoryInconsistencyExample {
    private static int counter = 0;
    private static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        Thread thread1 = new IncrementThread();
        Thread thread2 = new ReadThread();

        thread1.start();
        thread2.start();
        System.out.println(list);
    }

    static class IncrementThread extends Thread {
        Lock lock = new ReentrantLock();
        @Override
        public void run() {
            for (int i = 0; i < 1000000; i++) {
                lock.lock();
                counter++;
                lock.unlock();
            }
        }
    }

    static class ReadThread extends Thread {
        Lock lock = new ReentrantLock();
        @Override
        public void run() {
            for (int i = 0; i < 1000000; i++) {
                if (counter % 2 == 1) {
                    System.out.println("Counter is odd: " + counter);
                    list.add(counter);
                }
            }
        }
    }
}