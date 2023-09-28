package calculator;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener {

    int c, n;
    String s1, s2, s3, s4, s5;
    JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, bClr, bDiv, bMult, bMinus, bPlus, bEquals;
    JTextField screenBox;

    Calculator() {

        setLayout(null);

        JLabel title = new JLabel("DIGITAL CALCULATOR");
        title.setFont(new Font("Raleway", Font.BOLD, 14));
        title.setForeground(Color.WHITE);
        title.setBounds(105, 10, 400, 12);
        add(title);

        screenBox = new JTextField();
        screenBox.setBounds(40, 40, 300, 40);
        screenBox.setFont(new Font("Raleway", Font.BOLD, 14));
        add(screenBox);

        b7 = new JButton("7");
        b7.setBounds(40, 100, 50, 30);
        b7.setBackground(Color.lightGray);
        b7.addActionListener(this);
        add(b7);

        b8 = new JButton("8");
        b8.setBounds(110, 100, 50, 30);
        b8.setBackground(Color.lightGray);
        b8.addActionListener(this);
        add(b8);

        b9 = new JButton("9");
        b9.setBounds(180, 100, 50, 30);
        b9.setBackground(Color.lightGray);
        b9.addActionListener(this);
        add(b9);

        bClr = new JButton("CLR");
        bClr.setBackground(Color.lightGray);
        bClr.setBounds(250, 100, 90, 30);
        bClr.addActionListener(this);
        add(bClr);

        b4 = new JButton("4");
        b4.setBounds(40, 140, 50, 30);
        b4.setBackground(Color.lightGray);
        b4.addActionListener(this);
        add(b4);

        b5 = new JButton("5");
        b5.setBounds(110, 140, 50, 30);
        b5.setBackground(Color.lightGray);
        b5.addActionListener(this);
        add(b5);

        b6 = new JButton("6");
        b6.setBounds(180, 140, 50, 30);
        b6.setBackground(Color.lightGray);
        b6.addActionListener(this);
        add(b6);

        bDiv = new JButton("/");
        bDiv.setBackground(Color.lightGray);
        bDiv.setBounds(250, 140, 90, 30);
        bDiv.addActionListener(this);
        add(bDiv);

        b1 = new JButton("1");
        b1.setBounds(40, 180, 50, 30);
        b1.setBackground(Color.lightGray);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("2");
        b2.setBounds(110, 180, 50, 30);
        b2.setBackground(Color.lightGray);
        b2.addActionListener(this);
        add(b2);

        b3 = new JButton("3");
        b3.setBounds(180, 180, 50, 30);
        b3.setBackground(Color.lightGray);
        b3.addActionListener(this);
        add(b3);

        bMult = new JButton("X");
        bMult.setBackground(Color.lightGray);
        bMult.setBounds(250, 180, 90, 30);
        bMult.addActionListener(this);
        add(bMult);

        b0 = new JButton("0");
        b0.setBounds(40, 220, 50, 30);
        b0.setBackground(Color.lightGray);
        b0.addActionListener(this);
        add(b0);

        bEquals = new JButton("=");
        bEquals.setBounds(110, 220, 50, 30);
        bEquals.setBackground(Color.lightGray);
        bEquals.addActionListener(this);
        add(bEquals);

        bMinus = new JButton("-");
        bMinus.setBounds(180, 220, 50, 30);
        bMinus.setBackground(Color.lightGray);
        bMinus.addActionListener(this);
        add(bMinus);

        bPlus = new JButton("+");
        bPlus.setBackground(Color.lightGray);
        bPlus.setBounds(250, 220, 90, 30);
        bPlus.addActionListener(this);
        add(bPlus);

        setTitle("CALCULATOR");
        setSize(400, 300);
        getContentPane().setBackground(Color.DARK_GRAY);
        setLocation(330, 200);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b0) {
            s3 = screenBox.getText();
            s4 = "0";
            s5 = s3 + s4;
            screenBox.setText(s5);

        }
        if (e.getSource() == b1) {
            s3 = screenBox.getText();
            s4 = "1";
            s5 = s3 + s4;
            screenBox.setText(s5);

        }
        if (e.getSource() == b2) {
            s3 = screenBox.getText();
            s4 = "2";
            s5 = s3 + s4;
            screenBox.setText(s5);

        }
        if (e.getSource() == b3) {
            s3 = screenBox.getText();
            s4 = "3";
            s5 = s3 + s4;
            screenBox.setText(s5);

        }
        if (e.getSource() == b4) {
            s3 = screenBox.getText();
            s4 = "4";
            s5 = s3 + s4;
            screenBox.setText(s5);

        }
        if (e.getSource() == b5) {
            s3 = screenBox.getText();
            s4 = "5";
            s5 = s3 + s4;
            screenBox.setText(s5);

        }
        if (e.getSource() == b6) {
            s3 = screenBox.getText();
            s4 = "6";
            s5 = s3 + s4;
            screenBox.setText(s5);

        }
        if (e.getSource() == b7) {
            s3 = screenBox.getText();
            s4 = "7";
            s5 = s3 + s4;
            screenBox.setText(s5);

        }
        if (e.getSource() == b8) {
            s3 = screenBox.getText();
            s4 = "8";
            s5 = s3 + s4;
            screenBox.setText(s5);

        }
        if (e.getSource() == b9) {
            s3 = screenBox.getText();
            s4 = "9";
            s5 = s3 + s4;
            screenBox.setText(s5);
        }

        if (e.getSource() == bPlus) {
            s1 = screenBox.getText();
            screenBox.setText("");
            c = 1;
        }

        if (e.getSource() == bMinus) {
            s1 = screenBox.getText();
            screenBox.setText("");
            c = 2;
        }

        if (e.getSource() == bMult) {
            s1 = screenBox.getText();
            screenBox.setText("");
            c = 3;
        }

        if (e.getSource() == bDiv) {
            s1 = screenBox.getText();
            screenBox.setText("");
            c = 4;
        }

        if (e.getSource() == bEquals) {
            s2 = screenBox.getText();
            if (c == 1) {
                n = Integer.parseInt(s1) + Integer.parseInt(s2);
                screenBox.setText(String.valueOf(n));
            }
            if (c == 2) {
                n = Integer.parseInt(s1) - Integer.parseInt(s2);
                screenBox.setText(String.valueOf(n));
            }
            if (c == 3) {
                n = Integer.parseInt(s1) * Integer.parseInt(s2);
                screenBox.setText(String.valueOf(n));
            }
            if (c == 4) {
                n = Integer.parseInt(s1) / Integer.parseInt(s2);
                screenBox.setText(String.valueOf(n));
            }
        }
        if (e.getSource() == bClr) {
            screenBox.setText("");

        }
    }

    public static void main(String[] args) {
        new Calculator();
    }

}
