
public class MyAnotherThread  extends Thread{
    public void run(){
//        reverse numbers
        for (int i=5; i>=1; i--){
            System.out.println("Another Thread: "+i);
            try {
                Thread.sleep(2000);
            }catch (Exception e){
                System.out.println(e);
            }
        }
    }
    static void main(String[] args) {
//        Multi threading
         MyAnotherThread t2 = new MyAnotherThread();
         MyThread thread = new MyThread();
         Thread t1 = new Thread(thread);
         t2.start();
         t1.start();
    }
}
