package task2;

import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;
import javax.swing.border.TitledBorder;

public class Figure extends JFrame{
    public Figure()  {
        setSize(1050, 1050);
        JFrame myWindow = new JFrame("random figures");
        myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("paint");
        button.addActionListener((ActionEvent e) -> {
            repaint();
            setVisible(true);
        });
        myWindow.add(button);
        myWindow.pack();
        myWindow.setVisible(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    }


    @Override
    public void paint ( Graphics g ) {
        Graphics2D graph = (Graphics2D) g;
        graph.setPaint(new Color(240,240,240));
        graph.fillRect(0, 0, 1050, 1050);
        for (int i = 0; i < 20; i++) {
            Color color = new Color((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255));
            g.setColor(color);
            int[] arrayx = {(int) (Math.random() * 50) + 50 * i, (int) (Math.random() * 50) + 50 * i, (int) (Math.random() * 50) + 50 * i, (int) (Math.random() * 50) + 50 * i};
            int[] arrayy = {(int) (Math.random() * 50) + 50 * i, (int) (Math.random() * 50) + 50 * i, (int) (Math.random() * 50) + 50 * i, (int) (Math.random() * 50) + 50 * i};
            Polygon poly = new Polygon(arrayx, arrayy, 4);
            graph.drawPolygon(poly);
            graph.fillPolygon(poly);
        }

    }


    public static void main(String args[]) {
        Figure app = new Figure();
    }

}