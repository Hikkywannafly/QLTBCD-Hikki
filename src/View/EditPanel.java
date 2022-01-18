/*
 * Created by JFormDesigner on Mon Jan 17 12:34:45 ICT 2022
 */

package View;

import Controller.Screen;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author TamNguyen
 */
public class EditPanel extends JPanel {
    public EditPanel() {
        initComponents();
        Screen sc = new Screen(this);
        List<EventBean> listItem = new ArrayList<EventBean>();
        listItem.add(new EventBean("panelAdd",panelAdd,labelAdd));
        listItem.add(new EventBean("panelUD",panelUD,labelUD));
        sc.setEvent(listItem);

    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panelAdd = new JPanel();
        label1 = new JLabel();
        labelAdd = new JLabel();
        panelUD = new JPanel();
        label2 = new JLabel();
        labelUD = new JLabel();

        //======== this ========

        //======== panelAdd ========
        {
            panelAdd.setBackground(Color.white);

            //---- label1 ----
            label1.setText("ADD ITEM");
            label1.setBackground(Color.black);
            label1.setFont(new Font("Segoe UI Black", Font.ITALIC, 16));
            label1.setForeground(Color.black);

            //---- labelAdd ----
            labelAdd.setIcon(new ImageIcon(getClass().getResource("/View/Pic/icons8-equipment-64 (1).png")));

            GroupLayout panelAddLayout = new GroupLayout(panelAdd);
            panelAdd.setLayout(panelAddLayout);
            panelAddLayout.setHorizontalGroup(
                panelAddLayout.createParallelGroup()
                    .addGroup(panelAddLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(panelAddLayout.createParallelGroup()
                            .addComponent(label1)
                            .addGroup(panelAddLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(labelAdd)))
                        .addContainerGap(71, Short.MAX_VALUE))
            );
            panelAddLayout.setVerticalGroup(
                panelAddLayout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, panelAddLayout.createSequentialGroup()
                        .addContainerGap(51, Short.MAX_VALUE)
                        .addComponent(labelAdd)
                        .addGap(30, 30, 30)
                        .addComponent(label1)
                        .addContainerGap())
            );
        }

        //======== panelUD ========
        {
            panelUD.setBackground(Color.white);

            //---- label2 ----
            label2.setText("UPDATE/DELETE");
            label2.setBackground(Color.black);
            label2.setFont(new Font("Segoe UI Black", Font.ITALIC, 16));
            label2.setForeground(Color.black);

            //---- labelUD ----
            labelUD.setIcon(new ImageIcon(getClass().getResource("/View/Pic/icons8-equipment-64.png")));

            GroupLayout panelUDLayout = new GroupLayout(panelUD);
            panelUD.setLayout(panelUDLayout);
            panelUDLayout.setHorizontalGroup(
                panelUDLayout.createParallelGroup()
                    .addGroup(panelUDLayout.createSequentialGroup()
                        .addGroup(panelUDLayout.createParallelGroup()
                            .addGroup(panelUDLayout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(label2))
                            .addGroup(panelUDLayout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(labelUD)))
                        .addContainerGap(33, Short.MAX_VALUE))
            );
            panelUDLayout.setVerticalGroup(
                panelUDLayout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, panelUDLayout.createSequentialGroup()
                        .addContainerGap(42, Short.MAX_VALUE)
                        .addComponent(labelUD)
                        .addGap(39, 39, 39)
                        .addComponent(label2)
                        .addContainerGap())
            );
        }

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addGap(98, 98, 98)
                    .addComponent(panelAdd, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 168, Short.MAX_VALUE)
                    .addComponent(panelUD, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addGap(125, 125, 125))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addGap(133, 133, 133)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addComponent(panelUD, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(panelAdd, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(159, Short.MAX_VALUE))
        );
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel panelAdd;
    private JLabel label1;
    private JLabel labelAdd;
    private JPanel panelUD;
    private JLabel label2;
    private JLabel labelUD;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
