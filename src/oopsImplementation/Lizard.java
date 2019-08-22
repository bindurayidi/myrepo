package oopsImplementation;

public class Lizard implements InterfaceAnimal,Reptile {
	
	public void eat() {
		System.out.println("eats bugs");
	}
	public void sound() {
		System.out.println("has aclicking sound");
	}
	public void run() {
		System.out.println("runs at 2mph");
	}
}
