package ThreadMethods;

public class InterruptMethod extends Thread{
    public void run(){
        try{
            sleep(1000);
            System.out.println("Thread is running...");
        }catch (Exception e){
            System.out.println("Thread interrupted: " + e);
        }
    }
    static void main(String[] args) {
          InterruptMethod t1 = new InterruptMethod();
          t1.start();
          t1.interrupt();
    }
}
