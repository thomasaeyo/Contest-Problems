import java.util.Scanner;
import java.util.Arrays;


public class B {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a1;
		int a2;
		int a3;
		int a4;
		int a_min;
		int a_max;

		switch (n) {
			case 0:
				System.out.println("YES\n1\n1\n3\n3");
				break;
			case 1:
				a1 = sc.nextInt();
				a4 = 3*a1;
				a2 = 4*a1 / 2;
				a3 = 4*a1 - a2;

				System.out.println("YES\n"+a2+"\n"+a3+"\n"+a4);
				break;
			case 2:
				a1 = sc.nextInt();
				a2 = sc.nextInt();

				a_min = Math.min(a1, a2);
				a_max = Math.max(a1, a2);

				a4 = 3*a1;
				a3 = 4*a1 - a2;
				System.out.println("YES\n"+a3+"\n"+a4);
				break;
			case 3:
				a1 = sc.nextInt();
				a2 = sc.nextInt();
				a3 = sc.nextInt();

				a_max = Math.max(a1,a2);
				a_max = Math.max(a_max,a3);

				for(int i = 1; i <= 3*a_max; i++) {
					if(isSpecial(a1,a2,a3,i)) {
						System.out.println("YES\n"+i);
						return;
					}
				}

				System.out.println("NO");
				break;
			case 4:
				if(isSpecial(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt())) {
					System.out.println("YES");
				} else {
					System.out.println("NO");
				}
				break;
		}
 	}

 	public static boolean isSpecial(int a1, int a2, int a3, int a4) {
 		int min = Math.min(a1,a2);
 		min = Math.min(min, a3);
 		min = Math.min(min, a4);

 		int max = Math.max(a1,a2);
 		max = Math.max(max, a3);
 		max = Math.max(max, a4);

 		int sum = a1+a2+a3+a4;
 		if(sum % 4 != 0) return false;
 		int mean = sum / 4;
 		int median = (sum - min - max) / 2;
 		if( (sum - min - max) % 2 != 0) return false;
 		int range = max - min;

 		return (mean == median && median == range);
 	}
}