package ilia;

/*
Created by Ilia Safarian - 40012341054047
L6 - Class Exercise
 */

import java.sql.*;
import java.util.*;

public class JDBCMain {
    static final String DB_URL = "jdbc:mysql://127.0.0.1:3306/java";
    static final String USER = "root";
    static final String PASS = "1234jVm?@";

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            //Asks for user operation.
            System.out.print("Do you want to (LOG IN/login) or (SIGN IN/signin)?: ");
            String answer = sc.nextLine();

            /*
            opens a connection.
             */
            try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                Statement stmt = conn.createStatement()
            ) {

                PreparedStatement preparedStatement1 = conn.prepareStatement("insert into website(name, username, " +
                        "pass, email) value(?,?,?,?) ");

                /*
                User Log in.
                 */
                switch (answer){
                    case "login":

                        System.out.print("Please enter your Username: ");
                        WebsiteUser.getInstance().setUsername(sc.nextLine());
                        preparedStatement1.setString(2,WebsiteUser.getInstance().getUsername());

                        System.out.print("Please enter your Password: ");
                        WebsiteUser.getInstance().setPassword(sc.nextLine());
                        preparedStatement1.setString(3,WebsiteUser.getInstance().getPassword());

                        System.out.println("Log in Successful!");
                        preparedStatement1.executeUpdate();
                        preparedStatement1.close();
                        conn.close();


                    /*
                    User Sign in.
                    */
                    case "signin":

                        System.out.print("Please enter your name: ");
                        WebsiteUser.getInstance().setName(sc.nextLine());
                        preparedStatement1.setString(1, WebsiteUser.getInstance().getName());

                        System.out.print("Please enter your username: ");
                        WebsiteUser.getInstance().setUsername(sc.nextLine());
                        preparedStatement1.setString(2, WebsiteUser.getInstance().getUsername());

                        System.out.print("Please enter your password: ");
                        WebsiteUser.getInstance().setPassword(sc.nextLine());
                        preparedStatement1.setString(3,WebsiteUser.getInstance().getPassword());

                        System.out.print("Please enter your email Address: ");
                        WebsiteUser.getInstance().setEmail(sc.nextLine());
                        preparedStatement1.setString(4,WebsiteUser.getInstance().getEmail());

                        System.out.println("Sign in Successful!");
                        preparedStatement1.executeUpdate();
                        preparedStatement1.close();
                        conn.close();
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
}