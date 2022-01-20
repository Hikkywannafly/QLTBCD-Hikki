package Controller;

import View.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;

public class Screen {
    private JPanel root;
    private String kindSelected = "";

    public Screen(JPanel root) {
        this.root = root;
    }
    public void setView (JPanel jpnItem , JLabel jblItem,String kind) {
        kindSelected = kind;
        root.removeAll();
        root.setLayout(new BorderLayout());



        switch (kind) {
            case "panelHome": {
                root.add(new HomePanel());
            }
            break;

            case "panelEdit": {
                root.add(new EditPanel());
            }
            break;
            case "panelDetail": {
                root.add(new DPanel());
            }
            break;
            case "panelChart": {
                root.add(new UDPanel());
            }
            break;

        }
        root.validate();
        root.repaint();

    }
    public void setEvent(List<EventBean>listEvent) {
        for(EventBean item : listEvent) {
            item.getJlb().addMouseListener(new labelEvent(item.getKind(), item.getJpn(), item.getJlb()));
            item.getJpn().addMouseListener(new labelEvent(item.getKind(), item.getJpn(), item.getJlb()));
        }
    }

    public class labelEvent implements MouseListener {
        private JPanel node;

        private String kind;
        private JPanel ipnItem;
        private JLabel jblItem;
        private JPanel indicator;
        public labelEvent(String kind, JPanel ipnItem, JLabel jblItem) {
            this.kind = kind;
            this.ipnItem = ipnItem;
            this.jblItem = jblItem;
        }

        @Override
        public void mouseClicked(MouseEvent e) {
            switch (kind){
                case "panelHome":
                    node =  new HomePanel();
                    // root.add(new HomePanel());
                    break;
                case "panelEdit":
                    node = new EditPanel();
                    // root.add(new EditPanel());
                    break;
                case "panelDetail":
                    node = new DPanel();
                    // root.add(new EditPanel());
                    break;
                case "panelChart":
                    node = new ChartPanel();
                    // root.add(new EditPanel());
                    break;
                case "panelAdd":
                    node = new PanelAdd();
                    break;
                case "panelUD":
                    node = new UDPanel();
                    break;

                default:
                    new HomePanel();
                    break;
            }
            root.removeAll();
            root.setLayout(new BorderLayout());
            root.add(node);
            root.validate();
            root.repaint();
        }

        @Override
        public void mousePressed(MouseEvent e) {

            ipnItem.setBackground( new Color(255,204,204));
            jblItem.setBackground( new Color(255,204,204));

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {
            ipnItem.setBackground( new Color(201, 87, 188));
            jblItem.setBackground( new Color(201, 87, 188));

        }

        @Override
        public void mouseExited(MouseEvent e) {
            ipnItem.setBackground( Color.white);
            jblItem.setBackground( Color.white);
        }
    }

}