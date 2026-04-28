public class ThreadMethod {
    public void run(){
        for (int i=1; i<=5; i++){
            System.out.println(Thread.currentThread().getName() + "-Priority: "+Thread.currentThread().getPriority() +
                    "count: " + i);
            try {
                Thread.sleep(1000);
            }catch (Exception e){
                System.out.println(e);
            }
        }
    }

    static void main(String[] args) {

    }
}
