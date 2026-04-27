
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
    static void main(String[] args) throws InterruptedException {
//        Multi threading
         MyAnotherThread t2 = new MyAnotherThread();
         MyThread thread = new MyThread();
         Thread t1 = new Thread(thread);
        System.out.println(t1.getState());
         t2.start();
        System.out.println(t1.getState());
         t1.start();

         t1.join();//main method will wait for t1 to get finish.
        System.out.println(t1.getState());
    }
}
