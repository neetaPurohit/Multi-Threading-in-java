package ThreadMethods;
//daemon thread runs in background
public class SetDaemon extends Thread{
     public void run(){
         while (true){
             System.out.println("hello world");
         }
     }

    static void main(String[] args) {
       SetDaemon t1 = new SetDaemon();
       t1.setDaemon(true);//a low-priority background thread that supports user threads (like the Garbage Collector)
                         // and is automatically terminated by the JVM as soon as all user threads finish execution

       t1.start();//runnable state
       System.out.println("Main done");
    }
}
