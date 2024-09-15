package Ass_5_mam;


/*
Write a Java program to create a base class Vehicle with methods startEngine() and stopEngine(). 
Create two subclasses Car and Motorcycle. Override the startEngine() and stopEngine() methods in 
each subclass to start and stop the engines differently. 
*/

class Vehicles {
    public void startEngine() {
        System.out.println("engine start.");	
    }

    public void stopEngine() {
        System.out.println("engine stopped.");
    }
}

class Cars extends Vehicles {
    @Override
    public void startEngine() {		
        System.out.println("Car engine start ");
    }

    @Override
    public void stopEngine() {
        System.out.println("Car engine stopped.");		
    }
}

class Motorcycle extends Vehicles {
    @Override
    public void startEngine() {
        System.out.println("Motorcycle engine is start");
    }

    @Override
    public void stopEngine() {	
        System.out.println("Motorcycle engine is stopped.");
    }
}


public class VehicleQue5 {
	public static void main(String[] args) {
		Vehicles c=new Cars();
	        c.startEngine();
	        c.stopEngine();

	        Vehicles motor = new Motorcycle();
	       motor.startEngine();
	      motor.stopEngine();
	}

}
