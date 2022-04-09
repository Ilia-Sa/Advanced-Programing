package ilia;
/*
created by Ilia Safarian - Student Number = 40012341054047
L5 - Class Exercise
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Calculate calculate = CalculateFactory.getChar(sc.next().charAt(0));
        calculate.calc();

    }
}