package multithreading.twoThreads;

public class TwoThreads implements Runnable{

    private Printer printer;

    public TwoThreads(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void run() {
        while (Thread.currentThread().isAlive()){
            printer.printThreadName();
        }
    }
}
