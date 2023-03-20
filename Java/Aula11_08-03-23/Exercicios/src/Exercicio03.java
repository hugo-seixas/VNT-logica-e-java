import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe dois números: ");
		
		double num1 = scanner.nextDouble();
		double num2 = scanner.nextDouble();
		
		imprimir(num1, num2);
		
		scanner.close();
	}
	
	public static double somar (double num1, double num2) {
		return num1 + num2;
	}

	public static double multiplicar (double num1, double num2) {
		return num1 * num2;
	}
	
	public static double dobro (double numero) {
		return numero * 2;
	}
	
	public static void imprimir(double num1, double num2) {
		System.out.println("A soma é: " + somar(num1, num2));
		System.out.println("A multiplicação é: " + multiplicar(num1, num2));
		System.out.println("O dobro de " + num1 + " é " + dobro(num1));
		System.out.println("O dobro de " + num2 + " é " + dobro(num2));
	}

}
