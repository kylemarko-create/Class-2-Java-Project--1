import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class UITwo extends JFrame implements ActionListener {

    private BankAccount account;
    private JTextField amountField;
    private JLabel balanceLabel;
    private JLabel messageLabel;
    private JButton depositButton;
    private JButton withdrawButton;
    private JButton summaryButton;

    // window builder
    public UITwo() {
        // Non UI defaults chosen
        account = new BankAccount();
        account.setFirstName("User");
        account.setLastName("Account");
        account.setAccountID(1001);

        // Window settings & summariazer on end
        setTitle("Bank App");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() { 
            @Override
            public void windowClosing(WindowEvent e) {
                String summary =
                    "Name: " + account.getFirstName() + " " + account.getLastName() + "\n" +
                    "Account ID: " + account.getAccountID() + "\n" +
                    "Balance: $" + String.format("%.2f", account.getBalance());
                JOptionPane.showMessageDialog(UITwo.this, summary, "Account Summary", JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
            }
        });

        // Main panel
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(6, 1, 5, 5));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Display balance
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm a");
        balanceLabel = new JLabel("Date:" + now.format(formatter), SwingConstants.CENTER);

        // Message label
        messageLabel = new JLabel(" ", SwingConstants.CENTER);

        // Amount input
        JPanel inputPanel = new JPanel(new FlowLayout());
        JLabel amountLabel = new JLabel("Amount: $");
        amountField = new JTextField(10);
        inputPanel.add(amountLabel);
        inputPanel.add(amountField);

        // Buttons
        depositButton  = new JButton("Deposit");
        withdrawButton = new JButton("Withdraw");
        summaryButton  = new JButton("Show Summary");
        depositButton.addActionListener(this);
        withdrawButton.addActionListener(this);
        summaryButton.addActionListener(this);

        JPanel buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.add(depositButton);
        buttonPanel.add(withdrawButton);
        buttonPanel.add(summaryButton);

        // Add everything to main panel
        mainPanel.add(balanceLabel);
        mainPanel.add(messageLabel);
        mainPanel.add(inputPanel);
        mainPanel.add(buttonPanel);

        add(mainPanel);
        setVisible(true);
    }

    // Clicks handler
    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == depositButton) {
            try {
                double amount = Double.parseDouble(amountField.getText());
                account.deposit(amount);
                messageLabel.setText("Deposited: $" + String.format("%.2f", amount));
                updateBalance();
            } catch (NumberFormatException ex) {
                messageLabel.setText("Please enter a number.");
            }

        } else if (e.getSource() == withdrawButton) {
            try {
                double amount = Double.parseDouble(amountField.getText());
                account.withdrawal(amount);
                messageLabel.setText("Withdrew: $" + String.format("%.2f", amount));
                updateBalance();
            } catch (NumberFormatException ex) {
                messageLabel.setText("Please enter a number.");
            }

        } else if (e.getSource() == summaryButton) {
            // Show summary in a popup dialog
            String summary =
                "Name: " + account.getFirstName() + " " + account.getLastName() + "\n" +
                "Account ID: " + account.getAccountID() + "\n" +
                "Balance: $" + String.format("%.2f", account.getBalance());
            JOptionPane.showMessageDialog(this, summary, "Account Summary", JOptionPane.INFORMATION_MESSAGE);
        }

        amountField.setText("");
    }

    // Update the balance label on screen
    private void updateBalance() {
        balanceLabel.setText("Current Balance: $" + String.format("%.2f", account.getBalance()));
    }

    // Main method launch UI
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new UITwo());
    }
}
