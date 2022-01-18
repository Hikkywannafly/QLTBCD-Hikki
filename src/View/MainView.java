/*
 * Created by JFormDesigner on Mon Jan 17 11:01:25 ICT 2022
 */

package View;

import Controller.Screen;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author unknown
 */
public class MainView extends JFrame {
    public MainView() {
        initComponents();
        setVisible(true);

        Screen sc = new Screen(panelView);
        sc.setView(panelHome,labelHome,"panelHome");

        List<EventBean> listItem = new ArrayList<EventBean>();
        listItem.add(new EventBean("panelHome",panelHome,labelHome));
        listItem.add(new EventBean("panelEdit",panelEdit,labelEdit));
        listItem.add(new EventBean("panelDetail",panelBiling,labelBill));
        listItem.add(new EventBean("panelChart",panelChart,labelChart));
        sc.setEvent(listItem);
    }

    private void panelExitMouseEntered(MouseEvent e) {
        // TODO add your code here
        panelExit.setBackground(Color.RED);
        labelExit.setBackground(Color.red);
    }

    private void panelExitMouseExited(MouseEvent e) {
        // TODO add your code here
        panelExit.setBackground(Color.white);
        labelExit.setBackground(Color.white);
    }

    private void panelExitMouseClicked(MouseEvent e) {
        System.exit(0);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel1 = new JPanel();
        panel4 = new JPanel();
        panel5 = new JPanel();
        label2 = new JLabel();
        label3 = new JLabel();
        panelEdit = new JPanel();
        labelEdit = new JLabel();
        panelBiling = new JPanel();
        labelBill = new JLabel();
        panelChart = new JPanel();
        labelChart = new JLabel();
        panel6 = new JPanel();
        label4 = new JLabel();
        panel3 = new JPanel();
        panelHome = new JPanel();
        labelHome = new JLabel();
        panel10 = new JPanel();
        panel2 = new JPanel();
        panelExit = new JPanel();
        labelExit = new JLabel();
        panelView = new JPanel();
        label1 = new JLabel();

        //======== this ========
        setBackground(new Color(153, 153, 153));
        setUndecorated(true);
        var contentPane = getContentPane();

        //======== panel1 ========
        {
            panel1.setBackground(Color.white);
            panel1.setForeground(Color.white);

            //======== panel4 ========
            {
                panel4.setBackground(new Color(81, 147, 179));

                GroupLayout panel4Layout = new GroupLayout(panel4);
                panel4.setLayout(panel4Layout);
                panel4Layout.setHorizontalGroup(
                    panel4Layout.createParallelGroup()
                        .addGap(0, 120, Short.MAX_VALUE)
                );
                panel4Layout.setVerticalGroup(
                    panel4Layout.createParallelGroup()
                        .addGap(0, 20, Short.MAX_VALUE)
                );
            }

            //======== panel5 ========
            {
                panel5.setBackground(new Color(255, 204, 255));

                GroupLayout panel5Layout = new GroupLayout(panel5);
                panel5.setLayout(panel5Layout);
                panel5Layout.setHorizontalGroup(
                    panel5Layout.createParallelGroup()
                        .addGap(0, 19, Short.MAX_VALUE)
                );
                panel5Layout.setVerticalGroup(
                    panel5Layout.createParallelGroup()
                        .addGap(0, 93, Short.MAX_VALUE)
                );
            }

            //---- label2 ----
            label2.setText("Equipment ");
            label2.setForeground(Color.black);
            label2.setFont(new Font("Impact", Font.ITALIC, 19));

            //---- label3 ----
            label3.setText("Manage");
            label3.setBackground(new Color(51, 51, 51));
            label3.setForeground(Color.black);
            label3.setFont(new Font("Impact", Font.ITALIC, 18));
            label3.setVerticalAlignment(SwingConstants.TOP);

            //======== panelEdit ========
            {
                panelEdit.setBackground(Color.white);

                //---- labelEdit ----
                labelEdit.setText("Edit");
                labelEdit.setForeground(new Color(81, 147, 179));
                labelEdit.setFont(new Font("Segoe UI Black", Font.ITALIC, 16));

                GroupLayout panelEditLayout = new GroupLayout(panelEdit);
                panelEdit.setLayout(panelEditLayout);
                panelEditLayout.setHorizontalGroup(
                    panelEditLayout.createParallelGroup()
                        .addGroup(panelEditLayout.createSequentialGroup()
                            .addGap(58, 58, 58)
                            .addComponent(labelEdit)
                            .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
                panelEditLayout.setVerticalGroup(
                    panelEditLayout.createParallelGroup()
                        .addGroup(panelEditLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(labelEdit)
                            .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
            }

            //======== panelBiling ========
            {
                panelBiling.setForeground(Color.white);
                panelBiling.setBackground(Color.white);

                //---- labelBill ----
                labelBill.setText("Detail");
                labelBill.setForeground(new Color(81, 147, 179));
                labelBill.setFont(new Font("Segoe UI Black", Font.ITALIC, 16));

                GroupLayout panelBilingLayout = new GroupLayout(panelBiling);
                panelBiling.setLayout(panelBilingLayout);
                panelBilingLayout.setHorizontalGroup(
                    panelBilingLayout.createParallelGroup()
                        .addGroup(panelBilingLayout.createSequentialGroup()
                            .addGap(54, 54, 54)
                            .addComponent(labelBill, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
                panelBilingLayout.setVerticalGroup(
                    panelBilingLayout.createParallelGroup()
                        .addGroup(panelBilingLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(labelBill)
                            .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
            }

            //======== panelChart ========
            {
                panelChart.setForeground(new Color(204, 204, 204));
                panelChart.setBackground(Color.white);

                //---- labelChart ----
                labelChart.setText("Chart");
                labelChart.setForeground(new Color(81, 147, 179));
                labelChart.setFont(new Font("Segoe UI Black", Font.ITALIC, 16));

                GroupLayout panelChartLayout = new GroupLayout(panelChart);
                panelChart.setLayout(panelChartLayout);
                panelChartLayout.setHorizontalGroup(
                    panelChartLayout.createParallelGroup()
                        .addGroup(panelChartLayout.createSequentialGroup()
                            .addGap(56, 56, 56)
                            .addComponent(labelChart, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
                panelChartLayout.setVerticalGroup(
                    panelChartLayout.createParallelGroup()
                        .addGroup(panelChartLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(labelChart)
                            .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
            }

            //======== panel6 ========
            {
                panel6.setBackground(new Color(51, 51, 51));

                //---- label4 ----
                label4.setText("LOG OUT");
                label4.setForeground(Color.white);
                label4.setBackground(Color.white);

                GroupLayout panel6Layout = new GroupLayout(panel6);
                panel6.setLayout(panel6Layout);
                panel6Layout.setHorizontalGroup(
                    panel6Layout.createParallelGroup()
                        .addGroup(GroupLayout.Alignment.TRAILING, panel6Layout.createSequentialGroup()
                            .addContainerGap(17, Short.MAX_VALUE)
                            .addComponent(label4)
                            .addGap(14, 14, 14))
                );
                panel6Layout.setVerticalGroup(
                    panel6Layout.createParallelGroup()
                        .addGroup(panel6Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(label4, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
            }

            //======== panel3 ========
            {

                GroupLayout panel3Layout = new GroupLayout(panel3);
                panel3.setLayout(panel3Layout);
                panel3Layout.setHorizontalGroup(
                    panel3Layout.createParallelGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                );
                panel3Layout.setVerticalGroup(
                    panel3Layout.createParallelGroup()
                        .addGap(0, 47, Short.MAX_VALUE)
                );
            }

            //======== panelHome ========
            {
                panelHome.setBackground(Color.white);

                //---- labelHome ----
                labelHome.setText("Home");
                labelHome.setForeground(new Color(81, 147, 179));
                labelHome.setFont(new Font("Segoe UI Black", Font.ITALIC, 18));

                //======== panel10 ========
                {
                    panel10.setBackground(new Color(255, 204, 255));

                    GroupLayout panel10Layout = new GroupLayout(panel10);
                    panel10.setLayout(panel10Layout);
                    panel10Layout.setHorizontalGroup(
                        panel10Layout.createParallelGroup()
                            .addGap(0, 11, Short.MAX_VALUE)
                    );
                    panel10Layout.setVerticalGroup(
                        panel10Layout.createParallelGroup()
                            .addGap(0, 52, Short.MAX_VALUE)
                    );
                }

                GroupLayout panelHomeLayout = new GroupLayout(panelHome);
                panelHome.setLayout(panelHomeLayout);
                panelHomeLayout.setHorizontalGroup(
                    panelHomeLayout.createParallelGroup()
                        .addGroup(panelHomeLayout.createSequentialGroup()
                            .addComponent(panel10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addGap(47, 47, 47)
                            .addComponent(labelHome)
                            .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
                panelHomeLayout.setVerticalGroup(
                    panelHomeLayout.createParallelGroup()
                        .addGroup(panelHomeLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(labelHome)
                            .addContainerGap(16, Short.MAX_VALUE))
                        .addComponent(panel10, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                );
            }

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addComponent(panelChart, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelBiling, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelEdit, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelHome, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup()
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(panel5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panel1Layout.createParallelGroup()
                                    .addGroup(panel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(label2, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE))
                                    .addComponent(label3, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(panel4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(panel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panel6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup()
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(panel4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label2)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label3))
                            .addComponent(panel5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(81, 81, 81)
                        .addComponent(panelHome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelEdit, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelBiling, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelChart, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(panel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panel6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
            );
        }

        //======== panel2 ========
        {
            panel2.setBackground(new Color(81, 147, 179));

            //======== panelExit ========
            {
                panelExit.setBackground(Color.white);
                panelExit.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        panelExitMouseClicked(e);
                    }
                    @Override
                    public void mouseEntered(MouseEvent e) {
                        panelExitMouseEntered(e);
                    }
                    @Override
                    public void mouseExited(MouseEvent e) {
                        panelExitMouseExited(e);
                    }
                });

                //---- labelExit ----
                labelExit.setText("X");
                labelExit.setFont(new Font("Segoe UI Black", Font.PLAIN, 18));
                labelExit.setVerticalAlignment(SwingConstants.TOP);
                labelExit.setForeground(Color.black);

                GroupLayout panelExitLayout = new GroupLayout(panelExit);
                panelExit.setLayout(panelExitLayout);
                panelExitLayout.setHorizontalGroup(
                    panelExitLayout.createParallelGroup()
                        .addGroup(GroupLayout.Alignment.TRAILING, panelExitLayout.createSequentialGroup()
                            .addContainerGap(19, Short.MAX_VALUE)
                            .addComponent(labelExit, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                            .addGap(15, 15, 15))
                );
                panelExitLayout.setVerticalGroup(
                    panelExitLayout.createParallelGroup()
                        .addGroup(panelExitLayout.createSequentialGroup()
                            .addComponent(labelExit, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 4, Short.MAX_VALUE))
                );
            }

            GroupLayout panel2Layout = new GroupLayout(panel2);
            panel2.setLayout(panel2Layout);
            panel2Layout.setHorizontalGroup(
                panel2Layout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                        .addContainerGap(136, Short.MAX_VALUE)
                        .addComponent(panelExit, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))
            );
            panel2Layout.setVerticalGroup(
                panel2Layout.createParallelGroup()
                    .addComponent(panelExit, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );
        }

        //======== panelView ========
        {

            GroupLayout panelViewLayout = new GroupLayout(panelView);
            panelView.setLayout(panelViewLayout);
            panelViewLayout.setHorizontalGroup(
                panelViewLayout.createParallelGroup()
                    .addGap(0, 807, Short.MAX_VALUE)
            );
            panelViewLayout.setVerticalGroup(
                panelViewLayout.createParallelGroup()
                    .addGap(0, 468, Short.MAX_VALUE)
            );
        }

        //---- label1 ----
        label1.setText("Device management software in school");
        label1.setFont(new Font("Segoe UI Black", Font.ITALIC, 11));

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addComponent(panel1, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(0, 204, Short.MAX_VALUE)
                            .addComponent(label1)
                            .addGap(189, 189, 189)
                            .addComponent(panel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(panelView, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 1, Short.MAX_VALUE))))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addComponent(panel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label1))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(panelView, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE))
                .addComponent(panel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel panel1;
    private JPanel panel4;
    private JPanel panel5;
    private JLabel label2;
    private JLabel label3;
    private JPanel panelEdit;
    private JLabel labelEdit;
    private JPanel panelBiling;
    private JLabel labelBill;
    private JPanel panelChart;
    private JLabel labelChart;
    private JPanel panel6;
    private JLabel label4;
    private JPanel panel3;
    private JPanel panelHome;
    private JLabel labelHome;
    private JPanel panel10;
    private JPanel panel2;
    private JPanel panelExit;
    private JLabel labelExit;
    private JPanel panelView;
    private JLabel label1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    public static void main(String[] args) {
        //new MainView();
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            new MainView();

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
