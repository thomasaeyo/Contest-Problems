import java.util.Scanner;
import java.util.HashMap;

public class practice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] numbers = new int[n];
		for(int i = 0; i < n; i ++) {
			numbers[i] = sc.nextInt();
		}
		System.out.println(mode(numbers));
	}

	public static String mode(int[] numbers) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int mode = 0;
		int max = 0;
		for(int i : numbers) {
			if(map.containsKey(i)) {
				int n = map.get(i);
				map.put(i, n + 1);
				if(n+1 > max) {
					mode = i;
					max = n+1;
				}
			} else {
				map.put(i, 1);
				if(1 > max) {
					mode = i;
					max = 1;
				}
			}
		}
		return "Mode: " + mode + ", Max: " + max;
	}
}


// [1,4,6,2,4,6,7,2,3,4]