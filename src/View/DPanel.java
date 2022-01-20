/*
 * Created by JFormDesigner on Mon Jan 17 16:45:00 ICT 2022
 */

package View;

import java.awt.event.*;
import database.ConJDBC;
import enity.Device;
import enity.DeviceB;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.table.*;

/**
 * @author TamNguyen
 */
public class DPanel extends JPanel {
    public DPanel() {
        initComponents();
    }

    private void btDeleteMouseClicked(MouseEvent e) {
        // TODO add your code here
        DeviceB dv = new DeviceB();
        // TODO add your code here
        try{

            int row = table1.getSelectedRow();
            int ids= (int) table1.getValueAt(row, 0);
            System.out.println(ids);

            if(row == 0 || ids == 0 ){
                JOptionPane.showMessageDialog(this,"There are no items to choose from");
            }
            else{
                int choose= JOptionPane.showConfirmDialog(this, "Do you want to delete?", "Confirm", JOptionPane.YES_NO_OPTION);
                if(choose != JOptionPane.YES_OPTION){
                    return;
                }
                else{
                    dv.setId(ids);
                    ConJDBC.deleteb(dv);
                }
            }
        }
        catch(Exception ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this,"There are no items to choose from");
        }


    }

    private void button1MouseClicked(MouseEvent e) {
        // TODO add your code here
        try{
            int row = table1.getSelectedRow();
            int id= (int) table1.getValueAt(row, 0);
            String name  = (String) table1.getValueAt(row, 1);
            String position = (String) table1.getValueAt(row, 2);
            String status = (String) table1.getValueAt(row, 3);
            String date = (String) table1.getValueAt(row, 4);
            String note = (String) table1.getValueAt(row, 5);


           ConfirmDialog ud = new ConfirmDialog();
            ud.txId.setText(id +"");
            ud.txId.setEditable(false);
            ud.txName.setText(name);
            ud.txP.setText(position);
            ud.txS.setText(status);
            ud.txDate.setText(date);
            ud.txNote.setText(note);
            ud.setVisible(true);
            ud.setLocationRelativeTo(null);
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }


    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        tabbedPane1 = new JTabbedPane();
        scrollPane1 = new JScrollPane();
        table1 = new JTable();
        button1 = new JButton();
        btDelete = new JButton();
        panel1 = new JPanel();
        label1 = new JLabel();

        //======== this ========

        //======== tabbedPane1 ========
        {
            tabbedPane1.setFont(new Font("JetBrains Mono ExtraBold", Font.ITALIC, 14));

            //======== scrollPane1 ========
            {

                //---- table1 ----
                table1.setModel(new DefaultTableModel(
                    new Object[][] {
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, ""},
                        {null, null, null, null, null, null},
                    },
                    new String[] {
                        "ID", "Name", "Position", "Status", "Date", "Note"
                    }
                ));
                table1.setGridColor(Color.white);
                table1.setForeground(Color.black);
                table1.setFont(new Font("JetBrains Mono ExtraBold", Font.ITALIC, 14));
                scrollPane1.setViewportView(table1);
                showDataB(ConJDBC.getAllB());
            }
            tabbedPane1.addTab("Device B", scrollPane1);
        }

        //---- button1 ----
        button1.setText("Confirm");
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button1MouseClicked(e);
            }
        });

        //---- btDelete ----
        btDelete.setText("Delete");
        btDelete.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                btDeleteMouseClicked(e);
            }
        });

        //======== panel1 ========
        {
            panel1.setBackground(new Color(80, 64, 154));

            //---- label1 ----
            label1.setText("Consider device repair");
            label1.setFont(new Font("Microsoft Uighur", Font.ITALIC, 18));
            label1.setForeground(Color.white);

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(label1)
                        .addContainerGap(648, Short.MAX_VALUE))
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(label1))
            );
        }

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup()
                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup()
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(179, 179, 179)
                                    .addComponent(button1, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
                                    .addGap(196, 196, 196)
                                    .addComponent(btDelete, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(53, 53, 53)
                                    .addComponent(tabbedPane1, GroupLayout.PREFERRED_SIZE, 667, GroupLayout.PREFERRED_SIZE)))
                            .addGap(0, 0, Short.MAX_VALUE)))
                    .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addComponent(panel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addGap(16, 16, 16)
                    .addComponent(tabbedPane1, GroupLayout.PREFERRED_SIZE, 307, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(button1)
                        .addComponent(btDelete))
                    .addContainerGap())
        );
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JTabbedPane tabbedPane1;
    private JScrollPane scrollPane1;
    private JTable table1;
    private JButton button1;
    private JButton btDelete;
    private JPanel panel1;
    private JLabel label1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    public void showDataB(java.util.List<DeviceB> DVB){
        List<DeviceB> DeviceList = new ArrayList<>();
        DeviceList = DVB;
        DefaultTableModel model;
        table1.getModel();
        model = (DefaultTableModel) table1.getModel();
        model.setRowCount(0);
        DeviceList.forEach((cf)->{
            model.addRow(new Object [] {
                    cf.getId(),cf.getName(),cf.getPosition(),cf.getStatus(),cf.getDate(),cf.getNote()
            });
        });

    };
}
