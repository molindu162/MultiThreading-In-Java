public class Runnable implements java.lang.Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " Running");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName() + " Finished");

    }
}
