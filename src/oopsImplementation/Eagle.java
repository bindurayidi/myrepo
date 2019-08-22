package oopsImplementation;

public class Eagle extends Bird {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public String name="eagle";
	public int lifespan=15;
	
	 public void eat() {
		 System.out.println("the eagle eats rabbits");

}
	 
	 public void eatBird() {
		 super.eat();
	 } 
	 
}
