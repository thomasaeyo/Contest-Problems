import java.util.Scanner;
import java.text.DecimalFormat;


public class practice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double d = sc.nextDouble();
		DecimalFormat df = new DecimalFormat("0.00");

		System.out.println(df.format(d));
	}
}