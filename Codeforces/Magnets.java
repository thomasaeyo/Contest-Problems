import java.io.BufferedReader;
import java.util.StringTokenizer;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.IOException;

public class Magnets {

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
		int n_groups = 1;
		String prev = "";
		for(int i = 0; i < n; i++) {
			String magnet = reader.next();
			String front = magnet.substring(0,1);
			String back = magnet.substring(1,2);
			if(prev.equals(front)) {
				n_groups++;
			}
			prev = back;
		}
		System.out.println(n_groups);
	}
}