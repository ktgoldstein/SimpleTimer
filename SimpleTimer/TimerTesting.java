import java.util.Scanner;

/**
 * Utility class for testing SimpleTimer class.
 * 
 * @author ktgoldstein
 *
 */
public class TimerTesting {
    public static void main(String[] args) {
        SimpleTimer timer = new SimpleTimer();
        timer.start();

        for (int i = 0; i < 10000000; i++) {
            for (int j = 0; j < 10000000; j++) {
                //pointless loop
            }
        }

        double curr = timer.getCurrentTime(TimeUnit.MILLI);
        System.out.println("Current time: " + curr + " Milliseconds");
        System.out.print("[Press enter.]");
        Scanner in = new Scanner(System.in);
        in.nextLine();
        timer.stop();

        System.out.println("Final Time: " + timer.getFinalTime(TimeUnit.MILLI)
                + " Milliseconds");

        double diff = timer.getFinalTime(TimeUnit.MILLI) - curr;

        System.out.println("Time it took for you to respond to input: " + diff
                + " Milliseconds");
        in.close();
    }
}