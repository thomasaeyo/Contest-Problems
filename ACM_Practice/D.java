import java.io.BufferedReader;
import java.util.StringTokenizer;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class D {

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
		int counter = 1;
		int ans = 0;
		ArrayList<Integer> array = new ArrayList<Integer>();
		for(int i = 0; i < n; i ++) {
			int a = reader.nextInt();
			int b = reader.nextInt();
			if(b != 0) {
				ans += a;
				counter += b - 1;
			} else {
				array.add(a);
			}
		}
		Collections.sort(array);
		if(array.size() != 0) {
			for(int c = array.size() - 1; c >= array.size() - counter; c--) {
				if(c < 0) {
					break;
				}
				ans += array.get(c);
			}
		}
		System.out.println(ans);
	}
}