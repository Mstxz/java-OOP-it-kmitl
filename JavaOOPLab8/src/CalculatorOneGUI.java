import java.awt.*;
import javax.swing.*;

// Calculator GUI Class
public class CalculatorOneGUI {
    private final JTextField firstNumField;
    private final JTextField secondNumField;
    private final JTextField resultTextField;
    private final JFrame frame;
    
    public CalculatorOneGUI() {
        frame = new JFrame("Calculator");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.setResizable(false);
        
        // Panels
        JPanel numbersPanel = new JPanel(new GridLayout(2, 1));
        JPanel operationsPanel = new JPanel();
        JPanel resultPanel = new JPanel(new GridLayout(1, 1));
        
        // Text Fields
        firstNumField = new JTextField(20);
        secondNumField = new JTextField(20);
        resultTextField = new JTextField(20);
        resultTextField.setEditable(false);
        
        // Buttons
        JButton addButton = new JButton("Add");
        JButton subtractButton = new JButton("Subtract");
        JButton multiplyButton = new JButton("Multiply");
        JButton divideButton = new JButton("Divide");
        
        // Add components to panels
        numbersPanel.add(firstNumField);
        numbersPanel.add(secondNumField);
        
        operationsPanel.add(addButton);
        operationsPanel.add(subtractButton);
        operationsPanel.add(multiplyButton);
        operationsPanel.add(divideButton);
        
        resultPanel.add(resultTextField);
        
        // Add panels to frame
        frame.add(numbersPanel, BorderLayout.NORTH);
        frame.add(operationsPanel, BorderLayout.CENTER);
        frame.add(resultPanel, BorderLayout.SOUTH);
        
        frame.setVisible(true);
    }
}