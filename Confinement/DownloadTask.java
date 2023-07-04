public class DownloadTask implements java.lang.Runnable {
    public DownloadStatus2 getStatus() {
        return status;
    }

    private DownloadStatus2 status;
    public DownloadTask() {
        status = new DownloadStatus2();
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++){
            status.incrementBytes();
        }
    }

}
