import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe o dia do mês (1 a 31): ");
		int diaMes = scanner.nextInt();
		
		String quinzena = (diaMes <= 15) ? "Primeira Quinzena" : "Segunda Quinzena";
		
		System.out.println(quinzena);
		
		scanner.close();

	}

}
