import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CalculatorTwoGUI implements ActionListener {
    private final JFrame frame = new JFrame("Calculator");
    private final JPanel textfieldpanel = new JPanel(new GridLayout(1,1));
    private final JPanel numberpanel = new JPanel(new GridLayout(4,4));

    private final JTextField displayField = new JTextField(20);

    private String operator = "";
    private double num1, num2;

    public CalculatorTwoGUI() {
        frame.setSize(300, 300);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        displayField.setEditable(false);

        JButton button0 = new JButton("0");
        button0.addActionListener(this);
        JButton button1 = new JButton("1");
        button1.addActionListener(this);
        JButton button2 = new JButton("2");
        button2.addActionListener(this);
        JButton button3 = new JButton("3");
        button3.addActionListener(this);
        JButton button4 = new JButton("4");
        button4.addActionListener(this);
        JButton button5 = new JButton("5");
        button5.addActionListener(this);
        JButton button6 = new JButton("6");
        button6.addActionListener(this);
        JButton button7 = new JButton("7");
        button7.addActionListener(this);
        JButton button8 = new JButton("8");
        button8.addActionListener(this);
        JButton button9 = new JButton("9");
        button9.addActionListener(this);
        JButton buttonCancel = new JButton("c");
        buttonCancel.addActionListener(this);
        JButton buttonEqual = new JButton("=");
        buttonEqual.addActionListener(this);
        JButton buttonAdd = new JButton("+");
        buttonAdd.addActionListener(this);
        JButton buttonSubtract = new JButton("-");
        buttonSubtract.addActionListener(this);
        JButton buttonMultiply = new JButton("*");
        buttonMultiply.addActionListener(this);
        JButton buttonDivide = new JButton("/");
        buttonDivide.addActionListener(this);

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

    @Override
    public void actionPerformed(ActionEvent e) {
        String action = e.getActionCommand();

        if (action.matches("[0-9]")) {  // If it's a number
            displayField.setText(displayField.getText() + action);
        }
        else if (action.matches("[+\\-*/]")) {  // If it's an operator
            if (!displayField.getText().isEmpty()) {
                num1 = Double.parseDouble(displayField.getText());
                operator = action;
                displayField.setText("");  // Clear for second number
            } else {
                System.out.println("Invalid Input");
            }
        }
        else if (action.equals("=")) {  // If it's equal
            if (!displayField.getText().isEmpty() && !operator.isEmpty()) {
                num2 = Double.parseDouble(displayField.getText());
                double result = 0;

                switch (operator) {
                    case "+": result = num1 + num2; break;
                    case "-": result = num1 - num2; break;
                    case "*": result = num1 * num2; break;
                    case "/":
                        if (num2 == 0) {
                            displayField.setText("Error");
                            return;
                        }
                        result = num1 / num2;
                        break;
                }
                displayField.setText(String.valueOf(String.format("%f", result)));
                operator = "";
            } else {
                System.out.println("Invalid Calculation");
            }
        }
        else if (action.equals("c")) {
            displayField.setText("");
            operator = "";
            num1 = 0;
            num2 = 0;
        }
    }
}
