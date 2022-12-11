package homework_5.task1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Frame extends JFrame{
    JButton milan = new JButton("AC Milan");
    JButton realm = new JButton("Real Madrid");

    JLabel res = new JLabel("Result: 0 X 0");
    JLabel ls = new JLabel("Last Scorer: N/A");

    Label win = new Label("Winner: DRAW");

    JFrame frame = new JFrame("Football");

    public void start() {

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);

        JPanel jp = new JPanel(new BorderLayout());

        milan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int Mscore = Integer.parseInt(res.getText().substring(8, 9));
                int Rscore = Integer.parseInt(res.getText().substring(12));
                if (Mscore < 7) {
                    Mscore += 1;

                    res.setText("Result: " + Mscore + " X " + Rscore);
                    ls.setText("Last Scorer: AC Milan");
                }
                if (Mscore == 7) {
                    win.setText("Winner: AC Milan");
                }
            }
        });

        realm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int Mscore = Integer.parseInt(res.getText().substring(8, 9));
                int Rscore = Integer.parseInt(res.getText().substring(12));
                if (Rscore < 7) {
                    Rscore += 1;

                    res.setText("Result: " + Mscore + " X " + Rscore);
                    ls.setText("Last Scorer: Real Madrid");
                }
                if (Rscore == 7) {
                    win.setText("Winner: Real Madrid");
                }
            }
        });

        JPanel btns = new JPanel();
        btns.add(milan);
        btns.add(realm);

        JPanel lbls = new JPanel();
        lbls.add(res);
        lbls.add(ls);

        jp.add(btns, BorderLayout.NORTH);
        jp.add(lbls, BorderLayout.CENTER);
        jp.add(win, BorderLayout.SOUTH);

        frame.getContentPane().add(jp);

        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new Frame().start();
    }
}