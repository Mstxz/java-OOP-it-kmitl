import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.*;

public class Poring implements MouseListener {
    private final JFrame frame = new JFrame("Poring");
    private JPanel panel = new JPanel();
    private JLabel poring = new JLabel();
    private JLabel countLabel = new JLabel();

    private static int poringCount = 0;
    private static final Object LOCK = new Object();
    private static final ArrayList<Poring> poringList = new ArrayList<>();

    private ImageIcon icon = new ImageIcon("C:/Users/LAB203_xx/Desktop/java-OOP-it-kmitl/JavaOOPLab13_Poring/src/image/poring.png");

    public Poring() {
        frame.setSize(200, 200);
        frame.setLayout(new BorderLayout());
        frame.add(panel);
        panel.add(poring, BorderLayout.CENTER);
        panel.add(countLabel, BorderLayout.SOUTH);

        Image newimg = icon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        ImageIcon actual_poring_icon = new ImageIcon(newimg);
        poring.setIcon(actual_poring_icon);

        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.setResizable(false);

        setRandomPosition();

        synchronized (LOCK) {
            poringList.add(this);
            poringCount++;
            updateAllCounts();
        }

        frame.setVisible(true);

        poring.addMouseListener(this);
        frame.addMouseListener(this);

        new Thread(this::shake).start();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        frame.setVisible(false);
        frame.dispose();

        synchronized (LOCK) {
            poringList.remove(this);
            poringCount--;
            updateAllCounts();
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {}

    @Override
    public void mouseReleased(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}

    private void setRandomPosition() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Random random = new Random();

        int x = random.nextInt(screenSize.width - frame.getWidth());
        int y = random.nextInt(screenSize.height - frame.getHeight());

        frame.setLocation(x, y);
    }

    public void shake() {
        final int SHAKE_DISTANCE = 10;
        final int SHAKE_DELAY = 50;

        while (frame.isVisible()) {
            Point originalLocation = frame.getLocation();
            int xOffset = (Math.random() > 0.5 ? 1 : -1) * SHAKE_DISTANCE;
            int yOffset = (Math.random() > 0.5 ? 1 : -1) * SHAKE_DISTANCE;

            frame.setLocation(originalLocation.x + xOffset, originalLocation.y + yOffset);

            try {
                Thread.sleep(SHAKE_DELAY);
            } catch (InterruptedException e) {
                e.printStackTrace();
                break;
            }
        }
    }

    private static void updateAllCounts() {
        for (Poring p : poringList) {
            p.countLabel.setText(String.valueOf(poringCount));
        }
    }
}
