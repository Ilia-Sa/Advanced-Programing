//Ilia Safarian - 40012341054047
package ilia;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* creating an object of user class(u1),
         * and 3 other null objects for creating clones.
         */
        User u1 = new User();
        User u2 = null;
        User u3 = null;
        User u4 = null;

        Scanner input = new Scanner(System.in);

//Asking for user id.
        System.out.print("Please enter your id:");
        u1.setId(input.nextLine());
//Asking for user password.
        System.out.print("Please enter your Password:");
        u1.setPassword(input.nextLine());


        try{
            //Creating three clones of u1 and assigning them to u2, u3 & u4.
            u2 = (User) u1.clone();
            u3 = (User) u1.clone();
            u4 = (User) u1.clone();
        }
        catch (CloneNotSupportedException e){
            System.out.println("Clone not supported");
        }

        System.out.println("Details of the original user: ");
        System.out.println(u1.getId());
        System.out.println(u1.getPassword());
        System.out.println(u1.getClass());
        System.out.println(u1.hashCode());

        System.out.println("Details of the first clone: ");
        System.out.println(u2.getId());
        System.out.println(u2.getPassword());
        System.out.println(u2.getClass());
        System.out.println(u2.hashCode());

        System.out.println("Details of the second clone: ");
        System.out.println(u3.getId());
        System.out.println(u3.getPassword());
        System.out.println(u3.getClass());
        System.out.println(u3.hashCode());

        System.out.println("Details of the third clone: ");
        System.out.println(u4.getId());
        System.out.println(u4.getPassword());
        System.out.println(u4.getClass());
        System.out.println(u4.hashCode());





    }
}
