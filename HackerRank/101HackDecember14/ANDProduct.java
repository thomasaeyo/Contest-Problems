import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.io.IOException;
import java.util.StringTokenizer;


public class ANDProduct {
	
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
			long a = toBits(reader.nextLong(), 0);
			long b = toBits(reader.nextLong(), 0);
			System.out.println((a&b));
		}
	}

	public static long toDecimal(long binary) {
		if(binary == 0) {
			return 0;
		}
		int pos = (int)Math.log10(binary);
		return (binary / (long)Math.pow(10,pos)) * (long)Math.pow(2,pos) + toDecimal(binary % (long)Math.pow(10,pos));
	}

	public static long toBits(long l, int pos) {
		if(l / 2 == 0) {
			return (long)((l%2) * Math.pow(10, pos));
		} else {
			return (long)((l%2) * Math.pow(10, pos)) + toBits(l/2, pos+1);
		}
	}

	public static long andProduct(long a, long b) {
		if(a == 0 || b == 0) {
			return 0;
		}

		int pos = (int)Math.log10(a);

		if((b / (long)Math.pow(10,pos)) ==  (a / (long)Math.pow(10,pos))) {
			return (long)Math.pow(10,pos) + andProduct(a % (long)Math.pow(10,pos), b % (long)Math.pow(10,pos));
		} else {
			return 0;
		}
	}


}