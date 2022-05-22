package remote;

import java.rmi.server.UnicastRemoteObject;

public class CustomerImplementor extends UnicastRemoteObject implements CustomerService{
    public CustomerImplementor() throws Exception{}

    @Override
    public void deposit(CustomerEntity customerEntity2) throws Exception{
        CustomerRepo customerDA = new CustomerRepo();
        customerDA.deposit(customerEntity2);
        customerDA.close();
    }

    @Override
    public void withdraw(CustomerEntity customerEntity1) throws Exception {
        CustomerRepo customerDA = new CustomerRepo();
        customerDA.withdraw(customerEntity1);
        customerDA.close();
    }


}