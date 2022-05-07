package ilia;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.*;

public class Update extends JFrame {
    private JPanel contentPane;
    private JTextField t1;
    private JTextField t2;
    private JTextField t3;
    private JTextField t4;
    private JTextField t5;
    private JTextField t6;


    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Update frame = new Update();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    public Update() {

        setBounds(200, 200, 500, 500);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        JLabel l1 = new JLabel("Name");
        l1.setBounds(10, 30, 80, 20);
        contentPane.add(l1);

        JLabel l2 = new JLabel("Last Name");
        l2.setBounds(10, 80, 80, 20);
        contentPane.add(l2);

        JLabel l3 = new JLabel("National code");
        l3.setBounds(10, 130, 80, 20);
        contentPane.add(l3);

        JLabel l4 = new JLabel("Phone");
        l4.setBounds(10, 180, 80, 20);
        contentPane.add(l4);

        JLabel l5 = new JLabel("Email");
        l5.setBounds(10, 230, 80, 20);
        contentPane.add(l5);

        JLabel l6 = new JLabel("Address");
        l6.setBounds(10, 280, 80, 20);
        contentPane.add(l6);



        t1 = new JTextField();
        t1.setBounds(100, 30, 96, 20);
        contentPane.add(t1);
        t1.setColumns(10);

        t2 = new JTextField();
        t2.setBounds(100, 80, 96, 20);
        contentPane.add(t2);
        t2.setColumns(10);

        t3 = new JTextField();
        t3.setBounds(100, 130, 96, 20);
        contentPane.add(t3);
        t3.setColumns(10);

        t4 = new JTextField();
        t4.setBounds(100, 180, 96, 20);
        contentPane.add(t4);
        t4.setColumns(10);

        t5 = new JTextField();
        t5.setBounds(100, 230, 96, 20);
        contentPane.add(t5);
        t5.setColumns(10);

        t6 = new JTextField();
        t6.setBounds(100, 280, 96, 20);
        contentPane.add(t6);
        t6.setColumns(10);



        JButton b1 = new JButton("Submit");
        b1.setBounds(100,300,96,20);
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name=t1.getText();
                String lastname=t2.getText();
                String nationalCode=t3.getText();
                String phone=t4.getText();
                String email=t5.getText();
                String address=t6.getText();
                // creating an object.
                Main obj=new Main();
                obj.main(name, lastname, nationalCode, phone, email, address);
            }
        });
        b1.setBounds(212, 165, 89, 23);
        contentPane.add(b1);

    }

}
