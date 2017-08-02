package Day3Exercise6;

public class Tank3ClassMain extends Tank3{
	
	public static void main(String args[]) {
		Tank3 t1 = new Tank3(7);
		Tank3 t2 = new Tank3(6);
		Tank3 t3 = new Tank3();
		
		t1.displayWaterLevel();
		t2.displayWaterLevel();
		t3.displayWaterLevel();
		t1.emptyWater();
		
		try {
			t1.finalize();
			t2.finalize();
			t3.finalize();
		}catch (Exception E){
			E.printStackTrace();
		}
		
		
	}
	
	

}
