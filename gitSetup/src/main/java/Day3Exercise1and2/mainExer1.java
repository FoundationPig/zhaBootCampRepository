package Day3Exercise1and2;

public class mainExer1 {
	
	public static void main(String args[]) {
		Unicycle uni = new Unicycle();
		Bicycle bike = new Bicycle();
		Tricycle trike = new Tricycle();
		
//		Cycle uni1 = (Cycle) uni;
//		Cycle bike1 = (Cycle) bike;
//		Cycle trike1 = (Cycle) trike;

		uni.ride();
		bike.ride();
		trike.ride();
		
		
		uni.ride(new Unicycle());
		bike.ride(new Bicycle());
		trike.ride(new Tricycle());
	}

}
