import java.io.BufferedReader;
import java.util.StringTokenizer;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Queue;
import java.util.LinkedList;


public class A {

	private static class Reader {
		public BufferedReader reader;
		public StringTokenizer tokenizer;

		public Reader(InputStream inputstream) {
			reader = new BufferedReader(new InputStreamReader(inputstream));
			tokenizer = null;
		}

		public String next() throws IOException {
			while(tokenizer == null || !tokenizer.hasMoreTokens()) {
				tokenizer = new StringTokenizer(reader.readLine());
			}
			return tokenizer.nextToken();
		}

		public String nextLine() throws IOException {
			return reader.readLine();
		}

		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}
	}

	public static void main(String[] args) throws IOException {
		Reader reader = new Reader(System.in);
		int d = reader.nextInt();
		int n = reader.nextInt();
		Queue<Integer> queue = new LinkedList<Integer>();
		for(int i = 0; i < n; i ++) {
			int val = reader.nextInt();
			queue.add(val);
		}
		int counter = 0;
		int answer = 0;
		System.out.println(queue.size());
		for(int i = 0; i < queue.size(); i ++) {
			int month = queue.poll();
			System.out.println(i + " month: " + month);
			for(int x = 0; x < month; x ++) {
				counter++;
				if(counter % d != x) {
					counter++;
					answer++;
				}
			}
		}
		System.out.println(answer);
	}
}