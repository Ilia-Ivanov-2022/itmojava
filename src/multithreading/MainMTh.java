package multithreading;

import multithreading.twoThreads.OneThread;
import multithreading.twoThreads.Printer;
import multithreading.twoThreads.TwoThreads;

public class MainMTh {
    public static void main(String[] args) throws InterruptedException {

        Multithreading mt = new Multithreading();

        //Exercise 1. Implementation of method is in 'Multithreading Class'.
        int threadsNumber = 10;
        mt.runThreads(threadsNumber);

        //Exercise 2.
        Counter counter = new Counter();
        Exercise2 ex2 = new Exercise2();
        ex2.runThreads();

        // Exercise 3.

        Printer printer = new Printer();
        TwoThreads tt1 = new TwoThreads(printer);
        TwoThreads tt2 = new TwoThreads(printer);
        new Thread(tt1).start();
        new Thread(tt2).start();
    }
}
