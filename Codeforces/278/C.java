import java.util.Scanner;


public class C {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int hpy = sc.nextInt();
		int atky = sc.nextInt();
		int defy = sc.nextInt();

		int hpm = sc.nextInt();
		int atkm = sc.nextInt();
		int defm = sc.nextInt();

		int h = sc.nextInt();
		int a = sc.nextInt();
		int d = sc.nextInt();

		int price = 0;

		int num_y = calcNum(hpm, atky, defm);
		int num_m = calcNum(hpy, atkm, defy);

		while(num_y > num_m) {

			int inc_a = calcNum(hpm, atky + 1, defm);
			int diff_a = num_m / inc_a;
			int inc_h = calcNum(hpy + 1, atkm, defy);
			int inc_d = calcNum(hpy, atkm, defy + 1);

			
		}
	}

	// returns: minimum number of attacks needed.
	public static int calcNum(hp, atk, def) {
		int num = hp / (atk - def);
		if(hp % (atk - def) != 0) num += 1;

		return num;
	}
}