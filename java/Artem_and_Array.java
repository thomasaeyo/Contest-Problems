import java.util.Scanner;

public class Artem_and_Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		for(int x = 0; x < n; x++) {
			numbers.add(sc.nextInt());
		}
		System.out.println(numbers);
	}
}