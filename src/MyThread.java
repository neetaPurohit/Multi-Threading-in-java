public class MyThread implements Runnable{
    @Override
    public void run() {
//        task for thread
        for (int i=0; i<=10; i++){
            System.out.println("value of i is: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    static void main(String[] args) {
//        create object of myThread class ( this is also a user thread , the thread who do our work)
        MyThread t1 = new MyThread();

        Thread thread = new Thread(t1);
        thread.start();
    }
}
