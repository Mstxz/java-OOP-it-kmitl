import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class PoringConstructor implements ActionListener {
    private final JFrame frame = new JFrame("Poring Poring");
    private JButton button = new JButton("Click");
    private JPanel panel = new JPanel();
    private Random r = new Random();

    public PoringConstructor() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.add(panel);
        panel.add(button, BorderLayout.CENTER);

        button.setAlignmentY(FlowLayout.CENTER);
        button.addActionListener(this);

        frame.setVisible(true);
    }

    public static void main(String[] args){
        new PoringConstructor();
    } 

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == button){
            new Poring();
        }
    }
}
