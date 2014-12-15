import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class read_write {
	public static void main(String[] args) throws IOException{
		final long startTime = System.currentTimeMillis();
		/*
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int x = 0; x < n; x++) {
			a[x] = sc.nextInt();
		}
		*/
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line;
		List<String> input = new ArrayList<String>();
		while((line = reader.readLine()) != null) {
			input.add(line);
		}
		reader.close();
		final long endTime = System.currentTimeMillis();
		System.out.println("Time: " + (endTime - startTime));
	}
	public static class FastReader {
		public BufferedReader reader;

		public FastReader(InputStream inputstream) {
			reader = new BufferedReader(new InputStreamReader(inputstream));
			tokenizer = null;
		}

		public String nextLine() throws IOException{
			reader.nextLine();
		}

		public int nextInt() {
			return Integer.parseint(reader.next());
		}

	}
}