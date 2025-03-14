import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PoringConstructor implements ActionListener {
    private final JFrame frame = new JFrame("Poring Poring");
    private JButton button = new JButton("Click");
    private JPanel panel = new JPanel();

    private int count = 0;


    public PoringConstructor() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.add(panel);
        panel.add(button, BorderLayout.CENTER);

        frame.setVisible(true);

        button.addActionListener(this);
    }
    
    public static void main(String[] args){
        new PoringConstructor();
    } 

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == button){
            System.out.println("Pressed");
            count += 1;
            new Poring(count, 0, 0);
        }
    }
}
