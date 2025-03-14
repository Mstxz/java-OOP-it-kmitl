import java.awt.*;
import javax.swing.*;

public class MyTimer extends JLabel implements Runnable {
    private int hour = 0;
    private int min = 0;
    private int sec = 0;

    @Override
    public void run() {
        while (true) {
            sec++;
            if(sec == 60){
                min++;
                sec = 0;
            }

            if (min == 60){
                hour++;
                min = 0;
            }

            setText(String.format("%02d : %02d : %02d", hour, min, sec));
            setFont(new Font("Arial", Font.PLAIN, 72));

            try {
                Thread.sleep(1000);  // Pause for 1 second
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); // Properly handle interruption
                break;
            }
        }
    }
}
