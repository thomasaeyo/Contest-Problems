import java.util.Scanner;

public class EatingMMs {

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
		for(int i = 0; i < x; i++) {
			if(array[pointers[0]] == array[pointers[1]]) {
				pointers = pointers(array);
			}
			array[pointers[0]]--;
			output = pointers[0];
		}
		System.out.println(output+1);
	}

	//returns indices of top 2 
	public static int[] pointers(int[] array) {
		int[] output = new int[2];
		int max = 0;
		int index = 0;
		for(int x = array.length - 1; x >= 0; x--) {
			if(array[x] >= max) {
				max = array[x];
				index = x;
			}
		}
		output[0] = index;
		max = 0;
		index = 0;
		for(int x = array.length - 1; x >= 0; x--) {
			if(x != output[0] && array[x] >= max) {
				max = array[x];
				index = x;
			}
		}
		output[1] = index;
		return output;
	}
}