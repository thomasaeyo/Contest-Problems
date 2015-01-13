import java.util.Scanner;

public class MatrixSpiral {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		int[][] matrix = new int[row][col];
		for(int r = 0; r < row; r++) {
			for(int c = 0; c < col; c++) {
				matrix[r][c] = sc.nextInt();
			}
		}
		printSpiral(matrix, 0);
	}

	public static void printSpiral(int[][] m, int depth) {
		int rows = m.length;
		int cols = m[0].length;

		if(2*depth > cols || 2*depth > rows)
			return;

		for(int c = depth; c < cols - depth; c++) {
			System.out.print(m[depth][c] + " ");
		}

		for(int r = depth + 1; r < rows - depth; r++) {
			System.out.print(m[r][cols-1-depth] + " ");
		}

		if(2*depth > cols - 2 || 2*depth > rows - 2)
			return;

		for(int c = cols - 2 - depth; c >= depth; c--) {
			System.out.print(m[rows - 1 - depth][c] + " ");
		}

		for(int r = rows - 2 - depth; r >= depth + 1; r--) {
			System.out.print(m[r][depth] + " ");
		}

		printSpiral(m, ++depth);
	}
}