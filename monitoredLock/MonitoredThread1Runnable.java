package monitoredLock;

public class MonitoredThread1Runnable implements Runnable {
    MonitoredLockExample obj;
    public MonitoredThread1Runnable(MonitoredLockExample obj) {
        this.obj = obj;
    }

    @Override
    public void run() {
        obj.task1();
    }
}
