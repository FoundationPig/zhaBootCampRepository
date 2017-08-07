package Day3Exercise6;

public class Tank3 {

	int waterlevel = 0;

	Tank3() {
		this(0);
	}

	public Tank3(int waterLevel) {
		this.waterlevel = waterLevel;
	}

	public void displayWaterLevel() {
		System.out.println("Water Level " + this.waterlevel);
	}

	public void emptyWater() {
		this.waterlevel = 0;
	}

	protected void finalize() {
		if(1 > waterlevel) {
			System.out.println("Tank is empty");
		}
			
		
		
	}

}
