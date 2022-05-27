package com.Mark.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuessFrame extends JFrame {
    public GuessFrame(){
        super();
        setSize(600,400);
        setLocation(300,250);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
        JButton button = new JButton("Apple");
        JLabel label = new JLabel("WoWoWoW");
        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
//                System.out.println("Hello5");
                label.setText("Hello!!!");
            }
        });

        setLayout(new FlowLayout());
        add(label);
        add(button);
        setVisible(true);
    }


    public static void main(String[] args) {
        GuessFrame guessFrame = new GuessFrame();
        /* guessFrame.setSize(600,400);
        guessFrame.setVisible(true); */
    }
}
