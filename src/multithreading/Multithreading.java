package multithreading;

public class Multithreading implements Runnable{
    Multithreading(){}

    @Override
    public void run() {
        try{
            for(int i = 0; i < 100; i++){
                System.out.println("Thread: " + Thread.currentThread().getId()
                + ", state while running: " + Thread.currentThread().getState() +
                        ", counting: " + i);
                Thread.yield();
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void runThreads(int threadsNumber){

        try{
            for(int i = 0; i < threadsNumber; i++){
                Thread mthread = new Thread(new Multithreading());
                System.out.println("Thread: " + mthread.getId() + ", state before the start: " + mthread.getState());
                mthread.start();
                System.out.println("Thread: " + mthread.getId() + ", state after the start: " + mthread.getState());
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

}
