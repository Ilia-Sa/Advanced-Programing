import remote.CustomerEntity;
import remote.CustomerService;

/*
Created by Ilia Safarian - 40012341054047
L10- Class Exercise - Client Code
*/

import java.rmi.Naming;
import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            CustomerService customerService = (CustomerService) Naming.lookup("//127.0.0.1/java");
            Scanner scanner = new Scanner(System.in);
            CustomerEntity customerEntity = new CustomerEntity();
            Long deposit = customerEntity.setDeposit((long) 100);
            customerService.deposit(customerEntity);

            Long Withdraw = customerEntity.setWithdraw((long) 100);
            customerService.withdraw(customerEntity);

        } catch (MalformedURLException ex) {
            ex.printStackTrace();
        } catch (NotBoundException ex) {
            ex.printStackTrace();
        } catch (RemoteException ex) {
            ex.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

