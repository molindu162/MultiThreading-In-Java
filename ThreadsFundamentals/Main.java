public class Main {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());

        for (int i = 0; i < 5; i++){
            Thread thread = new Thread(new Runnable());
            thread.start();
            try {
                thread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Active No of threads " + Integer.toString(Thread.activeCount()));
        }



        System.out.println(Thread.activeCount());
    }
}