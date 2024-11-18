package Threads;

public class ThreadExample {
    public static void main(String[] args) {
        System.out.println("\u001b[30m Started ! Thread: [ " + Thread.currentThread().getName()+" ]");
        Worker worker = new Worker();
        worker.setName("WorkerThread1");
        worker.start();
        WorkerRunnable runnable = new WorkerRunnable();
        Thread thread = new Thread(runnable);
        thread.setName("WorkerRunnableThread1");
        thread.start();

        for (int i = 5; i >= 0; i--) {
            try{
                Thread.sleep(1000);
                System.out.println("Thread ["+Thread.currentThread().getName()+"] Timer: "+i);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("Thread stopped! Thread Name: [" + Thread.currentThread().getName()+"]");

        new Thread(new Runnable() {
            public void run() {
                for (int i = 2; i >= 0; i--) {
                    try{
                        Thread.sleep(1000);
                        System.out.println("Thread ["+Thread.currentThread().getName()+"] Timer: "+i);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }
}
