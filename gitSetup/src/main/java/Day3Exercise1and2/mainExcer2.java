package Day3Exercise1and2;

public class mainExcer2{
	
	public static void main(String args[]) {
		Unicycle uni = new Unicycle();
		Bicycle bike = new Bicycle();
		Tricycle trike = new Tricycle();
		
		Cycle uni1 = (Cycle) uni;
		Cycle bike1 = (Cycle) bike;
		Cycle trike1 = (Cycle) trike;
		
		Cycle[] list = new Cycle[3];
		list[0] = uni1;
		list[1] = bike1;
		list[2] = trike1;
		
		uni = (Unicycle) list[0];
		bike = (Bicycle) list[1];
		trike = (Tricycle) list[2];
		
		uni.balance();
		bike.balance();
//		trike.balance();
	}

}
