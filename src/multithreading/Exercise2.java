package multithreading;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class Exercise2 implements Runnable{

    private final int countLimit = 1000;
    private final int threadPoolSize = 100;
    private static final Counter counter = new Counter();
    private final CountDownLatch countDownLatch = new CountDownLatch(100);

    public static final Integer returnCounter(){
        return counter.getCount();
    }

    @Override
    public void run() {
        try{
            for(int i = 0; i < countLimit; i++){
                increaseCounter();
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void increaseCounter(){
        synchronized (counter){
            counter.increment();
            System.out.println(returnCounter() + " id " + Thread.currentThread().getId());
        }
        if(Thread.currentThread().isAlive() == false){
            System.out.println("The last count: " + returnCounter() + ", thread name: " + Thread.currentThread().getName());
        }
    }

    public void runThreads(){

//        ExecutorService executorService = Executors.newFixedThreadPool(threadPoolSize);
//        for (int i = 0; i < threadPoolSize; i++) {
//            executorService.submit(new Exercise2());
//        }
//        executorService.shutdown();

        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                for (int j = 0; j < 1000; j++) {
                    synchronized (this) {
                        counter.increment();
                        System.out.println("counter: " + counter.getCount());
                    }
                }
                countDownLatch.countDown();
            }).start();
        }
        new Thread(() -> {
            try {
                countDownLatch.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Counter: " + counter.getCount());
        }).start();
    }
}
