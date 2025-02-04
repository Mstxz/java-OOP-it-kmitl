import java.awt.*;
import javax.swing.*;

public class MDIFormGUI {
    private final JFrame frame = new JFrame("MDIFormGUI");
    private final JMenuBar menuBar = new JMenuBar();
    private final JMenu fileMenu = new JMenu("File");
    private final JMenu newMenu = new JMenu("New");
    private final JMenuItem windowItem = new JMenuItem("Window");
    private final JMenuItem messageItem = new JMenuItem("Message");
    private final JMenuItem openMenuItem = new JMenuItem("Open");
    private final JMenuItem saveMenuItem = new JMenuItem("Save");
    private final JMenuItem exitMenuItem = new JMenuItem("Exit");
    private final JMenu editMenu = new JMenu("Edit");
    private final JMenu viewMenu = new JMenu("View");

    public MDIFormGUI(){
        frame.setJMenuBar(menuBar);

        menuBar.add(fileMenu);
        fileMenu.add(newMenu);
        fileMenu.add(openMenuItem);
        fileMenu.addSeparator();
        fileMenu.add(saveMenuItem);
        fileMenu.addSeparator();
        fileMenu.add(exitMenuItem);
        newMenu.add(windowItem);
        newMenu.addSeparator();
        newMenu.add(messageItem);
    
        menuBar.add(editMenu);

        menuBar.add(viewMenu);

        frame.setSize(1920,1080);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.BLACK);
        frame.setVisible(true);

    }
}