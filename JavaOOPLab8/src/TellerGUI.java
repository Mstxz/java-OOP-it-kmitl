import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TellerGUI implements ActionListener {
    private final JFrame frame = new JFrame("TellerGUI");
    private final JPanel panelBalance = new JPanel();
    private final JPanel panelAmount = new JPanel();
    private final JPanel panelAction = new JPanel();
    private final JPanel panel = new JPanel();

    private final JLabel labelBalance = new JLabel("Balance");
    private final JTextField textfieldBalance = new JTextField(10);
    private final JLabel labelAmount = new JLabel("Amount");
    private final JTextField textfieldAmount = new JTextField(10);

    private final JButton deposit = new JButton("Deposit");
    private final JButton withdraw = new JButton("Withdraw");
    private final JButton exit = new JButton("Exit");

    private Account account = new Account(6000, null);

    public TellerGUI() {
        frame.add(panelBalance);
        frame.setLayout(new GridLayout(4,1));

        panelBalance.setLayout(new GridLayout(1, 2));
        panelBalance.add(this.labelBalance);
        panelBalance.add(this.textfieldBalance);
        textfieldBalance.setText(String.valueOf(account.getBalance()));
        textfieldBalance.setEditable(false);

        frame.add(panelAmount);
        panelAmount.setLayout(new GridLayout(1, 2));
        panelAmount.add(this.labelAmount);
        panelAmount.add(this.textfieldAmount);

        frame.add(panelAction);
        panelAction.setLayout(new GridLayout(1, 3));
        panelAction.add(this.deposit);
        panelAction.add(this.withdraw);
        panelAction.add(this.exit);

        frame.add(panel);

        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false);

        this.deposit.addActionListener(this);
        this.withdraw.addActionListener(this);
        this.exit.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.deposit) {
            double amount = Double.parseDouble(this.textfieldAmount.getText());
            account.deposit(amount);
            textfieldBalance.setText(String.valueOf(account.getBalance()));
        } else if (e.getSource() == this.withdraw) {
            double amount = Double.parseDouble(this.textfieldAmount.getText());
            account.withdraw(amount);
            textfieldBalance.setText(String.valueOf(account.getBalance()));
        } else if (e.getSource() == this.exit) {
            System.exit(0);
        }
        this.textfieldAmount.setText("");
    }
}
