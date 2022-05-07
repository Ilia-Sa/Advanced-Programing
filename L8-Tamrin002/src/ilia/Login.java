package ilia;

/*
Created by Ilia Safarian - 40012341054047
L8 - Exercise
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener
    {

        JLabel l1, l2, l3;
        JTextField tf1;
        JButton btn1;
        JPasswordField p1;

        Login()

        {

            //sets the title
            setTitle("Login Form");
            setVisible(true);
            setSize(800, 800);
            setLayout(null);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            l1 = new JLabel("Login Form :");
            l1.setForeground(Color.blue);

            //creates text fields for user input.
            l2 = new JLabel("Enter Username:");
            l3 = new JLabel("Enter Password:");
            tf1 = new JTextField();
            p1 = new JPasswordField();
            btn1 = new JButton("Submit");



            l1.setBounds(100, 30, 400, 30);
            add(l1);
            l2.setBounds(80, 70, 200, 30);
            add(l2);
            l3.setBounds(80, 110, 200, 30);
            add(l3);
            tf1.setBounds(300, 70, 200, 30);
            add(tf1);
            p1.setBounds(300, 110, 200, 30);
            add(p1);
            btn1.setBounds(150, 160, 100, 30);
            add(btn1);

            btn1.addActionListener(this);

        }


        public void actionPerformed(ActionEvent e)

        {
            showData();
        }

        public void showData()

        {
            JFrame f1 = new JFrame();

            JLabel l, l0;

            String str1 = tf1.getText();
            char[] p = p1.getPassword();
            String str2 = new String(p);

            try {
                 final String DB_URL = "jdbc:mysql://127.0.0.1:3306/java";
                 final String USER = "root";
                 final String PASS = "1234jVm?@";


                Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);;

                PreparedStatement preparedStatement = conn.prepareStatement("select * from web where username=? " +
                        "and password=?");

                preparedStatement.setString(1, str1);
                preparedStatement.setString(2, str2);

                ResultSet rs = preparedStatement.executeQuery();

                if (rs.next())
                {
                    f1.setVisible(true);
                    f1.setSize(600, 600);
                    f1.setLayout(null);

                    l = new JLabel();
                    l0 = new JLabel("you are successfully logged in..");
                    l0.setForeground(Color.blue);


                    l.setBounds(60, 50, 400, 30);
                    l0.setBounds(60, 100, 400, 40);


                    f1.add(l);
                    f1.add(l0);

                    l.setText("Welcome " + rs.getString(1));
                    l.setForeground(Color.red);


                } else

                {
                    JOptionPane.showMessageDialog(null,
                            "Incorrect username or password..Try Again with correct detail");
                }
            }
            catch (Exception ex)
            {
                System.out.println(ex);
            }
        }
        public static void main(String arr[])

        {
            new Login();
        }
    }