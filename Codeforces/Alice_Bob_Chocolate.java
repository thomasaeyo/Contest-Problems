import java.util.Scanner;


public class Alice_Bob_Chocolate {
	public static void main(String[] args) {
		// Input
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] chocolates = new int[n];
		for(int i = 0; i < n; i++) chocolates[i] = sc.nextInt();

		int a = 0;
		int a_time = 0;
		int b = n-1;
		int b_time = 0;
		while(a < b) {
			if(a_time < b_time) {
				a_time = 0;
				b_time -= a_time;
			} else if(a_time > b_time) {
				a_time -= b_time;
				b_time = 0;
			} else {
				a_time = 0;
				b_time = 0;
			}
			// Increment/Decrement counters
			if(a_time == 0) {
				a++;
				a_time += chocolates[a];
			} 
			if(b_time == 0) {
				b--;
				if(a == b) {
					b++;
					break;
				}
				b_time += chocolates[b];
			}
		}
		System.out.println((a) + " " + (n-b));
	}
}