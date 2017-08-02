package Day3Exercise5;

public class Dog {
	
	public void bark(String speech) {
		System.out.println("Dog is barking");
	}
	
	public void bark(int vol) {
		System.out.println("Dog is Howling");
	}
	
	public void bark(char partner) {
		System.out.println("Dog is communicating");
	}
	
	public static void main(String args[]) {
		String a = "";
		int b = 1;
		char c = 'c';
		Dog doggy = new Dog();
		
		doggy.bark(a);
		doggy.bark(b);
		doggy.bark(c);
		
	}

}
