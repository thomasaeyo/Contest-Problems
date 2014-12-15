import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class rotateMatrix {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int m = Integer.parseInt(reader.readLine());
		int[][] matrix = new int[m][m];
		for(int r = 0; r < m; r++) {
			String[] raw = reader.readLine().split(" ");
			for(int c = 0; c < m; c++) {
				matrix[r][c] = Integer.parseInt(raw[c]);
			}
		}
		System.out.println("-------------------------------------------------------");
		rotate90(matrix);
		print(matrix);
	}	

	public static void rotate90(int[][] matrix) {
		int r = 0;
		int c = 0;
		int r_bound = matrix.length - 1;
		int c_bound = matrix[0].length - 1;

		while(r < r_bound) {
			while(c < c_bound) {
				rotate(matrix, r, c);
				c++;
			}
			r++;
			r_bound--;
			c_bound--;
		}
	}

	public static void rotate(int[][] m, int r, int c) {
		int rr;
		int cc;
		int temp = m[r][c];
		int tempp;

		for(int i = 0; i < 4; i++) {
			rr = c;
			cc = m.length - r - 1;
			tempp = m[rr][cc];
			m[rr][cc] = temp;
			temp = tempp;
			r = rr;
			c = cc;
		}
	}

	public static void swap(int[][] m, int r1, int c1, int r2, int c2) {
		int temp = m[r1][c1];
		m[r1][c1] = m[r2][c2];
		m[r2][c2] = temp;
	}

	public static void print(int[][] m) {
		for(int r = 0; r < m.length; r++) {
			for(int c = 0; c < m[0].length; c++) {
				System.out.print(m[r][c] + " ");
			}
			System.out.println();
		}
	}
}

// 123
// 456
// 789

// 741
// 852
// 963

// (0,0) (0,1) (0,2) (0,3)
// (1,0) (1,1) (1,2) (1,3)
// (2,0) (2,1) (2,2) (2,3)
// (3,0) (3,1) (3,2) (3,3)

// row r -> col (m-r-1)
// col c -> row c

