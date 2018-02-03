import java.util.Scanner;

public class fourth {
	public static void main(String[] args) {
		System.out.println("(1)	Area");
		System.out.println("(2)	Perimeter");
		System.out.println("(3)	Draw");
		System.out.println("(4)	Exit");
		Scanner sc = new Scanner(System.in);
		System.out.println("Your choice is: ");
		int c = sc.nextInt();
		while (c != 4 && c < 4 && c > 0) {
			System.out.println("Height: ");
			int h = sc.nextInt();
			System.out.println("Weight: ");
			int w = sc.nextInt();
			if (c == 1) {
				System.out.println("Area is :" + Area(w, h));
			} else if (c == 2) {
				System.out.println("Perimeter is : " + Perimeter(w, h));
			} else if (c == 3) {
				System.out.println("Symbol: ");
				char s = sc.next().charAt(0);
				repeat(w, h, s);
			}
			System.out.println("Your choice is: ");
			c = sc.nextInt();
		}
		sc.close();
	}
	static int Perimeter(int w, int h) {
		int p = 2 * h + 2 * w;
		return p;
	}
	static int Area(int w, int h) {
		int a = w * h;
		return a;
	}
	static void repeat(int w, int h, char s) {
		for (int j = 0; j < h; j++) {
			for (int i = 1; i < w; i++) {
				System.out.print(s);
			}
			System.out.println(s);
		}
	}
	
}
