import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.io.IOException;
import java.util.StringTokenizer;


public class LovesString {
	
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
		String s = reader.next();
		char[] charArray = s.toCharArray();
		int k = reader.nextInt();
		int[] values = new int[26];
		int max = 0;
		for(int x = 0; x < 26; x++) {
			int value = reader.nextInt();
			values[x] = value;
			if(value > max) max = value;
		}
		int ans = max * (k * charArray.length + (k * k + k) / 2);
		for(int x = 0; x < charArray.length; x++) {
			int temp = (int)charArray[x];
			ans += values[(temp - 97)] * (x+1);
		}
		System.out.println(ans);
	}
}
