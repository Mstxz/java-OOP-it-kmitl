
import javax.swing.*;

public class MainFrame {
    private JFrame frame = new JFrame("Timer and Clock");
    private MyClock clock = new MyClock();
    private MyTimer timer = new MyTimer();
    
    public MainFrame(){
        frame.setSize(400, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        frame.add(timer);
        Thread clockThread = new Thread(timer);
    
        clockThread.start();
    }

    public static void main(String[] args) {
        new MainFrame();
    }
}
