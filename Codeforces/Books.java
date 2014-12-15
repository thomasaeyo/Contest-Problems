import java.util.Scanner;
import java.util.Arrays;



public class Books {
	public static void main(String[] args) {
		// Inputs
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t = sc.nextInt();
		int[] books = new int[n];
		for(int i = 0; i < n; i++) {
			books[i] = sc.nextInt();
		}
		Arrays.sort(books);
		int max = 0;
		int sum = 0;
		for(int i = 0; i < n; i++) {
			if(sum + books[i] <= t) {
				sum += books[i];
				max ++;
			} else break;
		}
		System.out.println(max);
	}
}