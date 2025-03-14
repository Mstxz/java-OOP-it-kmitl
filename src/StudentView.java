import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class StudentView implements ActionListener {

    /* GUI Zone */
    private JFrame frame = new JFrame("Student View");
    private JPanel panel = new JPanel();
    private JPanel buttonZone = new JPanel();

    /* ID */
    private JLabel IDLabel = new JLabel("ID:");
    private JTextField IDField = new JTextField();

    /* Name */
    private JLabel nameLabel = new JLabel("Name:");
    private JTextField nameField = new JTextField();

    /* Money */
    private JLabel moneyLabel = new JLabel("Money:");
    private JTextField moneyField = new JTextField("0");

    /* Buttons */
    private JButton DepositButton = new JButton("Deposit");
    private JButton WithdrawButton = new JButton("Withdraw");

    /* Attribute to collect Data */
    private Student student;

    public StudentView() {

        student = loadFile();
        if (student == null) {
            student = new Student(0, "", 0);
        }

        // GUI Setup
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setResizable(false);
        frame.add(panel);
        frame.add(buttonZone, BorderLayout.SOUTH);
        panel.setLayout(new FlowLayout(FlowLayout.LEFT));

        addIntoTheFrame(IDLabel, IDField);
        addIntoTheFrame(nameLabel, nameField);
        addIntoTheFrame(moneyLabel, moneyField);
        moneyField.setEditable(false);

        IDField.setText(String.valueOf(student.getID()));
        nameField.setText(student.getName());
        moneyField.setText(String.valueOf(student.getMoney()));

        buttonZone.add(DepositButton);
        buttonZone.add(WithdrawButton);
        buttonZone.setLayout(new FlowLayout(FlowLayout.CENTER));

        frame.setVisible(true);

        DepositButton.addActionListener(this);
        WithdrawButton.addActionListener(this);

        // Add WindowListener to save data when the window is closing
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                saveFile();  // Save student data when the window is closing
            }
        });
    }

    private void addIntoTheFrame(JLabel label, JTextField textField) {
        label.setAlignmentX(Component.LEFT_ALIGNMENT);
        label.setPreferredSize(new Dimension(180, 30));
        panel.add(label);
        textField.setPreferredSize(new Dimension(180, 30));
        panel.add(textField);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int id = Integer.parseInt(IDField.getText());
        String name = nameField.getText();
        int money = Integer.parseInt(moneyField.getText());


        student = new Student(id, name, money);

        if (e.getSource() == DepositButton) {
            student.setMoney(student.getMoney() + 100);
        } else if (e.getSource() == WithdrawButton) {
            if (100 <= student.getMoney()) {
                student.setMoney(student.getMoney() - 100);
            } else {
                student.setMoney(0);
            }
        }


        moneyField.setText(String.valueOf(student.getMoney()));

        saveFile();
    }

    public Student loadFile() {
        Student student = null;
        File file = new File("src/data/studentData.dat");  // Changed file extension to .dat
        if (file.exists()) {
            try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = br.readLine()) != null) {
                    String[] values = line.split(",");
                    student = new Student(Integer.parseInt(values[0]), values[1], Integer.parseInt(values[2]));
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // If student data is loaded, set the text fields accordingly
        if (student != null) {
            IDField.setText(String.valueOf(student.getID()));
            nameField.setText(student.getName());
            moneyField.setText(String.valueOf(student.getMoney()));
        }

        return student; // Return the student object
    }

    public void createFile() {
        File file = new File("src/data/studentData.dat");  // Changed file extension to .dat
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void saveFile() {
        try (FileWriter fw = new FileWriter("src/data/studentData.dat", false)) {
            fw.write(student.getID() + "," + student.getName() + "," + student.getMoney()); //collect to string for the studentData.dat file
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new StudentView();
    }
}
