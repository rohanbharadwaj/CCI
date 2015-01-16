package Chapter1;

public class Question6 {
	public static void rotate(int[][] matrix) {
		int N = matrix.length;
		int i, j;
		for (i = 0; i < N / 2; i++) {
			for (j = 0; j < (N + 1) / 2; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[N - 1 - j][i];
				matrix[N - 1 - j][i] = matrix[N - 1 - i][N - 1 - j];
				matrix[N - 1 - i][N - 1 - j] = matrix[j][N - 1 - i];
				matrix[j][N - 1 - i] = temp;
			}
		}

	}

	public static void printMatrix(int[][] m) {
		int i, j;
		for (i = 0; i < m.length; i++) {
			for (j = 0; j < m[0].length; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println('\n');
		}

	}

	public static void main(String[] args) {

		int[][] m = { { 1, 0, 3 }, { 3, 4, 0 }, { 5, 6, 7 } };
		System.out.println("Before");
		printMatrix(m);
		rotate(m);
		System.out.println("After");
		printMatrix(m);

	}
}
