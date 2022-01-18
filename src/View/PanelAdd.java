/*
 * Created by JFormDesigner on Mon Jan 17 19:53:02 ICT 2022
 */

package View;

import java.awt.event.*;
import Controller.Screen;
import database.ConJDBC;
import enity.Device;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLDataException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author unknown
 */
public class PanelAdd extends JPanel {
    public PanelAdd() {
        initComponents();
        Screen sc = new Screen(this);
        List<EventBean> itemList = new ArrayList<EventBean>();
        itemList.add(new EventBean("panelEdit", panelTT,labeladd));
        sc.setEvent(itemList);

    }

    private void btAddMouseClicked(MouseEvent e) {
        // TODO add your code here
        try {
            Device dv = new Device();
            int id = Integer.parseInt(txId.getText());
            String name = txName.getText();
            String position = txP.getText();
            String status = txS.getText();
            String note = txN.getText();
            if(name.equals("") || position.equals("")|| status.equals("") ){
                System.out.println("Loi");
                JOptionPane.showMessageDialog(null,"Error some things");

            }
            else{
                dv.setId(id);
                dv.setName(name);
                dv.setPosition(position);
                dv.setStatus(status);
                dv.setNote(note);
                ConJDBC.insert(dv);
                JOptionPane.showMessageDialog(this,"Add Success!");
            }
        }
        catch(Exception ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null,"some thing was wrong");
        }

    }

    private void btClearMouseClicked(MouseEvent e) {
        // TODO add your code here
        txId.setText("");
        txName.setText("");
        txP.setText("");
        txN.setText("");
        txS.setText("");
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        labelId = new JLabel();
        txId = new JTextField();
        labelName = new JLabel();
        txName = new JTextField();
        labeladd = new JLabel();
        panel1 = new JPanel();
        label3 = new JLabel();
        panel2 = new JPanel();
        label5 = new JLabel();
        labelP = new JLabel();
        txP = new JTextField();
        labelS = new JLabel();
        txS = new JTextField();
        labelN = new JLabel();
        txN = new JTextField();
        btAdd = new JButton();
        btClear = new JButton();
        panelTT = new JPanel();

        //======== this ========

        //---- labelId ----
        labelId.setText("ID");
        labelId.setFont(new Font("Segoe UI", Font.BOLD, 12));

        //---- labelName ----
        labelName.setText("Name");
        labelName.setFont(new Font("Segoe UI", Font.BOLD, 12));

        //---- labeladd ----
        labeladd.setIcon(new ImageIcon(getClass().getResource("/View/Pic/caret-left.png")));

        //======== panel1 ========
        {
            panel1.setBackground(new Color(80, 64, 154));

            //---- label3 ----
            label3.setText("Add Items");
            label3.setFont(new Font("Microsoft Uighur", Font.ITALIC, 18));
            label3.setForeground(Color.white);

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(label3)
                        .addContainerGap(693, Short.MAX_VALUE))
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addGap(0, 5, Short.MAX_VALUE)
                        .addComponent(label3))
            );
        }

        //======== panel2 ========
        {
            panel2.setBackground(new Color(255, 204, 204));

            //---- label5 ----
            label5.setIcon(new ImageIcon(getClass().getResource("/View/Pic/wewe.png")));

            GroupLayout panel2Layout = new GroupLayout(panel2);
            panel2.setLayout(panel2Layout);
            panel2Layout.setHorizontalGroup(
                panel2Layout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                        .addContainerGap(78, Short.MAX_VALUE)
                        .addComponent(label5, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
            );
            panel2Layout.setVerticalGroup(
                panel2Layout.createParallelGroup()
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(label5, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(51, Short.MAX_VALUE))
            );
        }

        //---- labelP ----
        labelP.setText("Position");
        labelP.setFont(new Font("Segoe UI", Font.BOLD, 12));

        //---- labelS ----
        labelS.setText("Status");
        labelS.setFont(new Font("Segoe UI", Font.BOLD, 12));

        //---- labelN ----
        labelN.setText("Note");
        labelN.setFont(new Font("Segoe UI", Font.BOLD, 12));

        //---- btAdd ----
        btAdd.setText("Add");
        btAdd.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                btAddMouseClicked(e);
            }
        });

        //---- btClear ----
        btClear.setText("Clear");
        btClear.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                btClearMouseClicked(e);
            }
        });

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(labeladd)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(panel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(86, 86, 86)
                            .addComponent(btAdd, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
                            .addGap(78, 78, 78)
                            .addComponent(btClear, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE))
                        .addGroup(GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(70, 70, 70)
                            .addGroup(layout.createParallelGroup()
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(labelId, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
                                    .addGap(48, 48, 48)
                                    .addComponent(txId, GroupLayout.PREFERRED_SIZE, 148, GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(labelName, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
                                    .addGap(36, 36, 36)
                                    .addComponent(txName, GroupLayout.PREFERRED_SIZE, 148, GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(labelP, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
                                    .addGap(27, 27, 27)
                                    .addComponent(txP, GroupLayout.PREFERRED_SIZE, 148, GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(labelS, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
                                    .addGap(36, 36, 36)
                                    .addComponent(txS, GroupLayout.PREFERRED_SIZE, 148, GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(labelN, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
                                    .addGap(36, 36, 36)
                                    .addComponent(txN, GroupLayout.PREFERRED_SIZE, 148, GroupLayout.PREFERRED_SIZE)))))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 191, Short.MAX_VALUE)
                    .addComponent(panel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addGap(89, 89, 89))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup()
                        .addComponent(labeladd, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
                        .addComponent(panel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup()
                        .addGroup(layout.createSequentialGroup()
                            .addGap(84, 84, 84)
                            .addComponent(panel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(txId, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(labelId, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(txName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(labelName, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup()
                                .addComponent(txP, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(3, 3, 3)
                                    .addComponent(labelP, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup()
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(3, 3, 3)
                                    .addComponent(labelS, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
                                .addComponent(txS, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addGap(27, 27, 27)
                            .addGroup(layout.createParallelGroup()
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(3, 3, 3)
                                    .addComponent(labelN, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
                                .addComponent(txN, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(btAdd)
                        .addComponent(btClear))
                    .addGap(96, 96, 96))
        );

        //======== panelTT ========
        {

            GroupLayout panelTTLayout = new GroupLayout(panelTT);
            panelTT.setLayout(panelTTLayout);
            panelTTLayout.setHorizontalGroup(
                panelTTLayout.createParallelGroup()
                    .addGap(0, 26, Short.MAX_VALUE)
            );
            panelTTLayout.setVerticalGroup(
                panelTTLayout.createParallelGroup()
                    .addGap(0, 26, Short.MAX_VALUE)
            );
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JLabel labelId;
    private JTextField txId;
    private JLabel labelName;
    private JTextField txName;
    private JLabel labeladd;
    private JPanel panel1;
    private JLabel label3;
    private JPanel panel2;
    private JLabel label5;
    private JLabel labelP;
    private JTextField txP;
    private JLabel labelS;
    private JTextField txS;
    private JLabel labelN;
    private JTextField txN;
    private JButton btAdd;
    private JButton btClear;
    private JPanel panelTT;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
