package task1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MatchResult {
    public static void main(String[] args) {
        JFrame frame = new JFrame("milan vs madrid");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 700);

        JPanel panel = new JPanel();
        panel.setBackground(Color.PINK);
        panel.setPreferredSize(new Dimension(300, 150));

        JButton milan = new JButton("AC milan");
        JButton madrid = new JButton("REAL madrid");

        JLabel result = new JLabel("result: 0 x 0");
        JLabel scorer = new JLabel("last scorer: N/A");
        JButton winner = new JButton("end match");

        panel.add(milan);
        panel.add(madrid);
        panel.add(result);
        panel.add(scorer);
        panel.add(winner);

        final int[] madrid_score = {0};
        final int[] milan_score = {0};
        milan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                scorer.setText("last scorer: milan");
                milan_score[0]++;
                result.setText(String.format("result: %d x %d", milan_score[0], madrid_score[0]));
            }
        });
        madrid.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                scorer.setText("last scorer: madrid");
                madrid_score[0]++;
                result.setText(String.format("result: %d x %d", milan_score[0], madrid_score[0]));
            }
        });
        winner.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, madrid_score[0] > milan_score[0] ? "winner: real madrid" : "winner: ac milan");
            }
        });
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);

    }
}
