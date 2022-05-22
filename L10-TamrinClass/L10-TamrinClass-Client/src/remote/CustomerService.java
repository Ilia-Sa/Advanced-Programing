package remote;

import java.rmi.Remote;

public interface CustomerService extends Remote {
    public void deposit(CustomerEntity customerEntity2) throws Exception;

    public void withdraw(CustomerEntity customerEntity1) throws Exception;
}
