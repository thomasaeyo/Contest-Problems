import java.util.Scanner;
import java.util.HashSet;

public class rotation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n1 = sc.nextInt();
		int[] a1 = new int[n1];
		for(int i = 0; i < n1; i ++) {
			a1[i] = sc.nextInt();
		}
		
		int n2 = sc.nextInt();
		int[] a2 = new int[n2];
		for(int i = 0; i < n2; i ++) {
			a2[i] = sc.nextInt();
		}		
		// System.out.println(sum(numbers, s));
	}

	public static boolean rotated(int[] a1, int[] a2) {
		HashSet<Integer> set = new HashSet<Integer>();		
		String output = "";

		for(int i : a) {
			set.add(i);
		}

		for(int i : a) {
			if(set.contains(s-i)) {
				output = i + ", " + (s-i);
				break;
			}
		}

		return output;
	}
}


// [1,4,6,2,4,6,7,2,3,4]