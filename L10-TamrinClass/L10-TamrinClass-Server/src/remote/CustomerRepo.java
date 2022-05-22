package remote;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class CustomerRepo {
    private Connection connection;
    private PreparedStatement preparedStatement;
    public CustomerRepo() throws Exception
    {
        connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/java","root","1234jVm?@");
    }
    public void withdraw(CustomerEntity customerEntity1) throws Exception{
        preparedStatement = connection.prepareStatement("update account set balance=balance-? where id=?");
        preparedStatement.setLong(1, customerEntity1.getWithdraw());
        preparedStatement.setLong(2,1);
        System.out.println("There is a withdraw from first account:" + preparedStatement.executeUpdate());
    }
    public void deposit(CustomerEntity customerEntity2) throws Exception{
        preparedStatement = connection.prepareStatement("update account set ballace=balance+? where id=?");
        preparedStatement.setLong(1,customerEntity2.getDeposit());
        preparedStatement.setLong(2,2);
        System.out.println ("There is a deposit into second account: " + preparedStatement.executeUpdate());
    }
    public void close() throws Exception{
        preparedStatement.close();
        connection.close();
    }
}
