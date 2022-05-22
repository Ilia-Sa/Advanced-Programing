import remote.UserImplementor;
import remote.UserService;

/*
Created by Ilia Safarian - 40012341054047
L10- Exercise 1 - Server Code
 */

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.ServerNotActiveException;

public class Main {
    public static void main(String[] args) {
        try{
            LocateRegistry.createRegistry(1099);
            UserImplementor service = new UserImplementor();
            Naming.rebind("java",service);
            System.out.println("Server is up and running...");
        }
        catch (RemoteException e){
            e.printStackTrace();
        }
        catch (ServerNotActiveException e){
            e.printStackTrace();
        }
        catch (MalformedURLException e){
            e.printStackTrace();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
