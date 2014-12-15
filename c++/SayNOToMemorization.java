import java.util.Scanner;


public class SayNOToMemorization {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long[][] pt = new long[2010][2010];
		
		for(int r = 0; r < 2010; r++) {
			for(int c = 0; c < r + 1; c++) {
				if(c == 0 || r == c)
					pt[r][c] = 1;
				else {
					pt[r][c] = pt[r-1][c-1] + pt[r-1][c];
				}
			}
		}
		
		while(sc.hasNext()) {
		int n = sc.nextInt();
		int v = sc.nextInt();
		if(n == 0 && v == 0)
			break;
		int sum = 0;
		long terms = 0;
		
		//pascal's triangle
		
		for(int k = 0; k < n/2 + 1; k++) {
			sum = n - k*2;
			terms = terms + pt[sum + v - 1][v - 1];
		}
		System.out.println(""+terms);
		}
	}
}
