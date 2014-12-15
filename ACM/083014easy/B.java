import java.io.BufferedReader;
import java.util.StringTokenizer;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.IOException;

public class B {

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
		int count = 0;
		int answer = 0;
		for(int i = 0; i < n; i++) {
			int petya = reader.nextInt();
			int vasya = reader.nextInt();
			int tonya = reader.nextInt();
			if(petya == 1) count++;
			if(vasya == 1) count++;
			if(tonya == 1) count++;
			if(count >= 2) answer++;
			count = 0;
		}
		System.out.println(answer);
	}
}