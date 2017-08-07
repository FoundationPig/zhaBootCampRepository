package threadPractice;

import java.util.Scanner;

public class EclipseT {

	public static void main(String args[]) {
		System.out.println("Input password to be tested");
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
//		ThreadForPassword passTh = new ThreadForPassword(input);
//		passTh.start();

	}

	public static boolean hasSmallCharacters(String a) {
		if (a.matches(".*[a-z].*")) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean hasBigCharacters(String a) {
		if (a.matches(".*[A-Z].*")) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean hasNumbers(String a) {
		if (a.matches(".*[0-9].*")) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean hasSpecialCharacters(String a) {
		if (a.matches(".*[^A-Za-z0-9].*")) {
			return true;
		} else {
			return false;
		}
	}

	class ThreadForPassword extends Thread {
		String input = "";

		public ThreadForPassword(String input2) {

			this.input = input2;

		}

		@Override
		public void run() {
			if (hasSmallCharacters(input) && hasBigCharacters(input) && hasNumbers(input)
					&& hasSpecialCharacters(input)) {
				System.out.println("Password is a pass");
			}
		}
	}
}
