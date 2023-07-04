import java.util.ArrayList;
import java.util.List;

public class Main1 {
    public static void main(String[] args){

        List<DownloadStatus> statusList = new ArrayList<>();
        List<Thread> threads = new ArrayList<>();

        for (int i = 0; i < 5; i++){
            DownloadTask task = new DownloadTask();
            Thread thread = new Thread(task);
            threads.add(thread);
            thread.start();
        }

        for (Thread t: threads){
            try {
                t.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        long totalDownloadedBytes = 0;

        for (DownloadStatus s: statusList){
            totalDownloadedBytes += s.getTotalBytes();
        }

        System.out.println(totalDownloadedBytes);
    }
}
