package View;

import javax.swing.*;

public class EventBean {
    private String kind;
    private JPanel jpn;
    private JLabel jlb;
    private JPanel indicator;
    public EventBean() {

    }

    public EventBean(String kind, JPanel jpn, JLabel jlb) {
        this.kind = kind;
        this.jpn = jpn;
        this.jlb = jlb;
    }

    public JPanel getIndicator() {
        return indicator;
    }

    public void setIndicator(JPanel indicator) {
        this.indicator = indicator;
    }

    public EventBean(String kind, JPanel jpn, JLabel jlb, JPanel indicator) {
        this.kind = kind;
        this.jpn = jpn;
        this.jlb = jlb;
        this.indicator = indicator;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public JPanel getJpn() {
        return jpn;
    }

    public void setJpn(JPanel jpn) {
        this.jpn = jpn;
    }

    public JLabel getJlb() {
        return jlb;
    }

    public void setJlb(JLabel jlb) {
        this.jlb = jlb;
    }
}