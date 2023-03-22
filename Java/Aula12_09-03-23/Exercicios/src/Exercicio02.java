import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String time[] = new String[10];

		System.out.println("-------------------");
		System.out.println("  COPA DE FUTEBOL  ");
		System.out.println("-------------------");

		for (int t = 0; t < 10; t++) {
			System.out.println("Nome do " + (t+1) + "º time: ");
			time[t] = scanner.nextLine();
		}

		System.out.println("-------------------");
		System.out.println("TABELA DAS PARTIDAS");
		System.out.println("-------------------");
		for (int i = 0; i < 10; i++) {
			for (int t = 0; t < 10; t++) {
				if (i != t) {
					System.out.println(time[i] + "[] x [] " + time[t]);
				}
			}
		}
		
		scanner.close();

	}

}
