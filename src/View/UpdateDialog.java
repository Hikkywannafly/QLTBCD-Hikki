/*
 * Created by JFormDesigner on Tue Jan 18 20:35:53 ICT 2022
 */

package View;

import database.ConJDBC;
import enity.Device;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.border.*;

/**
 * @author unknown
 */
public class UpdateDialog extends JDialog {
    public UpdateDialog() {

        initComponents();
    }

    private void cancelButtonMouseClicked(MouseEvent e) {
        // TODO add your code here
        dispose();
    }

    private void okButtonMouseClicked(MouseEvent e) {
        // TODO add your code here
        try{
            Device dv = new Device();
            String name = txName.getText();
            String position = txP.getText();
            String status = txS.getText();
            String note = txNote.getText();

            if(name == null || position == null || status == null || note ==null){
                JOptionPane.showMessageDialog(this,"Some thing were Wrong!");
                return;
            }

            dv.setId(Integer.parseInt(txId.getText()));
            dv.setName(name);
            dv.setPosition(position);
            dv.setStatus(status);
            dv.setNote(note);

            ConJDBC.update(dv);
            JOptionPane.showMessageDialog(this,"Update success!");
            dispose();
        }
         catch(Exception ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this,"Some thing wear Wrong!");

     }

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
        buttonBar = new JPanel();
        okButton = new JButton();
        cancelButton = new JButton();

        //======== this ========
        setTitle("Update Dialog");
        var contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== dialogPane ========
        {
            dialogPane.setBorder(new EmptyBorder(12, 12, 12, 12));
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
                    label6.setText("Update Dialog");
                    label6.setFont(new Font("Segoe UI", Font.ITALIC, 14));

                    GroupLayout panel1Layout = new GroupLayout(panel1);
                    panel1.setLayout(panel1Layout);
                    panel1Layout.setHorizontalGroup(
                        panel1Layout.createParallelGroup()
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(label6)
                                .addContainerGap(302, Short.MAX_VALUE))
                    );
                    panel1Layout.setVerticalGroup(
                        panel1Layout.createParallelGroup()
                            .addComponent(label6, GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                    );
                }

                GroupLayout contentPanelLayout = new GroupLayout(contentPanel);
                contentPanel.setLayout(contentPanelLayout);
                contentPanelLayout.setHorizontalGroup(
                    contentPanelLayout.createParallelGroup()
                        .addGroup(contentPanelLayout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(contentPanelLayout.createParallelGroup()
                                .addGroup(contentPanelLayout.createSequentialGroup()
                                    .addGroup(contentPanelLayout.createParallelGroup()
                                        .addComponent(label5, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(label3, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(label4, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(label1, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
                                    .addGap(28, 28, 28)
                                    .addGroup(contentPanelLayout.createParallelGroup()
                                        .addComponent(txS, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txNote, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txP, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txName, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txId, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE))
                                    .addContainerGap(111, Short.MAX_VALUE))
                                .addGroup(contentPanelLayout.createSequentialGroup()
                                    .addComponent(label2, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE))))
                        .addComponent(panel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                );
                contentPanelLayout.setVerticalGroup(
                    contentPanelLayout.createParallelGroup()
                        .addGroup(contentPanelLayout.createSequentialGroup()
                            .addComponent(panel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(contentPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(txId, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label1))
                            .addGap(18, 18, 18)
                            .addGroup(contentPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(label2)
                                .addComponent(txName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(contentPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(txP, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label3))
                            .addGap(18, 18, 18)
                            .addGroup(contentPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(txS, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label4))
                            .addGap(18, 18, 18)
                            .addGroup(contentPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(label5)
                                .addComponent(txNote, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addContainerGap())
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
    private JPanel buttonBar;
    private JButton okButton;
    private JButton cancelButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
