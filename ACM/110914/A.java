import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.lang.IndexOutOfBoundsException;
import java.util.ArrayList;
import java.util.Arrays;


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
		int n = reader.nextInt();
		int[][] jedis = new int[n][3];
		int max_a = 0;
		int max_b = 0;
		for(int i = 0; i < n; i ++) {
			int[] temp = new int[3];
			temp[0] = reader.nextInt();
			temp[1] = reader.nextInt();
			temp[2] = reader.nextInt();
			Arrays.sort(temp);
			if(temp[0] > max_a) max_a = temp[0];
			if(temp[1] > max_b) max_b = temp[1];
			jedis[i] = temp;
		}

		ArrayList<Integer> darkJedis = new ArrayList<Integer>();

		for(int i = 0; i < n; i++) {
			if(jedis[i][1] >= max_a && jedis[i][2] >= max_b)
				darkJedis.add(i);
		}

		System.out.println(darkJedis.size());
		for(int i : darkJedis) {
			System.out.print(i+1);
			System.out.print(" ");
		}
		System.out.println();
	}
	
}