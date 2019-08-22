package oopsImplementation;

public class Bird {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
		
		public String reproduction = "egg";
		public String outerCovering = "feather";
		
		public void flyUp(){
			System.out.println("Flying Up");
		}
		
		public void flyDown(){
			System.out.println("Flying down");
		}

public void eat() {
	System.out.println(" The bird eats insects");
}

public void fly() {
	System.out.println(" The bird is flying");
}

public void fly(int height) {
	System.out.println(" The bird is flying"+height+"feet high");
}
public void fly(String name, int height) {
	System.out.println(" The "+name+"bird is flying"+height+"feet high");
}
	}


