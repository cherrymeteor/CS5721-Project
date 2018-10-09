package view;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CustomerWindow {

    private JFrame frmCustomerWindow;
    private String accountNum;

    /**
     * Create the application.
     */
    public CustomerWindow(String accountNum) {
        this.accountNum = accountNum;
        initialize();
    }

    /**
     * Launch the application.
     */
    public void run() {
        try {
            frmCustomerWindow.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frmCustomerWindow = new JFrame();
        frmCustomerWindow.setTitle("Customer Window");
        frmCustomerWindow.setBounds(100, 100, 751, 636);
        frmCustomerWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmCustomerWindow.getContentPane().setLayout(null);

        JLabel lblWelcomeFirstname = new JLabel("Welcome (FirstName) !");
        lblWelcomeFirstname.setFont(new Font("Tahoma", Font.PLAIN, 25));
        lblWelcomeFirstname.setBounds(222, 42, 349, 105);
        frmCustomerWindow.getContentPane().add(lblWelcomeFirstname);

        JLabel lblYourCardNumber = new JLabel("Your card number is: ");
        lblYourCardNumber.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblYourCardNumber.setBounds(36, 159, 146, 29);
        frmCustomerWindow.getContentPane().add(lblYourCardNumber);

        JButton btnNewButton = new JButton("View Balance");
        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
        btnNewButton.setBounds(66, 344, 213, 63);
        frmCustomerWindow.getContentPane().add(btnNewButton);

        JLabel lbl_accountNum = new JLabel("**********");
        lbl_accountNum.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lbl_accountNum.setBounds(192, 164, 124, 19);
        lbl_accountNum.setText(accountNum);
        frmCustomerWindow.getContentPane().add(lbl_accountNum);

        JButton btnMakeADeposit = new JButton("Withdraw");
        btnMakeADeposit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frmCustomerWindow.dispose();
                new CustomerWithdrawWindow(accountNum).run();
            }
        });
        btnMakeADeposit.setFont(new Font("Tahoma", Font.PLAIN, 20));
        btnMakeADeposit.setBounds(443, 252, 213, 63);
        frmCustomerWindow.getContentPane().add(btnMakeADeposit);

        JButton btnSignOut = new JButton("Sign out");
        btnSignOut.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frmCustomerWindow.dispose();
                new MainMenu().run();
            }
        });
        btnSignOut.setFont(new Font("Tahoma", Font.PLAIN, 20));
        btnSignOut.setBounds(244, 446, 213, 63);
        frmCustomerWindow.getContentPane().add(btnSignOut);

        JButton btnModifyAccount = new JButton("Modify Account\r\n");
        btnModifyAccount.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frmCustomerWindow.dispose();
                new CustomerModifyAccountWindow(accountNum).run();
            }
        });
        btnModifyAccount.setFont(new Font("Tahoma", Font.PLAIN, 20));
        btnModifyAccount.setBounds(66, 252, 213, 63);
        frmCustomerWindow.getContentPane().add(btnModifyAccount);

        JButton btnMakeADeposit_1 = new JButton("Make a deposit");
        btnMakeADeposit_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frmCustomerWindow.dispose();
                new CustomerDeposit(accountNum).run();
            }
        });
        btnMakeADeposit_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
        btnMakeADeposit_1.setBounds(443, 344, 213, 63);
        frmCustomerWindow.getContentPane().add(btnMakeADeposit_1);


    }
}
