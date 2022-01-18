/*
 * Created by JFormDesigner on Mon Jan 17 12:26:10 ICT 2022
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
import javax.swing.border.TitledBorder;
import javax.swing.table.*;

/**
 * @author TamNguyen
 */
public class HomePanel extends JPanel {
    public HomePanel() {
        initComponents();

    }

    private void btFindMouseClicked(MouseEvent e) {
        // TODO add your code here
        Device dv = new Device();
        dv.setId(Integer.parseInt(textField1.getText()));
        showData(ConJDBC.findByID(dv));
        //textField1
    }

    private void btRestMouseClicked(MouseEvent e) {
        // TODO add your code here
        showData(ConJDBC.getAll());
        showDataB(ConJDBC.getAllB());
    }

    private void btRMouseClicked(MouseEvent e) {
        // TODO add your code here
        try{
            int row = table1.getSelectedRow();
            int id= (int) table1.getValueAt(row, 0);
            String name  = (String) table1.getValueAt(row, 1);
            String position = (String) table1.getValueAt(row, 2);
            String status = (String) table1.getValueAt(row, 3);
            String note = (String) table1.getValueAt(row, 4);

            ReportDialog rd = new ReportDialog();
            rd.txId.setText(id +"");
            rd.txId.setEditable(false);
            rd.txName.setText(name);
            rd.txName.setEditable(false);
            rd.txP.setText(position);
            rd.txP.setEditable(false);
            rd.txS.setText(status);
            rd.txS.setEditable(false);
            rd.txNote.setText(note);
            rd.setVisible(true);
            rd.setLocationRelativeTo(null);
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }


    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel1 = new JPanel();
        textField1 = new JTextField();
        btFind = new JButton();
        label1 = new JLabel();
        btRest = new JButton();
        btR = new JButton();
        panel2 = new JPanel();
        panel3 = new JPanel();
        label2 = new JLabel();
        panel4 = new JPanel();
        panel5 = new JPanel();
        label3 = new JLabel();
        label4 = new JLabel();
        label5 = new JLabel();
        tabbedPane1 = new JTabbedPane();
        scrollPane2 = new JScrollPane();
        table1 = new JTable();
        scrollPane3 = new JScrollPane();
        table2 = new JTable();

        //======== this ========

        //======== panel1 ========
        {
            panel1.setForeground(Color.white);
            panel1.setBackground(Color.white);
            panel1.setBorder(new TitledBorder("Tool"));

            //---- textField1 ----
            textField1.setBackground(new Color(81, 147, 179));

            //---- btFind ----
            btFind.setText("Find");
            btFind.setBackground(new Color(81, 147, 179));
            btFind.setFont(new Font("Segoe UI Black", Font.ITALIC, 10));
            btFind.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    btFindMouseClicked(e);
                }
            });

            //---- label1 ----
            label1.setText("Enter ID here");
            label1.setBackground(Color.black);
            label1.setForeground(new Color(51, 51, 51));
            label1.setFont(new Font("Segoe UI Black", Font.ITALIC, 10));

            //---- btRest ----
            btRest.setText("Reset");
            btRest.setBackground(new Color(81, 147, 179));
            btRest.setFont(new Font("Segoe UI Black", Font.ITALIC, 10));
            btRest.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    btRestMouseClicked(e);
                }
            });

            //---- btR ----
            btR.setText("Report");
            btR.setBackground(new Color(81, 147, 179));
            btR.setFont(new Font("Segoe UI Black", Font.ITALIC, 10));
            btR.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    btRMouseClicked(e);
                }
            });

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel1Layout.createParallelGroup()
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(label1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                    .addComponent(textField1, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btFind, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(panel1Layout.createParallelGroup()
                                    .addComponent(btRest, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btR, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap())
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(textField1, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label1)
                        .addGap(18, 18, 18)
                        .addComponent(btFind, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btRest, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btR, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(133, Short.MAX_VALUE))
            );
        }

        //======== panel2 ========
        {
            panel2.setBackground(Color.white);

            //======== panel3 ========
            {
                panel3.setBackground(new Color(255, 204, 255));

                GroupLayout panel3Layout = new GroupLayout(panel3);
                panel3.setLayout(panel3Layout);
                panel3Layout.setHorizontalGroup(
                    panel3Layout.createParallelGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                );
                panel3Layout.setVerticalGroup(
                    panel3Layout.createParallelGroup()
                        .addGap(0, 11, Short.MAX_VALUE)
                );
            }

            //---- label2 ----
            int show = ConJDBC.countDevice();
            String show1 = show+"";
            label2.setText(show1);
            label2.setFont(new Font("Segoe UI Black", Font.BOLD, 48));
            label2.setForeground(new Color(102, 102, 102));

            GroupLayout panel2Layout = new GroupLayout(panel2);
            panel2.setLayout(panel2Layout);
            panel2Layout.setHorizontalGroup(
                panel2Layout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                        .addContainerGap(23, Short.MAX_VALUE)
                        .addComponent(label2, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))
                    .addComponent(panel3, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );
            panel2Layout.setVerticalGroup(
                panel2Layout.createParallelGroup()
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addComponent(panel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(label2, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 21, Short.MAX_VALUE))
            );
        }

        //======== panel4 ========
        {
            panel4.setBackground(Color.white);

            //======== panel5 ========
            {
                panel5.setBackground(new Color(255, 204, 255));

                GroupLayout panel5Layout = new GroupLayout(panel5);
                panel5.setLayout(panel5Layout);
                panel5Layout.setHorizontalGroup(
                    panel5Layout.createParallelGroup()
                        .addGap(0, 111, Short.MAX_VALUE)
                );
                panel5Layout.setVerticalGroup(
                    panel5Layout.createParallelGroup()
                        .addGap(0, 11, Short.MAX_VALUE)
                );
            }

            //---- label3 ----
            int showB = ConJDBC.countDeviceB();
            String showB1 = showB +"";
            label3.setText(showB1);
            label3.setFont(new Font("Segoe UI Black", Font.BOLD, 48));
            label3.setForeground(new Color(102, 102, 102));

            GroupLayout panel4Layout = new GroupLayout(panel4);
            panel4.setLayout(panel4Layout);
            panel4Layout.setHorizontalGroup(
                panel4Layout.createParallelGroup()
                    .addComponent(panel5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(GroupLayout.Alignment.TRAILING, panel4Layout.createSequentialGroup()
                        .addContainerGap(24, Short.MAX_VALUE)
                        .addComponent(label3, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))
            );
            panel4Layout.setVerticalGroup(
                panel4Layout.createParallelGroup()
                    .addGroup(panel4Layout.createSequentialGroup()
                        .addComponent(panel5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(label3, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
            );
        }

        //---- label4 ----
        label4.setText("Broken Device");
        label4.setFont(new Font("Arial Black", Font.PLAIN, 11));

        //---- label5 ----
        label5.setText("Normal Device");
        label5.setFont(new Font("Arial Black", Font.PLAIN, 11));

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
                showData(ConJDBC.getAll());
            }
            tabbedPane1.addTab("Device", scrollPane2);

            //======== scrollPane3 ========
            {

                //---- table2 ----
                table2.setModel(new DefaultTableModel(
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
                    },
                    new String[] {
                        "ID", "Name", "Positon", "Status", "Date", "Note"
                    }
                ));
                table2.setGridColor(Color.white);
                table2.setFont(new Font("JetBrains Mono Medium", Font.BOLD, 14));
                table2.setForeground(Color.black);
                scrollPane3.setViewportView(table2);
                showDataB(ConJDBC.getAllB());
            }
            tabbedPane1.addTab("Device B", scrollPane3);
        }

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(tabbedPane1, GroupLayout.DEFAULT_SIZE, 676, Short.MAX_VALUE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(panel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addGap(14, 14, 14))
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup()
                        .addGroup(layout.createSequentialGroup()
                            .addGap(204, 204, 204)
                            .addComponent(panel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE))
                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addContainerGap(218, Short.MAX_VALUE)
                            .addComponent(label5)
                            .addGap(124, 124, 124)))
                    .addGroup(layout.createParallelGroup()
                        .addComponent(panel4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(label4)))
                    .addGap(264, 264, 264))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup()
                        .addComponent(panel4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(panel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, Short.MAX_VALUE)))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup()
                        .addComponent(label4)
                        .addComponent(label5))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                        .addComponent(panel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tabbedPane1, GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE))
                    .addGap(26, 26, 26))
        );
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel panel1;
    private JTextField textField1;
    private JButton btFind;
    private JLabel label1;
    private JButton btRest;
    private JButton btR;
    private JPanel panel2;
    private JPanel panel3;
    private JLabel label2;
    private JPanel panel4;
    private JPanel panel5;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JTabbedPane tabbedPane1;
    private JScrollPane scrollPane2;
    private JTable table1;
    private JScrollPane scrollPane3;
    private JTable table2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    public void showData(java.util.List<Device> DVL){
        List<Device> DeviceList = new ArrayList<>();
        DeviceList = DVL;
        DefaultTableModel model;
        table1.getModel();
        model = (DefaultTableModel) table1.getModel();
        model.setRowCount(0);
        DeviceList.forEach((cf)->{
            model.addRow(new Object [] {
                    cf.getId(),cf.getName(),cf.getPosition(),cf.getStatus(),cf.getNote()
            });
        });

    };
    public void showDataB(List<DeviceB> DVB){
        List<DeviceB> DeviceList = new ArrayList<>();
        DeviceList = DVB;
        DefaultTableModel model;
        table2.getModel();
        model = (DefaultTableModel) table2.getModel();
        model.setRowCount(0);
        DeviceList.forEach((cf)->{
            model.addRow(new Object [] {
                    cf.getId(),cf.getName(),cf.getPosition(),cf.getStatus(),cf.getDate(),cf.getNote()
            });
        });

    };
}
