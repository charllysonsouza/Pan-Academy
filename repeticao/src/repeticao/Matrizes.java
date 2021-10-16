package repeticao;

public class Matrizes {

	public static void main(String[] args) {

		String[][] mat = { { "maçã", "pêra", "limão", "morango" }, 
						{ "abacate", "melão", "laranja", "manga" } };

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				for (int k = mat[i][j].length() - 1; k >= 0; k--) {
					System.out.println(mat[i][j].charAt(k));
				}
				System.out.println();
			}
		}
	}
}
