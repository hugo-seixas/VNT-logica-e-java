import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o primeiro n�mero: ");
        double num1 = scanner.nextDouble();

        System.out.print("Insira o segundo n�mero: ");
        double num2 = scanner.nextDouble();

        double resultado = (num1 > num2) ? num1 + num2 : num2 - num1;

        System.out.println("Resultado: " + resultado);
        
        scanner.close();

	}

}
