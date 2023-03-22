import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int i, j;
		double matriz[][] = new double[3][3];
		double somaTotal = 0, somaLinha3 = 0, somaColuna2 = 0, somaDiagonal = 0;
		
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				System.out.println("Digite um valor para a Matriz: ");
				matriz[i][j] = scanner.nextDouble();
				
				somaTotal += matriz[i][j];
				
				if (i == 2) {
					somaLinha3 += matriz[i][j];
				}
				
				if (j == 1) {
					somaColuna2 += matriz[i][j];
				}
				
				if (i == j) {
					somaDiagonal += matriz[i][j];
				}
			}
		}
		
		System.out.println("A soma total é: " + somaTotal);
		System.out.println("A soma da linha 3 é: " + somaLinha3);
		System.out.println("A soma da coluna 2 é: " + somaColuna2);
		System.out.println("A soma da diagonal principal é: " + somaDiagonal);

		scanner.close();
	}

}
