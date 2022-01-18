/*
 * Created by JFormDesigner on Mon Jan 17 12:39:55 ICT 2022
 */

package View;

import javax.swing.table.*;
import Controller.Screen;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author TamNguyen
 */
public class UDPanel extends JPanel {
    public UDPanel() {
        initComponents();
        Screen sc = new Screen(this);
        List<EventBean> itemList = new ArrayList<EventBean>();
        itemList.add(new EventBean("panelEdit", panelTT,labeladd));
        sc.setEvent(itemList);

    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        labeladd = new JLabel();
        panel1 = new JPanel();
        label1 = new JLabel();
        button1 = new JButton();
        button2 = new JButton();
        tabbedPane1 = new JTabbedPane();
        scrollPane2 = new JScrollPane();
        table1 = new JTable();
        scrollPane3 = new JScrollPane();
        table2 = new JTable();
        panelTT = new JPanel();

        //======== this ========

        //---- labeladd ----
        labeladd.setIcon(new ImageIcon(getClass().getResource("/View/Pic/caret-left.png")));

        //======== panel1 ========
        {
            panel1.setBackground(new Color(80, 64, 154));

            //---- label1 ----
            label1.setText("Update / Delete Items");
            label1.setFont(new Font("Microsoft Uighur", Font.ITALIC, 18));
            label1.setForeground(Color.white);

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(label1)
                        .addContainerGap(633, Short.MAX_VALUE))
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addGap(0, 5, Short.MAX_VALUE)
                        .addComponent(label1))
            );
        }

        //---- button1 ----
        button1.setText("Delete");

        //---- button2 ----
        button2.setText("Update");

        //======== tabbedPane1 ========
        {

            //======== scrollPane2 ========
            {

                //---- table1 ----
                table1.setModel(new DefaultTableModel(
                    new Object[][] {
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                    },
                    new String[] {
                        "ID", "Name", "Position", "Status", "Note"
                    }
                ));
                table1.setGridColor(Color.white);
                table1.setFont(new Font("JetBrains Mono Medium", Font.BOLD, 14));
                table1.setForeground(Color.black);
                scrollPane2.setViewportView(table1);
            }
            tabbedPane1.addTab("Device", scrollPane2);

            //======== scrollPane3 ========
            {

                //---- table2 ----
                table2.setModel(new DefaultTableModel(
                    new Object[][] {
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                    },
                    new String[] {
                        "ID", "Name", "Day Start", "Day End", "Note"
                    }
                ));
                table2.setGridColor(Color.white);
                scrollPane3.setViewportView(table2);
            }
            tabbedPane1.addTab("Maintenance", scrollPane3);
        }

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addGap(2, 2, 2)
                    .addComponent(labeladd)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(panel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(197, Short.MAX_VALUE)
                    .addComponent(button1, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
                    .addGap(192, 192, 192)
                    .addComponent(button2, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
                    .addGap(229, 229, 229))
                .addGroup(layout.createSequentialGroup()
                    .addGap(51, 51, 51)
                    .addComponent(tabbedPane1, GroupLayout.PREFERRED_SIZE, 676, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(78, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup()
                        .addComponent(labeladd, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
                        .addComponent(panel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(35, 35, 35)
                    .addComponent(tabbedPane1, GroupLayout.PREFERRED_SIZE, 318, GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(button2)
                        .addComponent(button1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(40, 40, 40))
        );

        //======== panelTT ========
        {

            GroupLayout panelTTLayout = new GroupLayout(panelTT);
            panelTT.setLayout(panelTTLayout);
            panelTTLayout.setHorizontalGroup(
                panelTTLayout.createParallelGroup()
                    .addGap(0, 44, Short.MAX_VALUE)
            );
            panelTTLayout.setVerticalGroup(
                panelTTLayout.createParallelGroup()
                    .addGap(0, 22, Short.MAX_VALUE)
            );
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JLabel labeladd;
    private JPanel panel1;
    private JLabel label1;
    private JButton button1;
    private JButton button2;
    private JTabbedPane tabbedPane1;
    private JScrollPane scrollPane2;
    private JTable table1;
    private JScrollPane scrollPane3;
    private JTable table2;
    private JPanel panelTT;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
