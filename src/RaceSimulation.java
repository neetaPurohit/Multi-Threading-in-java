import java.util.Random;

class Racer extends Thread {
    private static boolean winnerFound = false;  // shared variable
    private int distanceCovered = 0;
    private final int totalDistance = 100;
    private final Random rand = new Random();

    Racer(String name) {
        super(name);
    }

    @Override
    public void run() {
        while (distanceCovered < totalDistance && !winnerFound) {
            try {
                int speed = rand.nextInt(20) + 1; // speed between 1–20
                distanceCovered += speed;

                System.out.println(getName() + " → " + distanceCovered + " meters");

                Thread.sleep(rand.nextInt(200) + 100); // random delay 100–300ms
            }
            catch (Exception e) {}

            if (distanceCovered >= totalDistance && !winnerFound) {
                declareWinner();
            }
        }
    }

    // synchronized to ensure only 1 winner declared
    private synchronized void declareWinner() {
        if (!winnerFound) {
            winnerFound = true;
            System.out.println("\n🏆 WINNER: " + getName() + " !!! 🏆\n");
        }
    }
}


public class RaceSimulation {
    public static void main(String[] args) {
        System.out.println("🏁 Race Starting in 3...2...1...\n");

        Racer r1 = new Racer("⚡ Bolt");
        Racer r2 = new Racer("🚀 Rocket");
        Racer r3 = new Racer("🐆 Cheetah");
        Racer r4 = new Racer("🐢 Turtle");
        Racer r5 = new Racer("🔥 Flash");

        r1.start();
        r2.start();
        r3.start();
        r4.start();
        r5.start();

        // Wait for race to finish
        try {
            r1.join();
            r2.join();
            r3.join();
            r4.join();
            r5.join();
        } catch (Exception e) {}

        System.out.println("🎉 Race Over! Thank you for watching!");
    }
}