import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double massa, massaInicial, massaFinal;
		int contador, hora, minuto;
		contador = 0;
		massaFinal = 0;

		System.out.println("Digite a massa inicial: ");
		massa = scanner.nextDouble();
		massaInicial = massa;
		
		while (massa >= 0.5) {
			massa /= 2;
			contador += 60;
		}
		
		massaFinal = massa;
		minuto = contador / 60;
		hora = minuto / 60;
		
		System.out.println("A massa inicial era: " + massaInicial);
		System.out.println("A massa final é: " + massaFinal);
		System.out.println("O tempo gasto foi: " + hora + " h " + minuto + " m ");
		
		scanner.close();
	}

}
