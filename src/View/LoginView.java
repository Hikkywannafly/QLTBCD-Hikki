/*
 * Created by JFormDesigner on Thu Jan 20 19:55:54 ICT 2022
 */

package View;

import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.border.*;

/**
 * @author unknown
 */
public class LoginView extends JFrame {
    public LoginView() {
        initComponents();
    }

    private void panel1MouseClicked(MouseEvent e) {
        // TODO add your code here
        System.exit(0);
    }

    private void panel1MouseEntered(MouseEvent e) {
        // TODO add your code here
        panel1.setBackground(Color.RED);
    }

    private void panel1MouseExited(MouseEvent e) {
        // TODO add your code here
        panel1.setBackground(new Color(80,64,154));
    }

    private void button1MouseClicked(MouseEvent e) {
        // TODO add your code here
        try{
            if(txU.equals("") || txP.equals("")){
                JOptionPane.showMessageDialog(this,"Some thing were wrong");
            }
            else{
                String query = "Select * from account where users=? and pass=?";
                 String url ="jdbc:mysql://localhost:3306/qltbcd";
                 String user = "root";
                 String password = "";
                 Connection conn = DriverManager.getConnection(url,user,password);
                 PreparedStatement stmt = conn.prepareStatement(query);
                 stmt.setString(1,txU.getText());
                 stmt.setString(2,txP.getText());
                 ResultSet rs = stmt.executeQuery();
                 if (rs.next()) {
                    new MainView();
                    this.setVisible(false);
                 }
                else{
                     JOptionPane.showMessageDialog(this,"Some thing were wrong");
                 }
            }
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        dialogPane = new JPanel();
        contentPanel = new JPanel();
        label1 = new JLabel();
        panel1 = new JPanel();
        label2 = new JLabel();
        txU = new JTextField();
        txP = new JPasswordField();
        button1 = new JButton();
        label3 = new JLabel();
        label4 = new JLabel();

        //======== this ========
        setUndecorated(true);
        var contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== dialogPane ========
        {
            dialogPane.setBorder(new EmptyBorder(12, 12, 12, 12));
            dialogPane.setForeground(Color.white);
            dialogPane.setBackground(new Color(80, 64, 154));
            dialogPane.setLayout(new BorderLayout());

            //======== contentPanel ========
            {
                contentPanel.setBackground(new Color(80, 64, 154));

                //---- label1 ----
                label1.setText("LOGIN");
                label1.setForeground(Color.white);
                label1.setFont(new Font("Segoe UI Black", Font.PLAIN, 28));

                //======== panel1 ========
                {
                    panel1.setBackground(new Color(80, 64, 154));
                    panel1.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseClicked(MouseEvent e) {
                            panel1MouseClicked(e);
                        }
                        @Override
                        public void mouseEntered(MouseEvent e) {
                            panel1MouseEntered(e);
                        }
                        @Override
                        public void mouseExited(MouseEvent e) {
                            panel1MouseExited(e);
                        }
                    });

                    //---- label2 ----
                    label2.setText("X");
                    label2.setFont(new Font("Segoe UI Black", Font.BOLD, 20));

                    GroupLayout panel1Layout = new GroupLayout(panel1);
                    panel1.setLayout(panel1Layout);
                    panel1Layout.setHorizontalGroup(
                        panel1Layout.createParallelGroup()
                            .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                .addContainerGap(14, Short.MAX_VALUE)
                                .addComponent(label2, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                    );
                    panel1Layout.setVerticalGroup(
                        panel1Layout.createParallelGroup()
                            .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(label2))
                    );
                }

                //---- button1 ----
                button1.setText("Login");
                button1.setBackground(new Color(80, 64, 154));
                button1.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        button1MouseClicked(e);
                    }
                });

                //---- label3 ----
                label3.setIcon(new ImageIcon(getClass().getResource("/View/Pic/icons8-login-access-of-user-with-a-right-direction-arrow-48.png")));

                //---- label4 ----
                label4.setIcon(new ImageIcon(getClass().getResource("/View/Pic/icons8-ethereum-lock-with-encryption-and-digital-security-transaction-48.png")));

                GroupLayout contentPanelLayout = new GroupLayout(contentPanel);
                contentPanel.setLayout(contentPanelLayout);
                contentPanelLayout.setHorizontalGroup(
                    contentPanelLayout.createParallelGroup()
                        .addGroup(contentPanelLayout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(contentPanelLayout.createParallelGroup()
                                .addGroup(contentPanelLayout.createSequentialGroup()
                                    .addComponent(label1)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(panel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGroup(contentPanelLayout.createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addComponent(label3)
                                    .addGap(18, 18, 18)
                                    .addComponent(txU, GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE))
                                .addGroup(GroupLayout.Alignment.TRAILING, contentPanelLayout.createSequentialGroup()
                                    .addComponent(label4)
                                    .addGap(18, 18, 18)
                                    .addComponent(txP, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE)))
                            .addContainerGap())
                        .addGroup(GroupLayout.Alignment.TRAILING, contentPanelLayout.createSequentialGroup()
                            .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(button1)
                            .addGap(69, 69, 69))
                );
                contentPanelLayout.setVerticalGroup(
                    contentPanelLayout.createParallelGroup()
                        .addGroup(contentPanelLayout.createSequentialGroup()
                            .addGroup(contentPanelLayout.createParallelGroup()
                                .addGroup(contentPanelLayout.createSequentialGroup()
                                    .addGroup(contentPanelLayout.createParallelGroup()
                                        .addComponent(label1)
                                        .addComponent(panel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                    .addGap(28, 28, 28)
                                    .addGroup(contentPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addComponent(txU, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(label3))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                                    .addComponent(txP, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGroup(contentPanelLayout.createSequentialGroup()
                                    .addGap(0, 130, Short.MAX_VALUE)
                                    .addComponent(label4)))
                            .addGap(35, 35, 35)
                            .addComponent(button1)
                            .addContainerGap(116, Short.MAX_VALUE))
                );
            }
            dialogPane.add(contentPanel, BorderLayout.NORTH);
        }
        contentPane.add(dialogPane, BorderLayout.CENTER);
        setSize(265, 310);
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel dialogPane;
    private JPanel contentPanel;
    private JLabel label1;
    private JPanel panel1;
    private JLabel label2;
    private JTextField txU;
    private JPasswordField txP;
    private JButton button1;
    private JLabel label3;
    private JLabel label4;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            LoginView lg =new LoginView();
            lg.setVisible(true);

        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}
