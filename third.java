import java.util.Scanner;

public class third {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("The number is: ");
		int y = sc.nextInt();
		sc.close();	
		System.out.println("Result is: " + num_root(Sum(y)));
	
	}
	static int num_root(int num) {
		if(num<=9) {
			return num;
		}
		return Sum(num); 
	}
	static int Sum(int n) {
		int sum = 0;
		while (n > 0) {
			sum = sum + n % 10;
			n = n / 10;
		}
		return sum;
	}
}

