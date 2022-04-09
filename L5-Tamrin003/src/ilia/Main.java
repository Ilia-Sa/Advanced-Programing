package ilia;
/*
created by Ilia Safarian - Student Number:40012341054047
L5- Exercise 3
 */

public class Main {
    public static void main(String[] args) {
        Car acura = CarFactory.getCar(Car.carBrand.ACURA);
        Car audi = CarFactory.getCar(Car.carBrand.AUDI);
        acura.carInfo();
        audi.carInfo();
    }
}
