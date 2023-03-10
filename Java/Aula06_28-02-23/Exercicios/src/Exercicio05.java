import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe o lado A: ");
		double ladoA = scanner.nextDouble();

		System.out.print("Informe o lado B: ");
		double ladoB = scanner.nextDouble();
		
		System.out.print("Informe o lado C: ");
		double ladoC = scanner.nextDouble();
		
		boolean triangulo = ((ladoA + ladoB) > ladoC) && ((ladoA + ladoC) > ladoB) && ((ladoB + ladoC) > ladoA) ? true : false;
		
		if (triangulo) {
			if (ladoA == ladoB && ladoB == ladoC) {
				System.out.println("Triângulo Equilátero");
			}
			else if (ladoA != ladoB && ladoB != ladoC && ladoC != ladoA) {
				System.out.println("Triângulo Escaleno");
			}
			else {
				System.out.println("Triângulo Isósceles");
			}
		}
		else {
			System.out.println("Não é Triângulo");
		}
		
		scanner.close();

	}

}
