class GrindCoffee extends Thread {
    public void run() {
        try {
            System.out.println("Grinding coffee beans...");
            Thread.sleep(2000); // 2 sec
            System.out.println("✔ Coffee beans grounded.");
        } catch(Exception e) {}
    }
}

class HeatWater extends Thread {
    public void run() {
        try {
            System.out.println("Heating water...");
            Thread.sleep(3000); // 3 sec
            System.out.println("✔ Water heated.");
        } catch(Exception e) {}
    }
}

class MixCoffee extends Thread {
    Thread t1, t2;

    MixCoffee(Thread t1, Thread t2){
        this.t1 = t1;
        this.t2 = t2;
    }

    public void run() {
        try {
            t1.join();  // wait for grinding
            t2.join();  // wait for water heating
            System.out.println("Mixing water and coffee...");
            Thread.sleep(1500);
            System.out.println("☕ Coffee is ready! Enjoy!");
        } catch(Exception e) {}
    }
}

public class CoffeeMachine {
    public static void main(String[] args) {
        GrindCoffee g = new GrindCoffee();
        HeatWater h = new HeatWater();

        MixCoffee m = new MixCoffee(g, h);

        // Start in parallel
        g.start();
        h.start();
        m.start();
    }
}
