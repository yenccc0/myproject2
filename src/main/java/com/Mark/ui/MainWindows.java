package com.Mark.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindows {
    public static void main(String[] args) {
        //Graphical User Interface(GUI)
        //swing, javaFX
        //eXtension
        JFrame frame = new JFrame();
        frame.setSize(400,300);
        frame.setLocation(200,200);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JButton button = new JButton("OK");
        // Anonymous class
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("HaHaHa!!!");
            }
        });
//        MyActionListener listener = new MyActionListener();
//        button.addActionListener(listener);
        frame.setLayout(new FlowLayout());
        //frame.setLayout(new BorderLayout());
        frame.add(button);
        frame.setVisible(true);
        frame.add(button);
        frame.setVisible(true);
        System.out.println("start");
        System.out.println("End");

    }
}
