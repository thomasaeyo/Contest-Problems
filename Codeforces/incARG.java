import java.util.Scanner;

public class incARG {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String val = sc.next();
		int count = 1;
		for(int i = 0; i < n; i++) {
			if(Integer.parseInt(val.substring(i,i+1)) == 0)
				break;
			count++;
		}

		if(count > n) count = n;

		System.out.println(count);
	}
}