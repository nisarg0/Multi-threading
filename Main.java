public class Main {
    public static void main(String[] args) {
        MonitoredLockExample obj = new MonitoredLockExample();

        MonitoredThread1Runnable runnableObj = new MonitoredThread1Runnable(obj);
        Thread t1 = new Thread(runnableObj);

        // Same as Thread1  but with Lambda instead
        Thread t2 = new Thread(obj::task2);
        Thread t3 = new Thread(obj::task3);

        t1.start();
        t2.start();
        t3.start();

    }
}
