package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Example1 extends JFrame
{
    JPanel[] pnl = new JPanel[12];

    public Example1()
    {
        setLayout(new GridLayout(3,4));
        for(int i = 0 ; i < pnl.length ; i++)
        {
            int r = (int) (Math.random() * 255);
            int b = (int) (Math.random() * 255);
            int g = (int) (Math.random() * 255);
            pnl[i] = new JPanel();
            pnl[i].setBackground(new Color(r,g,b));
            add(pnl[i]);
        }

        pnl[4].setLayout(new BorderLayout());
        pnl[4].add(new JButton("one"),BorderLayout.WEST);
        pnl[4].add(new JButton("two"),BorderLayout.EAST);
        pnl[4].add(new JButton("three"),BorderLayout.SOUTH);
        pnl[4].add(new JButton("four"),BorderLayout.NORTH);
        pnl[4].add(new JButton("five"),BorderLayout.CENTER);

        pnl[10].setLayout(new FlowLayout());
        pnl[10].add(new JButton("one"));

        pnl[10].add(new JButton("two"));
        pnl[10].add(new JButton("three"));
        pnl[10].add(new JButton("four"));
        pnl[10].add(new JButton("fve"));

        setSize(800,500);
    }
    public static void main(String[]args)
    {
        new Example1().setVisible(true);
    }
}