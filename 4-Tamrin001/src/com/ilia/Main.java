//Ilia Safarian - 40012341054047
package com.ilia;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, Student> studentMap = new HashMap<>();
        boolean userConformation = true;
        Scanner sc = new Scanner(System.in);
        Student s = new Student(0, 0);



            System.out.print("Please enter your name: ");
            String name = sc.nextLine();

            System.out.print("Please enter your student number: ");

            //checking user input
            int stuNum = 0;
            try {
                stuNum = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Error! The input must be a number.");
            }

            System.out.print("Please enter your average score: ");
            double average = sc.nextDouble();

            studentMap.put(name, new Student(stuNum, average));


            Set set = studentMap.keySet();
            for (Object o : set) {
                System.out.println(o);
            }

            Collection collection = studentMap.values();
            for (Object c : collection) {
                System.out.println(c);
            }


        }
}