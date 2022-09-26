package task3;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("no args");
            return;
        }
        MainFrame mf = new MainFrame(args[0]);
        mf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mf.setVisible(true);
    }
}
