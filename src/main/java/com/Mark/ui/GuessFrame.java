package com.Mark.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuessFrame extends JFrame {
    //Fields
    JButton button = new JButton("Apple");
    JLabel label = new JLabel("WoWoWoW");
    JTextField number = new JTextField(10);
    //Constructor
    public GuessFrame(){
        super();
        setSize(500,300);
        setLocation(300,250);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                System.out.println("Hello5");
//                label.setText("Hello!!!");
                int num = Integer.parseInt(number.getText());
                System.out.println(num);
            }
        });
        setLayout(new FlowLayout());
        add(number);
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
