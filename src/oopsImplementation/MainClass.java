package oopsImplementation;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Animal myAnimal=new Animal();

myAnimal.setName("eagle");
System.out.println(myAnimal.getName());

myAnimal.weight=10.3;
System.out.println(myAnimal.weight);

    //Inheritence
    Eagle myeagle=new Eagle();
    myeagle.eat();
    myeagle.flyUp();
    
//polymorphism(dynamic)-overriding
	 myeagle.eatBird();
	 
	 //static polymorphism-overloading
	 myeagle.fly();
     myeagle.fly(500);
     myeagle.fly("eagle",600);
     
     //abstaction
	AbstractAnimal myDog=new Dog() ;
	myDog.eat();
	myDog.move();
	 myDog.label();
	 AbstractAnimal myfish=new Fish() ;
	 myfish.eat();
	 myfish.move();
	 
	 //interface
	Lizard mylizard=new Lizard();
	 mylizard.eat();
	 mylizard.sound();
	mylizard.run();
	System.out.println("number of legs="+mylizard.numOfLegs);
	System.out.println("number of legs="+Reptile.numOfLegs);
}
}