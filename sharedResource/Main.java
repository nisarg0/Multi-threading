package sharedResource;

public class Main {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();

        Thread producerThread = new Thread(() -> {
            try {
                Thread.sleep(5000); // Added sleep to ensure consumer thread is invoked first and then producer thread
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            sharedResource.addItem();
        });
        Thread consumerThread = new Thread(sharedResource::removeItem);

        // If producer thread prod
        producerThread.start();
        consumerThread.start();

    }
}
