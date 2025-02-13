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

    private final JDesktopPane desktopPane = new JDesktopPane();
    private final JInternalFrame miniFrame1 = new JInternalFrame("Application 1", true, true, false, true);
    private final JInternalFrame miniFrame2 = new JInternalFrame("Application 2", true, true, false, true);
    private final JInternalFrame miniFrame3 = new JInternalFrame("Application 3", true, true, false, true);

    public MDIFormGUI() {
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

        frame.setContentPane(desktopPane);
        desktopPane.setBackground(Color.BLACK);

        miniFrame1.setSize(400, 300);
        miniFrame1.setLocation(50, 50);
        miniFrame1.setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);
        miniFrame1.setVisible(true);

        miniFrame2.setSize(400, 300);
        miniFrame2.setLocation(500, 50);
        miniFrame2.setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);
        miniFrame2.setVisible(true);

        miniFrame3.setSize(400, 300);
        miniFrame3.setLocation(950, 50);
        miniFrame3.setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);
        miniFrame3.setVisible(true);

        desktopPane.add(miniFrame1);
        desktopPane.add(miniFrame2);
        desktopPane.add(miniFrame3);

        frame.setSize(1920, 1080);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
