import java.util.Scanner;

public class Eating_M_Ms {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int[] array = new int[n];
		int output = 0;
		for(int a = 0; a < n; a++) {
			array[a] = sc.nextInt();
		}
		int[] pointers = pointers(array);
		for(int c = 0; c < x; c++) {
			if(array[pointers[0]] == array[pointers[1]]) {
				pointers = pointers(array);
			}
			if(array[pointers[0]] < array[pointers[1]]) {
				array[pointers[1]]--;
				output = pointers[1];
			}
			else array[pointers[0]]--; output = pointers[0];
		}
		System.out.println(output + 1);
	}

	public static int[] pointers(int[] array) {
		int[] output = new int[2];
		int pA = 0;
		int pB = 0;
		int max = 0;
		int index = 0;
		for(int x = array.length - 1; x >= 0; x--) {
			if(array[x] >= max) {
				max = array[x];
				index = x;
			}
		}
		pA = index;
		max = 0;
		for(int x = array.length - 1; x >= 0; x--) {
			if(x != pA && array[x] >= max) {
				max = array[x];
				index = x;
			}
		}
		pB = index;
		output[0] = pA;
		output[1] = pB;
		return output;
	}
}