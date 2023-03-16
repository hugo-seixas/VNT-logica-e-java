import java.util.Scanner;

public class Exercicio08 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Informe sua altura: ");
		double altura = scanner.nextDouble();

		System.out.print("Informe seu peso:");
		double peso = scanner.nextDouble();

		double imc = peso / (Math.pow(altura, 2));
		System.out.println("IMC = " + imc);

		if (imc < 16) {
			System.out.println("Magreza Grave!");
		} else if (imc >= 16 && imc < 17) {
			System.out.println("Magreza Moderada!");
		} else if (imc >= 17 && imc < 18.5) {
			System.out.println("Magreza Leva!");
		} else if (imc >= 18.5 && imc < 25) {
			System.out.println("Saudável!");
		} else if (imc >= 25 && imc < 30) {
			System.out.println("Sobrepeso!");
		} else if (imc >= 30 && imc < 35) {
			System.out.println("Obesidade Grau 1!");
		} else if (imc >= 35 && imc < 40) {
			System.out.println("Obesidade Grau 2 (Severa)!");
		} else {
			System.out.println("Obesidade Grau 3 (Mórbida)!");
		}
		scanner.close();
	}
}
