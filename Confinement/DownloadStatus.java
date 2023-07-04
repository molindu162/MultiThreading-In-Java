public class DownloadStatus {
    private long totalBytes;
    public long getTotalBytes() {
        return totalBytes;
    }

    public void incrementBytes(){
        totalBytes++;
    }
}
