import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.lang.IndexOutOfBoundsException;
import java.lang.Math;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;

public class D {
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
		String a = reader.next();
		String b = reader.next();
		String c = reader.next();
		String[] name = new String[n];
		for(int i = 0; i < n; i ++) {
			String a_i = a.substring(i,i+1);
			String b_i = b.substring(i,i+1);
			String c_i = c.substring(i,i+1);
			if(a_i.equals(b_i)) {
				name[i] = a_i;
			} else if(b_i.equals(c_i)) {
				name[i] = b_i;
			} else if(c_i.equals(a_i)) {
				name[i] = c_i;
			} else {
				name[i] = a_i;
			}
		}
		for(int i = 0; i < name.length; i++) {
			System.out.print(name[i]);
		}
		System.out.println();
	}
}