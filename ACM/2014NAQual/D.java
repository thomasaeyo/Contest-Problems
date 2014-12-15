import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.lang.Math;
import java.util.Arrays;
import java.lang.IndexOutOfBoundsException;

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
		int p = reader.nextInt();
		int[][] grid = new int[3][3];
		for(int i = 0; i < p; i++) {
			int[][] g = new int[3][3];
			for(int r = 0; r < 3; r++) {
				String bw = reader.nextLine();
				for(int c = 0; c < 3; c++) {
					if(bw.substring(c,c+1).equals(".")) grid[r][c] = 0;
					else grid[r][c] = 1;
				}
			}
		}
		
	}

	private static boolean isSame(int[][] ans, int[][] g) {
		for(int r = 0; r < 3; r++) {
			for(int c= 0; c < 3; c++) {
				if(ans[r][c] != g[r][c]) {
					return false;
				}
			}
		}
		return true;
	}

	private static void flip(int[][] g, int r, int c) {
		g[r][c] = (g[r][c] + 1) % 2;
		try {
			g[r-1][c] = (g[r-1][c] + 1) % 2;
		} catch (IndexOutOfBoundsException e) {}
		try {
			g[r-1][c] = (g[r-1][c] + 1) % 2;
		} catch (IndexOutOfBoundsException e) {}
		try {
			g[r][c-1] = (g[r][c-1] + 1) % 2;
		} catch (IndexOutOfBoundsException e) {}
		try {
			g[r+1][c] = (g[r+1][c] + 1) % 2;
		} catch (IndexOutOfBoundsException e) {}
		try {
			g[r][c+1] = (g[r][c+1] + 1) % 2;
		} catch (IndexOutOfBoundsException e) {}
	}
}