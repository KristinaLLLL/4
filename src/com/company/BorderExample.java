package com.company;

import javax.swing.*;
import javax.swing.event.MouseInputListener;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class BorderExample extends JFrame {
    private JTextField textField;
    private  int milan=0, madrid=0;
    JPanel[] pnl=new JPanel[1];
    private String n="N/A";
    public  BorderExample() {
        super("Football");


        setLayout(new GridLayout(1, 1));
        textField = new JTextField();
        JLabel last = new JLabel();
        Font fnt = new Font("Times new roman",Font.CENTER_BASELINE,40);
        textField.setFont(fnt);
        pnl[0]= new JPanel();
        add(pnl[0]);
        pnl[0].setLayout(new BorderLayout());
        JButton button1=new JButton(("AC Milan"));
        pnl[0].add(button1, BorderLayout.WEST);
        JButton button2=new JButton(("Real Madrid"));
        pnl[0].add(button2, BorderLayout.EAST);
        setSize(280, 250);
        pnl[0].add(textField, BorderLayout.CENTER);
        textField.setText(milan+"X"+madrid);
        pnl[0].add(last, BorderLayout.SOUTH);
        last.setText("Last Scorer:"+n);
        JButton button3=new JButton(("Game over!"));
        pnl[0].add(button3, BorderLayout.NORTH);
        button1.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
               textField.setText((milan+=1)+"X"+madrid);
                last.setText("Last Scorer: AC Milan");
            }

            @Override
            public void mousePressed(MouseEvent e) { }

            @Override
            public void mouseReleased(MouseEvent e) { }

            @Override
            public void mouseEntered(MouseEvent e) { }

            @Override
            public void mouseExited(MouseEvent e) { }

        });
        button2.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                textField.setText(milan+"X"+(madrid+=1));
                last.setText("Last Scorer: Real Madrid");
            }

            @Override
            public void mousePressed(MouseEvent e) { }

            @Override
            public void mouseReleased(MouseEvent e) { }

            @Override
            public void mouseEntered(MouseEvent e) { }

            @Override
            public void mouseExited(MouseEvent e) { }

        });
        button3.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (madrid>milan)
                last.setText("Winner: Real Madrid");
                else if(milan>madrid) last.setText("Winner: AC Milan");
                else last.setText("DRAW");
            }

            @Override
            public void mousePressed(MouseEvent e) { }

            @Override
            public void mouseReleased(MouseEvent e) { }

            @Override
            public void mouseEntered(MouseEvent e) { }

            @Override
            public void mouseExited(MouseEvent e) { }

        });
    }
    public static void main(String[]args)
    {
        new BorderExample().setVisible(true);
    }
}