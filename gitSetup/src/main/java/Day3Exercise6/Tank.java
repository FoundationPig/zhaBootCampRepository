package Day3Exercise6;

import java.util.Scanner;

public class Tank {
	static Integer water = 1;
	static boolean condition;

	public static void main(String args[]) {

		Tank tn = new Tank();
		tn.water = 1;
		tn.condition = false;

		while (1 == 1) {
			System.out.println("Tank contains " + water + " liters of water");
			System.out
					.println("Please specify the number of liters to be added or subtracted. Use '-' sign to subtract");
			addWater();
			condition = tankEmpty(water);
			if (condition) {
				try {
					tn.finalize();
				} catch (Throwable e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	public static void addWater() {
		Scanner scan = new Scanner(System.in);
		int val = scan.nextInt();
		int checker = water + val;
		if (checker >= 0) {
			water += val;
		} else {
			System.out.println("Water which is going to be removed is greater than the existing");
		}

	}

	public static boolean tankEmpty(int x) {
		if (x < 1) {
			return true;
		} else {
			return false;
		}
	}

	public static void cleanUp() {
		System.out.println("Tank is empty");
		System.exit(0);
	}

	@Override
	protected void finalize() throws Throwable {
		cleanUp();
	}

}
