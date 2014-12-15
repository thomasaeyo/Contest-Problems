import java.io.BufferedReader;
import java.util.StringTokenizer;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.IOException;

public class H {

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
		int n = reader.nextInt();
		String output = "";
		for(int r = 0; r < n / 2; r ++) {
			for(int c = 0; c < n; c ++) {
				if(n/2 - r <= c && c <= n/2 + r){
					output += "D";
				} else {
					output += "*";
				}
			}
			output += "\n";
		}
		for(int r = n / 2; r < n; r ++) {
			for(int c = 0; c < n; c ++) {
				if(n/2 - (n - 1 - r) <= c && c <= n/2 + (n - 1 - r)){
					output += "D";
				} else {
					output += "*";
				}
			}
			output += "\n";
		}
		System.out.println(output);
	}
}