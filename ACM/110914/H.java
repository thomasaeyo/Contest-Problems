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

public class H {
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
		System.out.println(hammingDistance(a,b));
	}
	// returns: hamming distance of a and b
	private static int hammingDistance(String a, String b) {
		int ans = 0;
		boolean allzero = true;
		boolean allone = true;
		String[] hd = new String[a.length()];
		for(int i = 0; i < a.length(); i ++) {
			if(a.substring(i,i+1).equals(b.substring(i,i+1))) {
				hd[i] = "0";
				allone = false;
			} else {
				hd[i] = "1";
				allzero = false;
			}
		}

		if(allone) return 1;
		else if(allzero) return 0;

		String before = "";
		for(int i = 0; i < hd.length; i ++) {
			if(hd[i].equals("1") && !hd[i].equals(before)) {
				ans++;
			} 
			before = hd[i];
		}
		return ans;
	}
}