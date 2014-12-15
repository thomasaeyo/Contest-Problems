import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.io.IOException;
import java.util.StringTokenizer;


public class AdamAndTree {
	
	private static class Reader {
		public BufferedReader reader;
		public StringTokenizer tokenizer;

		public Reader(InputStream inputstream) {
			reader = new BufferedReader(new InputStreamReader(inputstream));
			tokenizer = null;
		}

		public String next() throws IOException{
			while(tokenizer == null || !tokenizer.hasMoreTokens()) {
				tokenizer = new StringTokenizer(reader.readLine());
			}
			return tokenizer.nextToken();
		}

		public String nextLine() throws IOException {
			return reader.readLine();
		}

		public int nextInt() throws IOException{
			return Integer.parseInt(next());
		}
	}

	public static void main(String[] args) throws IOException{
		Reader reader = new Reader(System.in);
		int n = reader.nextInt();
		int[] output = new int[n];
		for(int x = 2; x < n + 2; x++) {
			int next = reader.nextInt();

		}
	}
}
