package Chapter1;

public class Question7 {
	public static void makezero(int[][] m) {
		int i, j;
		int[] row = new int[m.length];
		int[] coloumn = new int[m[0].length];
		for (i = 0; i < m.length; i++) {
			for (j = 0; j < m[0].length; j++) {
				if (m[i][j] == 0) {
					row[i] = 1;
					coloumn[j] = 1;
				}
			}
		}
		for (i = 0; i < m.length; i++) {
			for (j = 0; j < m[0].length; j++) {
				if (row[i] == 1 || coloumn[j] == 1) {
					m[i][j] = 0;
				}
			}
		}

	}

	public static void main(String[] args) {
		int[][] m = { { 1, 0, 3, 4 }, { 3, 4, 0, 0 }, { 5, 6, 7, 8 } };
		makezero(m);
		int i, j;
		for (i = 0; i < m.length; i++) {
			for (j = 0; j < m[0].length; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println('\n');
		}
	}
}
