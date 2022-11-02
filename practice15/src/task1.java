import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class task1 extends JFrame {
    JTextField jta1 = new JTextField(10);
    JTextField jta2 = new JTextField(10);
    JButton button = new JButton("Sum up");
    JButton button1 = new JButton("Subtract");
    JButton button2 = new JButton("Divide");
    JButton button3 = new JButton("Multiply");
    Font fnt = new Font("Times new roman", Font.BOLD, 20);

    //начало конструктора класса task1
    task1() {
        super("Example");
        setLayout(new FlowLayout());
        setSize(250, 150);
// создаем надпись 1
        add(new JLabel("1st Number"));
// добавляем текстовое поле jta1
        add(jta1);
// создаем надпись 2
        add(new JLabel("2nd Number"));
// добавляем текстовое поле jta2
        add(jta2);
// добавляем кнопку
        add(button);
        add(button1);
        add(button2);
        add(button3);
//добавляем слушателя к кнопке
        button.addActionListener(new ActionListener() {
            // добавляем реализацию actionPerformed
            public void actionPerformed(ActionEvent ae) {
                try {
//переменная для хранения ввода в текстовое поле 1 
                    double x1 = Double.parseDouble(jta1.getText().trim());
//переменная для хранения ввода в текстовое поле 2 
                    double x2 = Double.parseDouble(jta2.getText().trim());
//создаем всплывающее окно INFORMATION_MESSAGE
                    JOptionPane.showMessageDialog(null, "Result = " + (x1 + x2), "Alert", JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception e) {
//создаем всплывающее окно ERROR_MESSAGE
                    JOptionPane.showMessageDialog(null, "Error in Numbers!", "alert", JOptionPane.ERROR_MESSAGE);
                }
            }
        });// конец button.addActionListener()
        button1.addActionListener(new ActionListener() {
            // добавляем реализацию actionPerformed
            public void actionPerformed(ActionEvent ae) {
                try {
//переменная для хранения ввода в текстовое поле 1
                    double x1 = Double.parseDouble(jta1.getText().trim());
//переменная для хранения ввода в текстовое поле 2
                    double x2 = Double.parseDouble(jta2.getText().trim());
//создаем всплывающее окно INFORMATION_MESSAGE
                    JOptionPane.showMessageDialog(null, "Result = " + (x1 - x2), "Alert", JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception e) {
//создаем всплывающее окно ERROR_MESSAGE
                    JOptionPane.showMessageDialog(null, "Error in Numbers!", "alert", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        button2.addActionListener(new ActionListener() {
            // добавляем реализацию actionPerformed
            public void actionPerformed(ActionEvent ae) {
                try {
//переменная для хранения ввода в текстовое поле 1
                    double x1 = Double.parseDouble(jta1.getText().trim());
//переменная для хранения ввода в текстовое поле 2
                    double x2 = Double.parseDouble(jta2.getText().trim());
//создаем всплывающее окно INFORMATION_MESSAGE
                    JOptionPane.showMessageDialog(null, "Result = " + (x1 / x2), "Alert", JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception e) {
//создаем всплывающее окно ERROR_MESSAGE
                    JOptionPane.showMessageDialog(null, "Error in Numbers!", "alert", JOptionPane.ERROR_MESSAGE);
                }
            }
        });// конец button.addActionListener()
        button3.addActionListener(new ActionListener() {
            // добавляем реализацию actionPerformed
            public void actionPerformed(ActionEvent ae) {
                try {
//переменная для хранения ввода в текстовое поле 1
                    double x1 = Double.parseDouble(jta1.getText().trim());
//переменная для хранения ввода в текстовое поле 2
                    double x2 = Double.parseDouble(jta2.getText().trim());
//создаем всплывающее окно INFORMATION_MESSAGE
                    JOptionPane.showMessageDialog(null, "Result = " + (x1 * x2), "Alert", JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception e) {
//создаем всплывающее окно ERROR_MESSAGE
                    JOptionPane.showMessageDialog(null, "Error in Numbers!", "alert", JOptionPane.ERROR_MESSAGE);
                }
            }
        });// конец button.addActionListener()
        setVisible(true);
    } // конец конструктора

    public static void main(String[] args) {
        new task1();
    } // конец main()
}