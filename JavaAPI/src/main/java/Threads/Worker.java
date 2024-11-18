package Threads;

public class Worker extends Thread {
    @Override
    public void run() {
        System.out.println(ASCIIColors.Green+"Thread started! Thread Name: [" + Thread.currentThread().getName()+"]");
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
                System.out.println("Thread ["+Thread.currentThread().getName()+"] Timer: "+i);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("Thread stopped! Thread Name: [" + Thread.currentThread().getName()+"]");
    }
}
