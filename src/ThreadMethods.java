public class ThreadMethods extends Thread {
    //java methods:- run(), start(), sleep(), join(),
    public void run(){
        System.out.println("Thread is running....");
        for (int i=1; i<=5; i++){
            System.out.println(i);
            try {
                sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Thread executed");
    }
    static void main(String[] args) throws InterruptedException {
          ThreadMethods t1 = new ThreadMethods();
          t1.start();
          t1.join();//using this we'll stop for t1 to finish then we'll print hello otherwise it'll print hello first
        System.out.println("hello");

    }
}
