package blocks;

public class Blocks {
	
	public static void main(String[] args) {
		
		// num for min max and median
		int example1 = 30;
		int example2 = 20;
		int example3 = 50;
		
		//xor globals
		boolean yes = true;
		boolean no = false;
		
		int k = 8;
		int n = 2;
		
		int x = 28;
		
		int prime = 29;
		
		
		System.out.println("the largest number is: " + max3(example1, example2, example3));
		System.out.println("the smallest number is: " + min3(example1, example2, example3));
		System.out.println("the median number is: " + median3(example1, example2, example3));
		System.out.println("Xor response is: " + xor(yes,no));
		System.out.println("is "+ k + " a factor of " + n + " " + isFactor(k, n));
		isPerfect(x);
		isPrime(prime);
		
	}
	
	// method that finds the largest number out of 3
	public static int max3(int example1, int example2, int example3) {
		
		int largestNumber = 0;
		
		if(example1 == example2 && example2 == example3 && example1 == example3) {
			System.out.println("Please choose 3 different numbers.");
		}
		
		if(example1 > example2 && example1 > example3 ) {
			largestNumber = example1;
		}else if(example1 < example2 && example2 > example3) {
			largestNumber = example2;
		}else {
			largestNumber = example3;
		}
		
		return largestNumber;
	}
	
	public static int min3(int example1, int example2, int example3) {
		
		int smallestNumber = 0;
		
		
		if(example1 < example2 && example1 < example3 ) {
			smallestNumber = example1;
		}else if(example1 > example2 && example2 < example3) {
			smallestNumber = example2;
		}else {
			smallestNumber = example3;
		}
		
		return smallestNumber;
	}
	
	public static int median3(int example1, int example2, int example3 ) {
		int total = example1 + example2 + example3;
		int largestNumber = 0;
		int smallestNumber = 0;
		
		
		//largest num
		if(example1 > example2 && example1 > example3 ) {
			largestNumber = example1;
		}else if(example1 < example2 && example2 > example3) {
			largestNumber = example2;
		}else {
			largestNumber = example3;
		}
		
		//smallest num
		if(example1 < example2 && example1 < example3 ) {
			smallestNumber = example1;
		}else if(example1 > example2 && example2 < example3) {
			smallestNumber = example2;
		}else {
			smallestNumber = example3;
		}
		
		int median = total - (largestNumber + smallestNumber);
		return median;
	}
	
	public static boolean xor(boolean yes, boolean no) {
		boolean answer = true;
		
		if(yes == true && no == true) {
			answer = false;
		}else if (yes == true || no == true ) {
			answer = true;
		}
		
		return answer;
	}
	public static boolean isFactor(int k, int n) {
		boolean factor = true;
		
		if(k % n == 0) {
			factor = true;
		}else {
			factor = false;
		}
		
		return factor;
	}
	public static void isPerfect(int x) {
		int sum = 0;
		
		for (int i = 1; i < x; i++) {
			if(isFactor(x,i)) {
				sum = sum + i;
			}
		}
		if(sum == x) {
			System.out.println(x + " is a perfect number");
			
		}else {
			System.out.println(x + " is not a perfect number");
		}
		
	}
	public static void isPrime(int num) {
		int sum = 0;
		
		for (int i = 2; i <= num; i++) {
			if(isFactor(num, i)) {
				sum = sum + i;
			}
		}
		if(sum == num) {
			System.out.println(num + " is prime");
			
		}else {
			System.out.println(num + " is not prime");
		}
	}

}
