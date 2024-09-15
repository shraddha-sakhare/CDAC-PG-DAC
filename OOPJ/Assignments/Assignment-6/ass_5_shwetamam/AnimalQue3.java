package Ass_5_mam;

/*Create a base class Animal with attributes like name, and methods like eat() and sleep(). Create a 
subclass Dog that inherits from Animal and has an additional method bark(). Write a program to 
demonstrate the use of inheritance by creating objects of Animal and Dog and calling their methods.
*/



class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;		
    }

    public void eat() {
        System.out.println(name + "  eating");	
    }
    public void sleep() {
        System.out.println(name + "  sleeping");
    }
}

class Dog extends Animal {
    public Dog(String name) {	
        super(name);
    }

    public void bark() {
        System.out.println("barking");
    }
}

public class AnimalQue3 {

	public static void main(String[] args) {
	   
		Animal animal = new Animal("Lion");
        animal.eat();
        animal.sleep();

        Dog dog = new Dog("Puppy");	
        dog.eat();
        dog.sleep();
        dog.bark();
	/*
		Dog g=(Dog) new Animal("lion");
		g.eat();
		g.bark();
		g.sleep();
		*/
		
	}

}
