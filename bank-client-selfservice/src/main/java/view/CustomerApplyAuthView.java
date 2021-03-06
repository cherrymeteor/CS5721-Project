/*
 * Created by JFormDesigner on Wed Oct 24 21:45:10 BST 2018
 */

package view;

import controller.CustomerApplyAuthController;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;

/**
 * @author xiangkai Tang
 */
public class CustomerApplyAuthView extends JFrame {
    private CustomerApplyAuthController customerApplyAuthController;

    public CustomerApplyAuthView() {
        customerApplyAuthController = new CustomerApplyAuthController(this);
        customerApplyAuthController.initialize();
    }

    public void initComponents() {
        setTitle("Apply view");

        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        lbl_isExist = new JLabel();
        cb_isExisting = new JComboBox<>();
        existingCustomerPanel = new JPanel();
        lbl_userId = new JLabel();
        tf_userId = new JTextField();
        tf_firstName = new JTextField();
        lbl_firstName = new JLabel();
        lbl_lastName = new JLabel();
        tf_lastName = new JTextField();
        lbl_identityType = new JLabel();
        cb_identityTypeList = new JComboBox<>();
        lbl_identityNum = new JLabel();
        tf_identityNum = new JTextField();
        btn_customer_next = new JButton();
        noneCustomerPanel = new JPanel();
        btn_none_next = new JButton();
        btn_back = new JButton();

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(new MigLayout(
            "hidemode 3",
            // columns
            "[100:n,fill]" +
            "[fill]" +
            "[fill]" +
            "[100:n,fill]",
            // rows
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]"));

        //---- lbl_isExist ----
        lbl_isExist.setText("Existing Customer ?");
        lbl_isExist.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        contentPane.add(lbl_isExist, "cell 1 1");

        //---- cb_isExisting ----
        cb_isExisting.setModel(new DefaultComboBoxModel<>(new String[] {
            "Please Select",
            "Yes",
            "No"
        }));
        cb_isExisting.addActionListener(e -> customerApplyAuthController.cb_isExistingActionPerformed(e));
        contentPane.add(cb_isExisting, "cell 2 1");

        //======== existingCustomerPanel ========
        {
            existingCustomerPanel.setLayout(new MigLayout(
                "hidemode 3",
                // columns
                "[fill]" +
                "[fill]" +
                "[fill]",
                // rows
                "[]" +
                "[]" +
                "[]0" +
                "[]0" +
                "[]" +
                "[]" +
                "[]"));

            //---- lbl_userId ----
            lbl_userId.setText("User Id");
            lbl_userId.setFont(new Font("Segoe UI", Font.PLAIN, 16));
            existingCustomerPanel.add(lbl_userId, "cell 0 0");

            //---- tf_userId ----
            tf_userId.setMinimumSize(new Dimension(100, 24));
            existingCustomerPanel.add(tf_userId, "cell 1 0");

            //---- tf_firstName ----
            tf_firstName.setMinimumSize(new Dimension(100, 24));
            existingCustomerPanel.add(tf_firstName, "cell 1 1");

            //---- lbl_firstName ----
            lbl_firstName.setText("First name");
            lbl_firstName.setFont(new Font("Segoe UI", Font.PLAIN, 16));
            existingCustomerPanel.add(lbl_firstName, "cell 0 1");

            //---- lbl_lastName ----
            lbl_lastName.setText("Last name");
            lbl_lastName.setFont(new Font("Segoe UI", Font.PLAIN, 16));
            existingCustomerPanel.add(lbl_lastName, "cell 0 2");

            //---- tf_lastName ----
            tf_lastName.setMinimumSize(new Dimension(100, 24));
            existingCustomerPanel.add(tf_lastName, "cell 1 2");

            //---- lbl_identityType ----
            lbl_identityType.setText("Identity Type");
            lbl_identityType.setFont(new Font("Segoe UI", Font.PLAIN, 16));
            existingCustomerPanel.add(lbl_identityType, "cell 0 4");

            //---- cb_identityTypeList ----
            cb_identityTypeList.setModel(new DefaultComboBoxModel<>(new String[] {
                "Select Your Identity Type",
                "Driving License",
                "Passport"
            }));
            existingCustomerPanel.add(cb_identityTypeList, "cell 1 4");

            //---- lbl_identityNum ----
            lbl_identityNum.setText("Identity Number");
            lbl_identityNum.setFont(new Font("Segoe UI", Font.PLAIN, 16));
            existingCustomerPanel.add(lbl_identityNum, "cell 0 5");
            existingCustomerPanel.add(tf_identityNum, "cell 1 5");

            //---- btn_customer_next ----
            btn_customer_next.setText("Next");
            btn_customer_next.setFont(new Font("Segoe UI", Font.PLAIN, 16));
            btn_customer_next.addActionListener(e -> customerApplyAuthController.btn_customer_nextActionPerformed(e));
            existingCustomerPanel.add(btn_customer_next, "cell 1 6 2 1");
        }
        contentPane.add(existingCustomerPanel, "cell 1 4 2 1");

        //======== noneCustomerPanel ========
        {
            noneCustomerPanel.setLayout(new MigLayout(
                "hidemode 3",
                // columns
                "[center]",
                // rows
                "[]" +
                "[]" +
                "[]" +
                "[]"));

            //---- btn_none_next ----
            btn_none_next.setText("Next");
            btn_none_next.setFont(new Font("Segoe UI", Font.PLAIN, 16));
            btn_none_next.setMinimumSize(new Dimension(150, 24));
            btn_none_next.addActionListener(e -> customerApplyAuthController.btn_none_nextActionPerformed(e));
            noneCustomerPanel.add(btn_none_next, "cell 0 1 1 2");
        }
        contentPane.add(noneCustomerPanel, "cell 1 3 2 1");

        //---- btn_back ----
        btn_back.setText("Back");
        btn_back.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        btn_back.addActionListener(e -> customerApplyAuthController.btn_backActionPerformed(e));
        contentPane.add(btn_back, "cell 1 6 2 1");
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    public JLabel lbl_isExist;
    public JComboBox<String> cb_isExisting;
    public JPanel existingCustomerPanel;
    public JLabel lbl_userId;
    public JTextField tf_userId;
    public JTextField tf_firstName;
    public JLabel lbl_firstName;
    public JLabel lbl_lastName;
    public JTextField tf_lastName;
    public JLabel lbl_identityType;
    public JComboBox<String> cb_identityTypeList;
    public JLabel lbl_identityNum;
    public JTextField tf_identityNum;
    public JButton btn_customer_next;
    public JPanel noneCustomerPanel;
    public JButton btn_none_next;
    public JButton btn_back;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
