import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

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
		int[] row = new int[8];
		int[] col = new int[8];
		int[] dw1 = new int[8]; //white: down left to up right
		int[] db1 = new int[8]; //black: down left to up right
		int[] dw2 = new int[8]; //white: up left to down right
		int[] db2 = new int[8]; //black: up left to down right
		boolean isValid = true;
		int n_queen = 0;
		for(int r = 0; r < 8; r++) {
			char[] board = reader.nextLine().toCharArray();
			for(int c = 0; c < board.length; c++) {
				if(board[c] == '*' ) {
					n_queen += 1;

					row[r] += 1;
					if(row[r] > 1) {
						isValid = false;
						break;
					}
					col[c] += 1;
					if(col[c] > 1) {
						isValid = false;
						break;
					}
					if((r+c)%2 == 0) {
						// black
						db1[(r+c)/2] += 1;
						db2[6-(r-c+6)/2] += 1;
						if(db1[(r+c)/2] > 1) {
							isValid = false;
							break;
						}
						if(db2[6-(r-c+6)/2] > 1) {
							isValid = false;
							break;
						}
					} else {
						// white
						dw1[(r+c)/2] += 1;
						dw2[7-(r-c+7)/2] += 1;
						if(dw1[(r+c)/2] > 1) {
							isValid = false;
							break;
						}
						if(dw2[7-(r-c+7)/2] > 1) {
							isValid = false;
							break;
						}
					}
				}
			}
		}
		if(isValid && n_queen == 8) {
			System.out.println("valid");
		} else {
			System.out.println("invalid");
		}
	}
}