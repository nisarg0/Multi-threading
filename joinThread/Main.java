package joinThread;

public class Main {
    public static void main(String[] args) {
        Worker worker = new Worker();
        Thread t1 = new Thread(worker::taks);
        System.out.println("Main Thread");

        t1.start();
        try {
            t1.join(); // Makes invoking thread (Main wait here for t1 to finish)
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Main: Exiting Main");
    }
}
