package remote;

import remote.UserEntity;
import java.sql.*;
import java.util.*;

public class UserRepository {
    private Connection connection;
    private PreparedStatement preparedStatement;

    public UserRepository() throws Exception{
        connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/java","root","1234jVm?@");
    }
    public void register(UserEntity userEntity) throws Exception {
        preparedStatement = connection.prepareStatement("Insert INTO userdata (email,username,password) values (?,?," +
                "?)");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your Email address: ");
        userEntity.setEmail(scanner.nextLine());
        preparedStatement.setString(1, userEntity.getEmail());

        System.out.print("Please enter your Username: ");
        userEntity.setUsername(scanner.nextLine());
        preparedStatement.setString(2, userEntity.getUsername());

        System.out.print("Please enter your Password: ");
        userEntity.setPassword(scanner.nextLine());
        preparedStatement.setString(3, userEntity.getPassword());
        preparedStatement.executeUpdate();
    }

    public void Update(UserEntity userEntity) throws Exception{
        preparedStatement = connection.prepareStatement("UPDATE userdata set password=? Where username=?");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your new Username: ");
        userEntity.setUsername(scanner.nextLine());
        preparedStatement.setString(1, userEntity.getUsername());

        System.out.print("Please enter your Password: ");
        userEntity.setPassword(scanner.nextLine());
        preparedStatement.setString(2, userEntity.getPassword());
        preparedStatement.executeUpdate();
    }

    public void close() throws Exception{
        preparedStatement.close();
        connection.close();
    }
}