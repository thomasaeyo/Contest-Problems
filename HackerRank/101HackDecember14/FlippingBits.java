import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.io.IOException;
import java.util.StringTokenizer;


public class FlippingBits {
	
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

		public long nextLong() throws IOException {
			return Long.parseLong(next());
		}
	}

	public static void main(String[] args) throws IOException{
		Reader reader = new Reader(System.in);
		int t = reader.nextInt();
		for(int i = 0; i < t; i ++) {
			System.out.println(flipBits(reader.nextLong()));
		}
	}

	public static long flipBits(long l) {
		return (long)(Math.pow(2,32) - 1 - l);
	}
}