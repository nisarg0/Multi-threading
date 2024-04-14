package joinThread;

public class Worker {
    public synchronized void taks() {
        try {
            System.out.println("Task: Inside Task");
            Thread.sleep(1000);
            System.out.println("Task: Exiting Task");
        } catch (Exception ex) {
            // exception
        }
    }
}
