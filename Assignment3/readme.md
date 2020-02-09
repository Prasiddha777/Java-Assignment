# Inheritance
Inheritance is the process wherein characteristics are inherited from ancestors. Inheritance in java can be defined as a mechanism where a new class is derived from an existing class. It is possible for classes to inherit or acquire the properties and methods of other classes, just like a son can acquire some traits and behaviour from his father

## Example
public class Vehicle {
    protected String NumberPlate = null;

    public void setNumberPlate(String licenseNO) {
        this.NumberPlate = licenseNo;
    }
    public boolean InsurancePolicy;
}

//sublcass
public class Car extends Vehicle {
    int numberOfSeats = 0;
    int numberOfTires = 4;

    public String getNumberOfSeats() {
        return this.numberOfSeats;
    }
     public String getNumberPlate() ;
    }
}