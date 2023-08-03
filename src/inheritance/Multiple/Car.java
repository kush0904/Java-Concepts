package inheritance.Multiple;

import java.lang.annotation.Documented;

public class Car extends Car1 implements CompanyInterface,ProductInterface {


    private String car_name;
    Car(){
        System.out.println("Car");
    }

    @Override
    public void companyName() {
        System.out.println("Audi");
    }

    public void carTypes(){
        System.out.println("Coupe");
    }

    public void productType(){
        System.out.println("Manual");
    }
}
