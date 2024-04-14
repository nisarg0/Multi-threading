package sharedResource;

public class SharedResource {
    boolean isItemPresent = false;

    public synchronized void addItem() {
        System.out.println("Producer Thread calling notify method");
        isItemPresent = true;

        // ALl the threads which are waiting on the resource will be invoked
        notifyAll();
    }

    public synchronized void removeItem() {
        System.out.println("Consumer Thread trying to consume Item");
        // used while and not if to avoid any spurious wakeup
        while (!isItemPresent) {
            try{
                System.out.println("Consumer Thread waiting for item to be consumed");
                wait(); // release all the monitored locks
            } catch (Exception e){
                // exception
            }
        }
        System.out.println("Consumer Thread item successfully consumed");
        isItemPresent = false;
    }
}
