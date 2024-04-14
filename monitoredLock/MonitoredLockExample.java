package monitoredLock;

public class MonitoredLockExample {

    public synchronized void task1()  {
        try {
            System.out.println("Task1: Inside Task1");
            Thread.sleep(1000);
            System.out.println("Task1: Exiting Task1");
        } catch (Exception ex) {
            // exception
        }
     }
    public void task2() {
        System.out.println("Task2: Before running synchronized");
        synchronized (this) {
            System.out.println("Task2: Inside synchronized");
        }
    }
    void task3() {
        System.out.println("Task3");
    }


}
