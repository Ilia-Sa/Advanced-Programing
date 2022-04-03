//Ilia Safarian - 40012341054047

package ilia;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Integer> scores = new ArrayList<>();

        Scanner input = new Scanner(System.in);

        // Objects of generic class Student with parameter Type as String
        Student<String> name = new Student<>();
        Student<String> father = new Student<>();

        // Objects of generic class Student with parameter Type as Integer
        Student<Integer> stuNum = new Student<>();


        System.out.print("Please enter your name: ");
        name.add(input.nextLine());

        System.out.print("Please enter your father's name: ");
        father.add(input.nextLine());

        System.out.print("Please enter your Student Number: ");
        stuNum.add(input.nextInt());


        for (int i=0; i<5; i++){
                System.out.println("Please enter your scores(maximum 5): ");
                scores.add(input.nextInt());
        }

        System.out.println("Name " + name);
        System.out.println("father's name " + father);
        System.out.println("Student Number " + stuNum);
        for (Integer sc: scores) {
            System.out.println(sc);
        }
    }
}