package ilia;
/*
created by Ilia Safarian - Student Number: 40012341054047
L5 - Exercise 1
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BuilderUser builderUser = new BuilderUser(null,null,null,null,0,null,0,null);

        System.out.print("Enter Username: ");
        builderUser.setUsername(sc.nextLine());

        System.out.print("Enter First name: ");
        builderUser.setName(sc.nextLine());

        System.out.print("Enter Last name: ");
        builderUser.setFamily(sc.nextLine());

        System.out.print("Enter Password: ");
        builderUser.setPassword(sc.nextLine());

        System.out.print("Enter Age: ");
        builderUser.setAge(sc.nextInt());

        System.out.print("Enter Address: ");
        builderUser.setAddress(sc.nextLine());

        System.out.print("Enter Personal Number: ");
        builderUser.setNumber(sc.nextInt());

        System.out.print("Enter Education: ");
        builderUser.setEducation(sc.nextLine());


//prints the result.
        System.out.println("Info: ");
        System.out.print("Username: ");
        System.out.println(builderUser.getUsername());

        System.out.print("First name: ");
        System.out.println(builderUser.getName());

        System.out.print("Last name: ");
        System.out.println(builderUser.getFamily());

        System.out.print("Password: ");
        System.out.println(builderUser.getPassword());

        System.out.print("Age: ");
        System.out.println(builderUser.getAge());

        System.out.print("Address: ");
        System.out.println(builderUser.getAddress());

        System.out.print("Personal Number: ");
        System.out.println(builderUser.getNumber());

        System.out.print("Education: ");
        System.out.println(builderUser.getEducation());

    }
}
