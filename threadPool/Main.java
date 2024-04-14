package threadPool;

import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {


//        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 4,
//                10, TimeUnit.MINUTES, new ArrayBlockingQueue<>(2), new CustomThreadFactory,
//                new ThreadPoolExecutor.DiscardOldestPolicy()
//        );
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 4,
                10, TimeUnit.MINUTES, new ArrayBlockingQueue<>(2), new CustomThreadFactory(),
                new CustomRejectedHandler()
        );

        // Only allows to stop the thread after timeout if this is true.
        // threadPoolExecutor.allowsCoreThreadTimeOut(true);

        for (int i=0;i<7;i++) {

            threadPoolExecutor.submit(() -> {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(Thread.currentThread().getName() + " is working");
            });
        }
        threadPoolExecutor.shutdown();
    }
}

class CustomThreadFactory implements ThreadFactory {

    @Override
    public Thread newThread(Runnable runnable) {
        Thread th = new Thread(runnable);
        th.setPriority(Thread.NORM_PRIORITY);
        th.setDaemon(false);
//        th.setName("CustomThreadFactory");
        return th;
    }
}

class CustomRejectedHandler implements RejectedExecutionHandler {

    @Override
    public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        System.out.println("Rejected: " + runnable.toString());
    }
}