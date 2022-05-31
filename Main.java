package com.javaprograms;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Login");
        JPanel panel = new JPanel();
        JLabel user = new JLabel("Username");
        JLabel password = new JLabel("Password");
        JTextField username_input = new JTextField();
        JPasswordField password_input = new JPasswordField();
        JButton login = new JButton("Login");
        frame.add(panel);
        panel.setLayout(null);
        frame.setSize(320,220);
        panel.setBackground(Color.white);
        user.setBounds(20,30,80,20);
        password.setBounds(20,90,60,20);
        username_input.setBounds(100,30,170,20);
        password_input.setBounds(100,90,170,20);
        login.setBounds(105,140,80,30);
        panel.add(user);
        panel.add(password);
        panel.add(username_input);
        panel.add(password_input);
        panel.add(login);
        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String userval = username_input.getText();
                String passval = password_input.getText();
                if(userval.equals("Prabhat") && passval.equals("prabhat2605")){
                    JOptionPane.showMessageDialog(frame,"Welcome Sir!");
					frame.dispose();
                }else{
                    JOptionPane.showMessageDialog(frame,"Invailid username or password","System",JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.setVisible(true);
    }
}
