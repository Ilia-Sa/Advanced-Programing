package ilia;

import java.util.*;
/*
Created by Ilia Safarian - Student Number: 40012341054047
L5- Exercise 2
 */

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter your username: ");
        User.getInstance().setUserName(sc.nextLine());

        System.out.print("Please enter your first name: ");
        User.getInstance().setFirstName(sc.nextLine());

        System.out.print("Please enter your last name: ");
        User.getInstance().setLastName(sc.nextLine());

        System.out.print("Please enter your password: ");
        User.getInstance().setPassWord(sc.nextLine());

        System.out.print("Please confirm your password: ");
        User.getInstance().setConfirmPass(sc.nextLine());

        if (User.getInstance().getPassWord().equals(User.getInstance().getConfirmPass()))
            System.out.println("Password Confirmed");
        else
            throw new ArithmeticException("Error! Your passwords doesn't match!");

        User.getInstance().showUserInfo();





    }
}
