import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Queue_at_the_School {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[] input = reader.readLine().split(" ");
		int n = Integer.parseInt(input[0]);
		int t = Integer.parseInt(input[1]);
		String[] children = reader.readLine().split("");
		int c;

		if(children.length == 1) {
			System.out.println(children[0]);
		} else {
			for(int i = 0; i < t; i++) {
				c = 0;
				while(c < n) {
					if(children[c].equals("B") && children[c+1].equals("G")) {
						swap(children, c, c+1);
						c += 2;
					} else {
						c++;
					}
				}
			}
			for(String s : children) System.out.print(s);
			System.out.println();
		}
	}

	public static void swap(String[] a, int i, int j) {
		String temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}