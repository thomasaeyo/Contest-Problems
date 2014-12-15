import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class LovesHash {

	private static class Reader {
		public BufferedReader reader;
		public StringTokenizer tokenizer;

		public  Reader(InputStream input) {
			reader = new BufferedReader(new InputStreamReader(input));
			tokenizer = null;
		}

		public String next() throws IOException{
			while(tokenizer == null || !tokenizer.hasMoreTokens()) {
				tokenizer = new StringTokenizer(reader.readLine());
			}
			return tokenizer.nextToken();
		}

		public int nextInt() throws IOException{
			return Integer.parseInt(next());
		}
	}
	public static void main(String[] args) throws IOException{
		Reader reader = new Reader(System.in);
		int p = reader.nextInt();
		int n = reader.nextInt();
		boolean[] congruence_classes = new boolean[p];
		int ans = -2;
		for(int x = 0; x < n; x++) {
			int mod = reader.nextInt() % p;
			if(congruence_classes[mod] != false) {
				ans = x;
				break;
			}
			else {congruence_classes[mod] = true;}
		}
		System.out.println(ans + 1);
	}
}