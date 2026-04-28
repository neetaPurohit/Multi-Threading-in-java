package ThreadMethods;

public class YieldMethod extends Thread {
    public YieldMethod(String name){
        super(name);
    }
   public void run(){
       for (int i=1; i<5; i++){
           System.out.println(Thread.currentThread().getName() + " is running");
           Thread.yield();//give chance to another thread
       }
   }
    static void main(String[] args) throws InterruptedException{
       YieldMethod t1 = new YieldMethod("t1");
       YieldMethod t2 = new YieldMethod("t2");
       t1.start();
       t2.start();

    }
}
