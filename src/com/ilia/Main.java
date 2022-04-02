//Ilia Safarian - 40012341054047
package com.ilia;

public class Main {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("John");
        p.setFamily("Price");
        p.setAge(46);
        p.setPass("Black_Viking");
        p.setUsername("Bravo-6");
        p.setJob("SAS");
        System.out.println(p.getName());
        System.out.println(p.getFamily());
        System.out.println(p.getAge());
        System.out.println(p.getPass());
        System.out.println(p.getUsername());
        System.out.println(p.getJob());
    }
}

