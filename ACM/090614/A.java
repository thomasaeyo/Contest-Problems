import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class A {
	private static class Reader {
		public BufferedReader reader;
		public StringTokenizer tokenizer;

		public Reader(InputStream inputstream) {
			reader = new BufferedReader(new InputStreamReader(inputstream));
			tokenizer = null;
		}

		public String next() throws IOException {
			if (tokenizer == null || !tokenizer.hasMoreTokens()) {
				tokenizer = new StringTokenizer(reader.readLine());
			}
			return tokenizer.nextToken();
		}

		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		public String nextLine() throws IOException {
			return reader.readLine();
		}
	}

	public static void main(String[] args) throws IOException {
		Reader reader = new Reader(System.in);
		int y = reader.nextInt();
		int k = reader.nextInt();
		int n = reader.nextInt();

		String ans = "";
		int c = 1;
		int start = y % k;
		while(y + c * k - start <= n) {
			ans += (c * k - start) + " ";
			c++;
		}

		if (ans.length() == 0)
			System.out.println(-1);
		else 
			System.out.println(ans);


	} 
}