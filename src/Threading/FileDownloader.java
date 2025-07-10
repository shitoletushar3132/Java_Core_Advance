package Threading;

public class FileDownloader extends Thread {
    @Override
    public void run() {
        System.out.println("📥 File download started...");

        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(1000); // Simulate 1 second per chunk
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("✅ Downloaded " + (i * 10) + "%");
        }

        System.out.println("🎉 File download completed.");
    }
}

