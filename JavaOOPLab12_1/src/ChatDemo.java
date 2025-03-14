import java.awt.*;
import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.*;

public class ChatDemo {
    private final JFrame frame = new JFrame("Chat Demo");
    private final JTextArea messageField = new JTextArea();
    private final JTextField inputField = new JTextField("Enter Message");
    private final JButton sendButton = new JButton("Submit");
    private final JButton resetButton = new JButton("Reset");

    private static final String FILE_NAME = "src/ChatDemo.dat";

    public ChatDemo() {
        messageField.setEditable(false);
        JPanel panel = new JPanel();
        panel.add(messageField);
        messageField.setPreferredSize(new Dimension(350, 200));
        panel.add(inputField);
        inputField.setPreferredSize(new Dimension(350, 20));
        panel.add(sendButton);
        panel.add(resetButton);
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setVisible(true);

        createDirectoryIfNotExists();
        loadChatHistory();

        sendButton.addActionListener(e -> {
            String message = inputField.getText().trim();
            if (!message.isEmpty()) {
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
                String formattedMessage = dtf.format(LocalDateTime.now()) + " : " + message;
                messageField.append(formattedMessage + "\n");
                inputField.setText("");
                saveMessage(formattedMessage);
            }
        });

        resetButton.addActionListener(e -> {
            messageField.setText("");
            clearChatHistory();
        });
    }

    private void createDirectoryIfNotExists() {
        File directory = new File("src");
        if (!directory.exists()) {
            directory.mkdir();
        }
    }

    private void saveMessage(String message) {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(FILE_NAME, true))) {
            dos.writeUTF(message);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void loadChatHistory() {
        try (DataInputStream dis = new DataInputStream(new FileInputStream(FILE_NAME))) { //get data input stream
            while (dis.available() > 0) {
                String message = dis.readUTF(); //read the message
                messageField.append(message + "\n");
            }
        } catch (IOException e) {
            System.out.println("No previous chat history found.");
        }
    }

    private void clearChatHistory() {
        File file = new File(FILE_NAME);
        if (file.exists()) {
            file.delete();
        }
    }

    public static void main(String[] args) {
        new ChatDemo();
    }
}
