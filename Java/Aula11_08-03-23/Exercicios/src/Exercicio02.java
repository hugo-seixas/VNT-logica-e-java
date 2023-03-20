
public class Exercicio02 {

	public static void main(String[] args) {

		int[][] matrizA = { { 1, 2 }, { 4, 5 } };
		int[][] matrizB = { { 7, 8 }, { 10, 11 } };

		int[][] soma = new int[2][2];
		int[][] multiplicacao = new int[2][2];

		// soma
		for (int i = 0; i < matrizA.length; i++) { // linha da matriz
			for (int j = 0; j < matrizA.length; j++) { // coluna da matriz
				soma[i][j] = matrizA[i][j] + matrizB[i][j];
			}
		}

		// multiplicação
		for (int i = 0; i < matrizA.length; i++) { // linha da matriza
			for (int j = 0; j < matrizB[i].length; j++) { // coluna da matriz
				for (int k = 0; k < 2; k++) {
					multiplicacao[i][j] += matrizA[i][k] * matrizB[k][j];
				}
			}
		}

		// imprimir soma
		System.out.println("Soma das matrizes");
		for (int i = 0; i < soma.length; i++) { // percorre linha
			System.out.println("\n");
			for (int j = 0; j < soma.length; j++) { // percorre coluna
				System.out.print(soma[i][j] + "\t");
			}
		}

		// imprimir multiplicação
		System.out.println("\n");
		System.out.println("\nMultiplicação das matrizes");
		for (int i = 0; i < multiplicacao.length; i++) { // percorre linha
			System.out.println("\n");
			for (int j = 0; j < multiplicacao.length; j++) { // percorre coluna
				System.out.print(multiplicacao[i][j] + "\t");
			}

		}
	}
}