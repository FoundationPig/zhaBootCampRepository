package Day3Excercise4;


public class Fibonacci {

	public static void main(String args[]) {
		long prev = 0;
		long curr = 1;
		long result;
		long upTo = 12;		
		System.out.print(prev + ", " + curr);
		for(int x = 2; x < upTo; x++) {
			result = prev+curr;
			System.out.print(", " + result);			
			prev = curr;
			curr = result;
		}
	}

}