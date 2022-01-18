/*
 * Created by JFormDesigner on Mon Jan 17 16:45:00 ICT 2022
 */

package View;

import database.ConJDBC;
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

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        tabbedPane1 = new JTabbedPane();
        scrollPane1 = new JScrollPane();
        table1 = new JTable();

        //======== this ========

        //======== tabbedPane1 ========
        {

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
                        {null, null, null, null, null, ""},
                        {null, null, null, null, null, null},
                    },
                    new String[] {
                        "ID", "Name", "Position", "Status", "Date", "Note"
                    }
                ));
                table1.setGridColor(Color.white);
                table1.setFont(new Font("JetBrains Mono ExtraBold", Font.ITALIC, 14));
                scrollPane1.setViewportView(table1);
            }
            tabbedPane1.addTab("Device B", scrollPane1);
        }

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addGap(44, 44, 44)
                    .addComponent(tabbedPane1, GroupLayout.PREFERRED_SIZE, 648, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(78, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addGap(32, 32, 32)
                    .addComponent(tabbedPane1, GroupLayout.PREFERRED_SIZE, 278, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(105, Short.MAX_VALUE))
        );
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JTabbedPane tabbedPane1;
    private JScrollPane scrollPane1;
    private JTable table1;
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
