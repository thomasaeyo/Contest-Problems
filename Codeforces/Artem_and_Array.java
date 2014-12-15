import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.lang.Math;

public class Artem_and_Array {
	private BufferedReader reader;
	private StringTokenizer tokenizer;

	private static class FastReader {
		public FastReader(InputStream inputstream) {
			reader = new BufferedReader(new InputStreamReader(inputstream));
			tokenizer = null;
		}

		public String nextLine() throws IOException {
			return reader.nextLine();
		}

		public String next() throws IOException{
			while(tokenizer == null || !tokenizer.hasMoreTokens()) {
				tokenizer = new StringTokenizer(reader.nextLine());
			}
			return tokenizer.nextToken();
		}

		public int nextInt() {
			return Integer.parseInt(next());
		}
	}

	public static void main(String[] args) {
		FastReader reader = new FastReader(System.in);
		int n = reader.nextInt();
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		for(int x = 0; x < n; x++) {
			numbers.add
		}




		int points = 0;
		//if(n <= 2) print(points);
		int max_i = 0;
		numbers.add(sc.nextInt());
		for(int i = 0; i < n - 1; i ++) {
			int new_number = sc.nextInt();
			if(max_i == numbers.size() - 1) {
				numbers.add(new_number);
				if(numbers.get(numbers.size() - 2) <= new_number) max_i += 1;
			}
			else {
				points = numbers(add, max_i, new_number, points);
				max_i += 1;
			}
		}
		points += finish(numbers, 0);
		print(points);
	}
	// 1 (2) // 3 1 (2) // 3 2 (1)
	public static int add(ArrayList<Integer> numbers, int max_i, int new_number, int points) {
		if(max_i == numbers.size() - 1) {
			numbers.add(new_number);
			return points;
		} else if(new_number > numbers.get(numbers.size()-1)) {
			points += Math.min(new_number, numbers.get(numbers.size() - 2));
			numbers.remove(numbers.size() - 1);
		} else {
			numbers.add(new_number);
			return points;
		}
		return add(numbers, max_i, new_number, points);
	}

	public static int finish(ArrayList<Integer> numbers, int points) {
		if(numbers.size() <= 2) return points;
		int max = 0;
		int max_i = 0;
		for(int i = 1; i < numbers.size() - 1; i++) {
			int new_points = Math.min(numbers.get(i-1), numbers.get(i+1));
			if(new_points > max) {
				max = new_points;
				max_i = i;
			}
		}
		points += max;
		numbers.remove(max_i);
		return finish(numbers, points);
	}
}