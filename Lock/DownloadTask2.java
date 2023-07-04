import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DownloadTask2 implements java.lang.Runnable {
    private DownloadStatus2 status2;
    private Lock lock = new ReentrantLock();


    public DownloadTask2(DownloadStatus2 status2) {
        this.status2 = status2;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++){
            lock.lock();
            status2.incrementBytes();
            lock.unlock();
        }
    }
}
