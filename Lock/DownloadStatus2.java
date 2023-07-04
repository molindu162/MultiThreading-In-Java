import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DownloadStatus2 {
    public long getTotalBytes() {
        return totalBytes;
    }

    private long totalBytes = 0;

    public void incrementBytes(){
        totalBytes++;
    }

}
