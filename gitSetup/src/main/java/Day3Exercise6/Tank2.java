package Day3Exercise6;

class TankClass {
	int howFull = 0;
	TankClass() {
		this(0);
		}
	TankClass(int fullness) {
		howFull = fullness;		
	}
	void sayHowFull() {
		if(howFull == 0) System.out.println("Tank is empty");
		else System.out.println("Tank filling status = " + howFull);
	}
	void empty() {
		howFull = 0;
	}
	protected void finalize() {
		if(howFull != 0)
			System.out.println("Error: Tank not empty");
		else {
			System.out.println("exit");
			System.exit(0);
		}
		// Normally, you'll also do this:
		// super.finalize(); // Call the base-class version
	}
}

public class Tank2 {
	public static void main(String[] args) {
		TankClass tank1 = new TankClass();
		TankClass tank2 = new TankClass(2);
		TankClass tank3 = new TankClass(0);
		// Proper cleanup: empty tank before going home
//		tank2.empty();
		// Drop the reference, forget to cleanup:
		new TankClass(6);
		System.out.println("Check tanks:");
		System.out.println("tank1: ");
		tank1.sayHowFull();
		System.out.println("tank2: ");
		tank2.sayHowFull();
		System.out.println("tank3: ");
		tank3.sayHowFull();
		System.out.println("first forced gc():");
		System.gc();
		// Force finalization on exit but using method
		// deprecated since JDK 1.1:
		System.out.println("try deprecated runFinalizersOnExit(true):");
		System.runFinalizersOnExit(true);
		System.out.println("last forced gc():");
		System.gc();
	}	
}
