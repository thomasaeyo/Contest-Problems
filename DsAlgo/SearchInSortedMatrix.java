import java.util.Scanner;

public class SearchInSortedMatrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		int cols = sc.nextInt();
		int[][] matrix = new int[rows][cols];
		for(int r = 0; r < rows; r++) {
			for(int c = 0; c < cols; c++) {
				matrix[r][c] = sc.nextInt();
			}
		}

		int toSearch = sc.nextInt();
		System.out.println(search(matrix, toSearch));
	}

	public static boolean search(int[][] m, int v) {
		return search(m, v, 0, m[0].length - 1);
	}

	// Binary search style for matrix
	public static boolean search(int[][] m, int v, int r, int c) {
		int rows = m.length;
		int cols = m[0].length;

		if(r >= rows || c < 0) 
			return false;

		if(v < m[r][c]) {
			return search(m, v, r, c-1);
		} else if(v > m[r][c]) {
			return search(m, v, r+1, c);
		}

		return true;
	}
}

