package multithreading.twoThreads;

public class Printer {

    private volatile boolean isReady;

    synchronized void printThreadName(){
        while (isReady){
            try{
                wait();
            }catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("Thread name is " + Thread.currentThread().getName());
        notify();
    }


}
