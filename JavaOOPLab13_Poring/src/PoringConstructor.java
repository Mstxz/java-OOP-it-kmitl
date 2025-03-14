import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PoringConstructor {
    private final JFrame frame = new JFrame("Poring Poring");
    private JButton button = new JButton("Click");

    public PoringConstructor() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.add(button, FlowLayout.CENTER);
    }
    
    public static void main(String[] args){
        new PoringConstructor();
    } 
}
