
public class MyAnotherThread  extends Thread{
    public void run(){
//        reverse numbers
        for (int i=5; i>=1; i--){
            System.out.println("Another Thread: "+i);
            try {
                Thread.sleep(1000);
            }catch (Exception e){
                System.out.println(e);
            }
        }
    }
    static void main(String[] args) {
//        creating thread using thread class
         MyAnotherThread t2 = new MyAnotherThread();
         t2.start();
    }
}
