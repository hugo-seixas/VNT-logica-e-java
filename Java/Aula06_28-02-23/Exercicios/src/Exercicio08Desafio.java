import java.util.Scanner;

public class Exercicio08Desafio {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Valor De A: ");
        double a = scanner.nextDouble();
       
        System.out.print("Valor De B: ");
        double b = scanner.nextDouble();
        
        System.out.print("Valor De C: ");
        double c = scanner.nextDouble();

        double delta = Math.pow(b, 2) - (4 * a * c);

        double xPositivo = (-b + Math.sqrt (delta)) / (2 * a);
        double xNegativo = (-b - Math.sqrt (delta)) / (2 * a);

        System.out.println("X positivo = " + xPositivo);
        System.out.println("X negativo = " + xNegativo);
        
        scanner.close();
	}

}
