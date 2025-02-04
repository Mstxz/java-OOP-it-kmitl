import java.awt.*;
import javax.swing.*;

public class CalculatorTwoGUI {
    private final JFrame frame = new JFrame("Calculator");
    private final JPanel textfieldpanel = new JPanel(new GridLayout(1,1));
    private final JPanel numberpanel = new JPanel(new GridLayout(4,4));

    private final JTextField displayField = new JTextField(20);

    public CalculatorTwoGUI() {
        frame.setSize(300, 300);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        displayField.setEditable(false);

        JButton button1 = new JButton("1");
        JButton button0 = new JButton("0");
        JButton button2 = new JButton("2");
        JButton button3 = new JButton("3");
        JButton button4 = new JButton("4");
        JButton button5 = new JButton("5");
        JButton button6 = new JButton("6");
        JButton button7 = new JButton("7");
        JButton button8 = new JButton("8");
        JButton button9 = new JButton("9");
        JButton buttonCancel = new JButton("c");
        JButton buttonEqual = new JButton("=");
        JButton buttonAdd = new JButton("+");
        JButton buttonSubtract = new JButton("-");
        JButton buttonMultiply = new JButton("*");
        JButton buttonDivide = new JButton("/");

        textfieldpanel.add(displayField);
        frame.add(textfieldpanel, BorderLayout.NORTH);

        frame.add(numberpanel, BorderLayout.CENTER);
        numberpanel.add(button7);
        numberpanel.add(button8);
        numberpanel.add(button9);
        numberpanel.add(buttonAdd);
        numberpanel.add(button4);
        numberpanel.add(button5);
        numberpanel.add(button6);
        numberpanel.add(buttonSubtract);
        numberpanel.add(button1);
        numberpanel.add(button2);
        numberpanel.add(button3);
        numberpanel.add(buttonMultiply);
        numberpanel.add(button0);
        numberpanel.add(buttonCancel);
        numberpanel.add(buttonEqual);
        numberpanel.add(buttonDivide);
    }
}
