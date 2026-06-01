import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.io.FileWriter;
import java.io.IOException;

// Assignment #3
public class UIThree extends JFrame implements ActionListener {

    private JButton button1datetime;
    private JButton button2log;
    private JButton button3green;
    private JButton button4exit;

    private JLabel dateLabel;
    private JPanel mainPanel;

    public UIThree() {
        setTitle("Assignment 3");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(4, 1, 10, 10));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        mainPanel.setBackground(Color.decode("#6a41c4ff"));

        button1datetime = new JButton("Date and Time");
        button2log = new JButton("Log it!");
        button3green = new JButton("Green it!");
        button4exit = new JButton("Exit");

        button1datetime.addActionListener(this);
        button2log.addActionListener(this);
        button3green.addActionListener(this);
        button4exit.addActionListener(this);

        mainPanel.add(button1datetime);
        mainPanel.add(button2log);
        mainPanel.add(button3green);
        mainPanel.add(button4exit);

        add(mainPanel);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1datetime) {
            LocalDateTime now = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm a");
            //dateLabel = new JLabel("Date:" + now.format(formatter), SwingConstants.CENTER);
            JOptionPane.showMessageDialog(this, "Date: " + now.format(formatter));
        } else if (e.getSource() == button2log) {
            try {
                FileWriter writer = new FileWriter("log.txt", false);
                LocalDateTime now = LocalDateTime.now();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm a");
                writer.write("The Date is:" + now.format(formatter));
                writer.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        } else if (e.getSource() == button3green) {
            mainPanel.setBackground(Color.decode("#006400"));

        } else if (e.getSource() == button4exit) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new UIThree());
    }
}
