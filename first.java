import java.util.Scanner;
public class first {
		public static void main (String [] args) {
			Scanner sc = new Scanner( System.in);
			System.out.println("Time Hours: ");
			int x = sc.nextInt();
			System.out.println("Time Minutes: ");
			int y = sc.nextInt();
			System.out.println("Time Seconds: ");
			int z = sc.nextInt();
			int results = Time.Totalseconds(x,y,z) + 1;
			System.out.println("Result is:"); Time.reverse(results);
			sc.close();		
		}
		
		
		static class Time {
			
			 static int Totalseconds(int x, int y, int z) {
				return x * 3600 + y * 60 + z;
			}
			static  void reverse(int x) {
				System.out.println(x / 3600 + ":" + x % 3600 / 60 + ":" + x % 3600 % 60);
			}
			
		}
	}

