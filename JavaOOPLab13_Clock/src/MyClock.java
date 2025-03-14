import java.awt.*;
import java.util.Calendar;
import javax.swing.*;

public class MyClock extends JLabel implements Runnable {
    @Override
    public void run() {
        while (true) {
            Calendar d = Calendar.getInstance();

            int sec = d.get(Calendar.SECOND);
            int min = d.get(Calendar.MINUTE);
            int hour = d.get(Calendar.HOUR_OF_DAY);

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
