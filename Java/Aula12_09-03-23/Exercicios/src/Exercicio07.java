import java.util.Random;
import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Random aleatorio = new Random();
		
		int numero = aleatorio.nextInt(100);
		int contador = 0;
		int palpite = -1;

		while (palpite != numero) {
			System.out.print("\nDigite o palpite: ");
			palpite = scanner.nextInt();
			contador++;
			
			if (palpite > numero) {
				System.out.println("Digite um numero menor");
			} else if (palpite < numero) {
				System.out.println("Digite um numero maior");
			} else {
				System.out.println("Parabéns!!");
				System.out.println("Você acertou com " + contador + " tentativas.");
			}

		}
		scanner.close();

	}
}