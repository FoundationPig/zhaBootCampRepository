package Day2Exercise1;

public class ClassB extends ClassA {
	
	
	public void upTop() {
		System.out.println("up Top in Class B!");
	}
	
	public static void main(String args[]) {
		ClassB b = new ClassB();
		ClassA upCasted = (ClassA) b;
		
		upCasted.upTop();
	}

}
