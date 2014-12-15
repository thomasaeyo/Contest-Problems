import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.lang.Math;

public class I {
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
		int n = reader.nextInt();
		String ans = "";
		for(int i = 0; i < n-1; i ++) {
			int a = reader.nextInt();
			int b = reader.nextInt();
			ans += (n_reach(a,b,1) + 1) + "\n";
		}
		int a = reader.nextInt();
		int b = reader.nextInt();
		ans += (n_reach(a,b,1) + 1);
		System.out.println(ans);
	}

	private static int n_reach(int a, int b, int n) {
		int units = (int)Math.pow(2, n-1);
		if(units > a && units > b) return 0;
		else if(units > a && units <= b) {
			return 1 + n_reach(a, b-units, n+1);
		} else if(units > b && units <= a) {
			return 1 + n_reach(a-units, b, n+1);
		} else {
			return 2 + n_reach(a-units, b, n+1) + n_reach(a, b-units, n+1);
		}
	}
}