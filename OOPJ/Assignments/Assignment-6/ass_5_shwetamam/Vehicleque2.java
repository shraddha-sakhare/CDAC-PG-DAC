package Ass_5_mam;

/*
 * Create a base class Vehicle with attributes like make and year. Provide a constructor in Vehicle to 
initialize these attributes. Derive a class Car that has an additional attribute model and write a 
constructor that initializes make, year, and model. Write a program to create a Car object and display 
its details.
*/



class Vehicle {
    private String carName;
    private int year;

    public Vehicle(String carName, int year) {
        this.carName = carName;
        this.year = year;
    }

    public String getDetails() {
        return "carName: " + carName + ", Year: " + year;
    }

	public void stopEngine() {
		// TODO Auto-generated method stub
		
	}

	public void startEngine() {
		// TODO Auto-generated method stub
		
	}
}

class Car extends Vehicle {
    private String model;

    public Car(String carName, int year, String model) {
        super(carName, year);
        this.model = model;
    }

    @Override
    public String getDetails() {
        return super.getDetails() + ", Model: " + model;
    }
}


public class Vehicleque2 {
	public static void main(String[] args) {
        Car c = new Car("Mercedes ", 2022, "C-class");
        System.out.println(c.getDetails());
    }

}

