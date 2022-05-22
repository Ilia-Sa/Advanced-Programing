import remote.UserEntity;
import remote.UserService;

/*
Created by Ilia Safarian - 40012341054047
L10- Exercise 1 - Client Code
 */

import java.rmi.Naming;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
            UserService userService = (UserService) Naming.lookup("//127.0.0.1/java");
            UserEntity user = new UserEntity("ilia","1234");
        }
        catch (Exception e){

        }
    }
}
