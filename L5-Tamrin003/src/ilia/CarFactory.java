package ilia;

public class CarFactory {
    public static Car getCar(Car.carBrand carBrand){
        switch (carBrand){
            case ACURA:
                return new Acura();
            case AUDI:
                return new Audi();
            case CADILLAC:
                return new Cadillac();
            default:
                return null;
        }
    }

}
