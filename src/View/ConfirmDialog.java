/*
 * Created by JFormDesigner on Thu Jan 20 14:50:31 ICT 2022
 */

package View;

import database.ConJDBC;
import enity.Device;
import enity.DeviceB;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.border.*;

/**
 * @author unknown
 */
public class ConfirmDialog extends JDialog {
    public ConfirmDialog() {

        initComponents();
    }

    private void okButtonMouseClicked(MouseEvent e) {
        // TODO add your code here
        try{
            Device dv = new Device();
            DeviceB dvb = new DeviceB();
            String name = txName.getText();
            String position = txP.getText();
            String status = txS.getText();
            String note = txNote.getText();

            if(name == null || position == null || status == null || note ==null){
                JOptionPane.showMessageDialog(this,"Some thing were Wrong!");
                return;
            }

            dv.setId(Integer.parseInt(txId.getText()));
            dvb.setId(Integer.parseInt(txId.getText()));
            dv.setName(name);
            dv.setPosition(position);
            dv.setStatus(status);
            dv.setNote(note);

            ConJDBC.insert(dv);
            ConJDBC.deleteb(dvb);
            JOptionPane.showMessageDialog(this,"Update success!");
            dispose();
        }
        catch(Exception ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this,"Some thing wear Wrong!");

        }

    }

    private void cancelButtonMouseClicked(MouseEvent e) {
        // TODO add your code here
        dispose();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        dialogPane = new JPanel();
        contentPanel = new JPanel();
        label1 = new JLabel();
        txId = new JTextField();
        txName = new JTextField();
        label2 = new JLabel();
        txP = new JTextField();
        label3 = new JLabel();
        txS = new JTextField();
        label4 = new JLabel();
        txNote = new JTextField();
        label5 = new JLabel();
        panel1 = new JPanel();
        label6 = new JLabel();
        label7 = new JLabel();
        label8 = new JLabel();
        txDate = new JTextField();
        buttonBar = new JPanel();
        okButton = new JButton();
        cancelButton = new JButton();

        //======== this ========
        setUndecorated(true);
        var contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== dialogPane ========
        {
            dialogPane.setBorder(new EmptyBorder(12, 12, 12, 12));
            dialogPane.setBackground(new Color(80, 64, 154));
            dialogPane.setLayout(new BorderLayout());

            //======== contentPanel ========
            {

                //---- label1 ----
                label1.setText("ID");
                label1.setFont(new Font("Segoe UI Black", Font.ITALIC, 14));

                //---- txId ----
                txId.setFont(new Font("Segoe UI", Font.ITALIC, 16));

                //---- txName ----
                txName.setFont(new Font("Segoe UI", Font.ITALIC, 16));

                //---- label2 ----
                label2.setText("Name");
                label2.setFont(new Font("Segoe UI Black", Font.ITALIC, 14));

                //---- txP ----
                txP.setFont(new Font("Segoe UI", Font.ITALIC, 16));

                //---- label3 ----
                label3.setText("Position");
                label3.setFont(new Font("Segoe UI Black", Font.ITALIC, 14));

                //---- txS ----
                txS.setFont(new Font("Segoe UI", Font.ITALIC, 16));

                //---- label4 ----
                label4.setText("Status");
                label4.setFont(new Font("Segoe UI Black", Font.ITALIC, 14));

                //---- txNote ----
                txNote.setFont(new Font("Segoe UI", Font.ITALIC, 16));

                //---- label5 ----
                label5.setText("Note");
                label5.setFont(new Font("Segoe UI Black", Font.ITALIC, 14));

                //======== panel1 ========
                {
                    panel1.setBackground(new Color(80, 64, 154));

                    //---- label6 ----
                    label6.setText("Confirm");
                    label6.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 16));
                    label6.setForeground(Color.white);

                    //---- label7 ----
                    label7.setIcon(new ImageIcon(getClass().getResource("/View/Pic/sadsadsa.png")));

                    GroupLayout panel1Layout = new GroupLayout(panel1);
                    panel1.setLayout(panel1Layout);
                    panel1Layout.setHorizontalGroup(
                        panel1Layout.createParallelGroup()
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(label7)
                                .addGap(18, 18, 18)
                                .addComponent(label6)
                                .addContainerGap(157, Short.MAX_VALUE))
                    );
                    panel1Layout.setVerticalGroup(
                        panel1Layout.createParallelGroup()
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGroup(panel1Layout.createParallelGroup()
                                    .addGroup(panel1Layout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addComponent(label6, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
                                    .addComponent(label7))
                                .addGap(6, 6, 6))
                    );
                }

                //---- label8 ----
                label8.setText("Date");
                label8.setFont(new Font("Segoe UI Black", Font.ITALIC, 14));

                //---- txDate ----
                txDate.setFont(new Font("Segoe UI", Font.ITALIC, 16));

                GroupLayout contentPanelLayout = new GroupLayout(contentPanel);
                contentPanel.setLayout(contentPanelLayout);
                contentPanelLayout.setHorizontalGroup(
                    contentPanelLayout.createParallelGroup()
                        .addComponent(panel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(contentPanelLayout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(contentPanelLayout.createParallelGroup()
                                .addGroup(contentPanelLayout.createSequentialGroup()
                                    .addComponent(label1, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                                    .addComponent(txId, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE))
                                .addGroup(contentPanelLayout.createSequentialGroup()
                                    .addComponent(label2, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txName, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE))
                                .addGroup(contentPanelLayout.createSequentialGroup()
                                    .addComponent(label3, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                                    .addComponent(txP, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE))
                                .addGroup(contentPanelLayout.createSequentialGroup()
                                    .addComponent(label4, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                                    .addComponent(txS, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE))
                                .addGroup(contentPanelLayout.createSequentialGroup()
                                    .addComponent(label8, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                                    .addComponent(txDate, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE))
                                .addGroup(contentPanelLayout.createSequentialGroup()
                                    .addComponent(label5, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                                    .addComponent(txNote, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE))))
                );
                contentPanelLayout.setVerticalGroup(
                    contentPanelLayout.createParallelGroup()
                        .addGroup(contentPanelLayout.createSequentialGroup()
                            .addComponent(panel1, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(contentPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(label1)
                                .addComponent(txId, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addGap(13, 13, 13)
                            .addGroup(contentPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(label2)
                                .addComponent(txName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(contentPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(label3)
                                .addComponent(txP, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(contentPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(label4)
                                .addComponent(txS, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addGap(24, 24, 24)
                            .addGroup(contentPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(label5)
                                .addComponent(txNote, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(contentPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(label8)
                                .addComponent(txDate, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addContainerGap(30, Short.MAX_VALUE))
                );
            }
            dialogPane.add(contentPanel, BorderLayout.CENTER);

            //======== buttonBar ========
            {
                buttonBar.setBorder(new EmptyBorder(12, 0, 0, 0));
                buttonBar.setLayout(new GridBagLayout());
                ((GridBagLayout)buttonBar.getLayout()).columnWidths = new int[] {0, 85, 80};
                ((GridBagLayout)buttonBar.getLayout()).columnWeights = new double[] {1.0, 0.0, 0.0};

                //---- okButton ----
                okButton.setText("OK");
                okButton.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        okButtonMouseClicked(e);
                    }
                });
                buttonBar.add(okButton, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 0, 5), 0, 0));

                //---- cancelButton ----
                cancelButton.setText("Cancel");
                cancelButton.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        cancelButtonMouseClicked(e);
                    }
                });
                buttonBar.add(cancelButton, new GridBagConstraints(2, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 0, 0), 0, 0));
            }
            dialogPane.add(buttonBar, BorderLayout.SOUTH);
        }
        contentPane.add(dialogPane, BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel dialogPane;
    private JPanel contentPanel;
    private JLabel label1;
    public JTextField txId;
    public JTextField txName;
    private JLabel label2;
    public JTextField txP;
    private JLabel label3;
    public JTextField txS;
    private JLabel label4;
    public JTextField txNote;
    private JLabel label5;
    private JPanel panel1;
    private JLabel label6;
    private JLabel label7;
    private JLabel label8;
    public JTextField txDate;
    private JPanel buttonBar;
    private JButton okButton;
    private JButton cancelButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
