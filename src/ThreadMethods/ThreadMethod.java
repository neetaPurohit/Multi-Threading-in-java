package ThreadMethods;

public class ThreadMethod extends Thread{
//    call Constructor of Thread class
    public ThreadMethod(String name){
        super(name);
    }

    public void run(){
        for (int i=1; i<=5; i++){
            String a = "";
            for (int j=0; j<=100000; j++){
                a+="a";
            }
            System.out.println(Thread.currentThread().getName() + "-Priority:"+Thread.currentThread().getPriority() +
                    " count: " + i);
            try {
                Thread.sleep(1000);
            }catch (Exception e){
                System.out.println(e);
            }
        }
    }

    static void main(String[] args) {
        ThreadMethod t1 = new ThreadMethod("low priority thread");
        ThreadMethod t2 = new ThreadMethod("medium priority thread");
        ThreadMethod t3 = new ThreadMethod("high priority thread");
//       set priority of threads which thread runs first
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);
       t1.start();
       t2.start();
       t3.start();
    }
}
