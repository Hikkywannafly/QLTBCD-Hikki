/*
 * Created by JFormDesigner on Mon Jan 17 12:26:10 ICT 2022
 */

package View;

import java.awt.event.*;
import database.ConJDBC;
import enity.Device;

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

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel1 = new JPanel();
        textField1 = new JTextField();
        btFind = new JButton();
        label1 = new JLabel();
        btFind2 = new JButton();
        btFind3 = new JButton();
        panel2 = new JPanel();
        panel3 = new JPanel();
        label2 = new JLabel();
        panel4 = new JPanel();
        panel5 = new JPanel();
        label3 = new JLabel();
        label4 = new JLabel();
        label5 = new JLabel();
        panel6 = new JPanel();
        panel7 = new JPanel();
        label6 = new JLabel();
        label7 = new JLabel();
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

            //---- btFind2 ----
            btFind2.setText("Reset");
            btFind2.setBackground(new Color(81, 147, 179));
            btFind2.setFont(new Font("Segoe UI Black", Font.ITALIC, 10));
            btFind2.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    btFindMouseClicked(e);
                    showData(ConJDBC.getAll());


                }
            });

            //---- btFind3 ----
            btFind3.setText("About");
            btFind3.setBackground(new Color(81, 147, 179));
            btFind3.setFont(new Font("Segoe UI Black", Font.ITALIC, 10));

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
                                    .addComponent(btFind2, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btFind3, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE))))
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
                        .addComponent(btFind2, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btFind3, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
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
            label2.setText("30");
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
                        .addGap(0, 0, Short.MAX_VALUE))
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
                        .addGap(0, 0, Short.MAX_VALUE)
                );
                panel5Layout.setVerticalGroup(
                    panel5Layout.createParallelGroup()
                        .addGap(0, 11, Short.MAX_VALUE)
                );
            }

            //---- label3 ----
            label3.setText(" 40");
            label3.setFont(new Font("Segoe UI Black", Font.BOLD, 48));
            label3.setForeground(new Color(102, 102, 102));

            GroupLayout panel4Layout = new GroupLayout(panel4);
            panel4.setLayout(panel4Layout);
            panel4Layout.setHorizontalGroup(
                panel4Layout.createParallelGroup()
                    .addComponent(panel5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(GroupLayout.Alignment.TRAILING, panel4Layout.createSequentialGroup()
                        .addGap(0, 9, Short.MAX_VALUE)
                        .addComponent(label3, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE))
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

        //======== panel6 ========
        {
            panel6.setBackground(Color.white);

            //======== panel7 ========
            {
                panel7.setBackground(new Color(255, 204, 255));

                GroupLayout panel7Layout = new GroupLayout(panel7);
                panel7.setLayout(panel7Layout);
                panel7Layout.setHorizontalGroup(
                    panel7Layout.createParallelGroup()
                        .addGap(0, 116, Short.MAX_VALUE)
                );
                panel7Layout.setVerticalGroup(
                    panel7Layout.createParallelGroup()
                        .addGap(0, 11, Short.MAX_VALUE)
                );
            }

            //---- label6 ----
            label6.setText("  40");
            label6.setFont(new Font("Segoe UI Black", Font.BOLD, 48));
            label6.setForeground(new Color(102, 102, 102));

            GroupLayout panel6Layout = new GroupLayout(panel6);
            panel6.setLayout(panel6Layout);
            panel6Layout.setHorizontalGroup(
                panel6Layout.createParallelGroup()
                    .addComponent(panel7, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label6, GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
            );
            panel6Layout.setVerticalGroup(
                panel6Layout.createParallelGroup()
                    .addGroup(panel6Layout.createSequentialGroup()
                        .addComponent(panel7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(label6, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 21, Short.MAX_VALUE))
            );
        }

        //---- label7 ----
        label7.setText("Fixing Device");
        label7.setFont(new Font("Arial Black", Font.PLAIN, 11));

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
                        {null, null, null, null, null},
                        {null, null, null, null, null},
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
                    .addContainerGap()
                    .addComponent(tabbedPane1, GroupLayout.DEFAULT_SIZE, 676, Short.MAX_VALUE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(panel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addGap(14, 14, 14))
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup()
                        .addGroup(layout.createSequentialGroup()
                            .addGap(48, 48, 48)
                            .addComponent(panel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(62, 62, 62)
                            .addComponent(label4)))
                    .addGroup(layout.createParallelGroup()
                        .addGroup(layout.createSequentialGroup()
                            .addGap(39, 39, 39)
                            .addComponent(panel4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(54, 54, 54)
                            .addComponent(label5)))
                    .addGap(46, 46, 46)
                    .addGroup(layout.createParallelGroup()
                        .addComponent(panel6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(label7)))
                    .addContainerGap(334, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                        .addComponent(panel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panel4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panel6, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label4)
                        .addComponent(label5)
                        .addComponent(label7))
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
    private JButton btFind2;
    private JButton btFind3;
    private JPanel panel2;
    private JPanel panel3;
    private JLabel label2;
    private JPanel panel4;
    private JPanel panel5;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JPanel panel6;
    private JPanel panel7;
    private JLabel label6;
    private JLabel label7;
    private JTabbedPane tabbedPane1;
    private JScrollPane scrollPane2;
    private static JTable table1;
    private JScrollPane scrollPane3;
    private JTable table2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    public static void showData(java.util.List<Device> DVL){
        List<Device> CafeList = new ArrayList<>();
        CafeList = DVL;
        DefaultTableModel model;
        table1.getModel();
        model = (DefaultTableModel) table1.getModel();
        model.setRowCount(0);
        CafeList.forEach((cf)->{
            model.addRow(new Object [] {
                    cf.getId(),cf.getName(),cf.getPosition(),cf.getStatus(),cf.getNote()
            });
        });

    };
}
