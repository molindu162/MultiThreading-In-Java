import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args){
        List<Thread> threads2 = new ArrayList<>();

        DownloadStatus2 status2 = new DownloadStatus2();
        DownloadTask2 task2 = new DownloadTask2(status2);
        for (int i = 0; i < 5; i++){
            Thread thread = new Thread(task2);
            threads2.add(thread);
            thread.start();
        }

        for (Thread t: threads2){
            try {
                t.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println(status2.getTotalBytes());

    }
}
