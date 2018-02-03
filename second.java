import java.util.Scanner;

public class second {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("The number N is: ");
		int n = sc.nextInt();
		int a = 0;
		int b = 0;
		int c = 0;
		for(int i=1; i<=n; i++) {
			System.out.println("Print the pasta name = ");
			String name = sc.next();
			name.trim();
			if(name.toLowerCase().equals("spagetti")) {
				a = a + 1; 
			}
			else if (name.toLowerCase().equals("penne")) {
				b = b + 1;
			}
			else if (name.toLowerCase().equals("tagliatelle")) {
				c = c + 1;
			}
		}
		
		int sum = (Math.max(Math.max(a, b), c));
		if(sum == a) {
			System.out.println("Spagetti");
		} else if(sum == b) {
			System.out.println("Penne");
		} else {
			System.out.println("Tagliatelle");
		}
		sc.close();
	}
}
