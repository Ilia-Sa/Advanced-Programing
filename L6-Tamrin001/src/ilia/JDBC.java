package ilia;

/*
Created by Ilia Safarian - 40012341054047
L6 - Exercise 1
 */

import java.sql.*;
import java.util.Scanner;

    public class JDBC {
        static final String DB_URL = "jdbc:mysql://127.0.0.1:3306/java";
        static final String USER = "root";
        static final String PASS = "1234jVm?@";

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Please enter the operation(insert/Update): ");
            String answer = sc.nextLine();

            try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                 Statement stmt = conn.createStatement()
            ) {
                switch (answer)
                {
                    case "insert":
                        PreparedStatement preparedStatement1 = conn.prepareStatement("insert into webuser values (?,?,?," +
                            "?,?,?)");

                        System.out.print("Please enter your id number: ");
                        WebUser.getInstance().setId(sc.nextInt());
                        preparedStatement1.setInt(1, WebUser.getInstance().getId());

                        System.out.print("Please enter your username: ");
                        WebUser.getInstance().setUsername(sc.nextLine());
                        preparedStatement1.setString(2, WebUser.getInstance().getUsername());

                        System.out.print("Please enter your email: ");
                        WebUser.getInstance().setEmail(sc.nextLine());
                        preparedStatement1.setString(3, WebUser.getInstance().getEmail());

                        System.out.print("Please enter your password: ");
                        WebUser.getInstance().setPassword(sc.nextLine());
                        preparedStatement1.setString(4, WebUser.getInstance().getPassword());

                        System.out.print("Please enter your age: ");
                        WebUser.getInstance().setAge(sc.nextInt());
                        preparedStatement1.setInt(5, WebUser.getInstance().getAge());

                        System.out.print("Please enter your education: ");
                        WebUser.getInstance().setEducation(sc.nextLine());
                        preparedStatement1.setString(6, WebUser.getInstance().getEducation());

                        System.out.println("Data inserted successfully!");
                        preparedStatement1.executeUpdate();
                        preparedStatement1.close();
                        conn.close();

                    case "update":
                        PreparedStatement preparedStatement2 = conn.prepareStatement("UPDATE webuser set name=? WHERE id=? ");

                        System.out.print("Please enter the ID you want to update: ");
                        int ID = sc.nextInt();

                        System.out.println("Please enter the new name: ");

                        preparedStatement2.setString(ID,WebUser.getInstance().getUsername());

                        System.out.println("Data updated successfully!");
                        preparedStatement2.executeUpdate();
                        preparedStatement2.close();
                        conn.close();

                    default:
                        conn.close();
                        System.out.println("Wrong input!, Please enter the available inputs!");
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }