package ilia;

/*
Created by Ilia Safarian - 40012341054047
Lesson 8 - Exercise 1
*/

import java.sql.*;

public class Main {
    static void  main(String str1, String str2,String str3,String str4, String str5, String str6) {
        try{
            Connection con=DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:3306/java","root","1234jVm?@");
            Statement st=con.createStatement();

            String query1="INSERT INTO `java`.`employee`"
                    + " (`name`, `last_name`, `national_code`, `phone`, `email`, `address`)"
                    + "VALUES('" +str1+"','"+str2+"',"+str3+",'"+str4+"','"+str5+"','"+str6+"')";
            st.executeUpdate(query1);

            con.close();
            System.out.println("Data Inserted Successfully!");

        }catch(Exception e){ System.out.println(e);}
    }
}