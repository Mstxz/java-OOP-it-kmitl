import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Poring implements MouseListener {
    private final JFrame frame = new JFrame("Poring");
    private JPanel panel = new JPanel();
    private JLabel poring = new JLabel();
    private JLabel countLabel = new JLabel();

    private ImageIcon icon = new ImageIcon(getClass().getResource("/image/poring.png"));

    public Poring(int count, int x, int y){
        frame.setSize(300, 200);
        poring.setBackground(new Color(0,0,0,0));
        frame.add(poring, BorderLayout.CENTER);
        frame.add(countLabel, BorderLayout.EAST);
        countLabel.setText(String.format("%d", count));

        Image newimg = icon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        ImageIcon actual_poring_icon = new ImageIcon(newimg);

        poring.setIcon(actual_poring_icon);
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.setVisible(true);

        poring.addMouseListener(this);

        //shake();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        frame.dispose();
    }

    @Override
    public void mousePressed(MouseEvent e) {}
    @Override
    public void mouseReleased(MouseEvent e) {}
    @Override
    public void mouseEntered(MouseEvent e) {}
    @Override
    public void mouseExited(MouseEvent e) {}

    public void shake(){
        
    }
}
