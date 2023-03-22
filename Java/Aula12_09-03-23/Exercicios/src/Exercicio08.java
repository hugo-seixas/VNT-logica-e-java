import java.util.Arrays;
import java.util.Random;

public class Exercicio08 {

	public static void main(String[] args) {

		Random aleatorio = new Random();
		int numeros[] = new int[6];

		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = aleatorio.nextInt(60) + 1;
		}

		Arrays.sort(numeros);

		System.out.println("Dezenas da Mega Sena: ");

		for (int n : numeros) {
			System.out.print(n + " ");

		}

	}
}