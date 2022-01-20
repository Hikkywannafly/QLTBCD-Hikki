package Controller;

import database.ConJDBC;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

import javax.swing.*;
import java.awt.*;

public class ChartCon {

    public ChartCon() {

    }

    public void setDataToChart1(JPanel jpnItem) {


        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        int nd = ConJDBC.countDevice();
        int bd =ConJDBC.countDeviceB();
        dataset.addValue(nd,"Quantily","Devices Normal");
        dataset.addValue(bd,"Quantily","Devices Broken");
        dataset.addValue(nd+bd,"Quantily","Devices");
        JFreeChart barChart = ChartFactory.createBarChart(
                "Device chart".toUpperCase(),
                "Devices", "Quantily",
                dataset, PlotOrientation.VERTICAL, false, true, false);

        ChartPanel chartPanel = new ChartPanel(barChart);
        chartPanel.setPreferredSize(new Dimension(jpnItem.getWidth(), 321));

        jpnItem.removeAll();
        jpnItem.setLayout(new CardLayout());
        jpnItem.add(chartPanel);
        jpnItem.validate();
        jpnItem.repaint();
    }
}
