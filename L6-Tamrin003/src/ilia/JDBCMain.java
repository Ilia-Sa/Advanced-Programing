package ilia;


import java.sql.*;
import java.util.Scanner;


public class JDBCMain {
    static final String DB_URL = "jdbc:mysql://127.0.0.1:3306/java";
    static final String USER = "root";
    static final String PASS = "1234jVm?@";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
             Statement stmt = conn.createStatement()
        ) {
            System.out.print("Please enter the operation: (insert/update/delete)");
            String operation = sc.nextLine();

            switch (operation){
                case "insert":
                    PreparedStatement preparedStatement1 =
                            conn.prepareStatement("insert into student values(?,?,?,?,?) ");

                    System.out.print("Please enter your Student Code: ");
                    preparedStatement1.setInt(1, Student.getInstance().setStuCode(sc.nextInt()));

                    System.out.print("Please enter your name: ");
                    preparedStatement1.setString(2, Student.getInstance().setName(sc.nextLine()));

                    System.out.print("Please enter your last name: ");
                    preparedStatement1.setString(3, Student.getInstance().setLastName(sc.nextLine()));

                    System.out.print("Please enter your entrance year: ");
                    preparedStatement1.setString(4, Student.getInstance().setYear(sc.nextInt()));

                    System.out.print("Please enter your Average Score: ");
                    preparedStatement1.setDouble(5, Student.getInstance().setAverageScore(sc.nextDouble()));

                    System.out.println("Data Was inserted into DB.");
                    preparedStatement1.executeUpdate();
                    preparedStatement1.close();


                case "update":
                    PreparedStatement preparedStatement2= conn.prepareStatement("SELECT name from student where " +
                            "lastname=? ");
                    System.out.println("Please enter the new last name: ");
                    preparedStatement2.setString(1,Student.getInstance().setLastName(sc.nextLine()));

                    System.out.println("Last name updated successfully!");
                    preparedStatement2.executeUpdate();
                    preparedStatement2.close();



                case "delete":

            }
            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
