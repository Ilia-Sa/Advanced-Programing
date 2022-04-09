package ilia;

public class Audi implements Car {
    @Override
    public void carInfo(){
        System.out.println("Brand: Audi: ");
        System.out.println("Model: R8, Type: Super Sport, Top Speed: 307 mph, HP: 562");
        System.out.println("Model: Q8, Type: SUV, Top Speed: 130mph, HP: 335");
    }
}