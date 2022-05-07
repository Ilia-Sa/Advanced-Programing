package ilia;

/*
Created by Ilia Safarian - 40012341054047
Lesson 6 - Exercise 2
 */

import com.mysql.cj.protocol.Resultset;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;
import java.util.Scanner;

public class JDBC {
    static final String DB_URL = "jdbc:mysql://127.0.0.1:3306/java";
    static final String USER = "root";
    static final String PASS = "1234jVm?@";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*
        opening a connection with DB.
         */
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
             Statement stmt = conn.createStatement()
        ) {
            //User chooses their operation from DB.
            System.out.println("Please enter the operation(insert/delete): ");
            String input = sc.nextLine();

            switch (input){
                /*
                inserts data into DB.
                */
                case "insert":
                    PreparedStatement preparedStatement =
                            conn.prepareStatement("insert into employer values(?,?,?,?,?,?,?,?) ");

                    System.out.print("Please enter your Employee Code: ");
                    preparedStatement.setInt(1, User.getInstance().seteCode(sc.nextInt()));

                    System.out.print("Please enter your name: ");
                    preparedStatement.setString(2, User.getInstance().setName(sc.nextLine()));

                    System.out.print("Please enter your last name:");
                    preparedStatement.setString(3, User.getInstance().setLastName(sc.nextLine()));

                    System.out.print("Please enter your national code");
                    preparedStatement.setInt(4, User.getInstance().setNationalCode(sc.nextInt()));

                    System.out.print("Please enter your father's name:");
                    preparedStatement.setString(5, User.getInstance().setFather(sc.nextLine()));

                    System.out.print("Please enter your designation: ");
                    preparedStatement.setString(6, User.getInstance().setDesignation(sc.nextLine()));

                    System.out.print("Please enter your phone: ");
                    preparedStatement.setInt(7, User.getInstance().setPhone(sc.nextInt()));

                    System.out.println("Please enter your background: ");
                    preparedStatement.setString(8, User.getInstance().setBackground(sc.nextLine()));

                    System.out.println("Data Was inserted into database!");
                    preparedStatement.executeUpdate();
                    preparedStatement.close();
                    conn.close();

                    /*
                    deletes from DB by using the primary key.
                     */
                case "delete":
                    PreparedStatement preparedStatement1 = conn.prepareStatement("delete from employer where code=?");

                    System.out.print("Please enter the Code you want to delete: ");
                    preparedStatement1.setLong(1,User.getInstance().seteCode(sc.nextInt()));

                    System.out.println("Deleted form DB: " + preparedStatement1.executeUpdate());
                    preparedStatement1.executeUpdate();
                    preparedStatement1.close();
                    conn.close();
            }

            System.out.println("Operation Completed!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}