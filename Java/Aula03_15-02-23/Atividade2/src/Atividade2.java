import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		
		double n1, n2, soma, subtracao, multiplicacao, divisao;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		n1 = scanner.nextDouble();

		System.out.print("Digite o segundo número: ");
		n2 = scanner.nextDouble();
		
		scanner.close();
		
		soma = n1+n2;
		subtracao = n1-n2;
		multiplicacao = n1*n2;
		divisao = n1/n2;
		
		System.out.println();
		System.out.println("Primeiro número: " + n1);
		System.out.println("Segundo número: " + n2);
		
		System.out.println();
		System.out.println(n1 + " + " + n2 + " = " + soma);
		System.out.println(n1 + " - " + n2 + " = " + subtracao);
		System.out.println(n1 + " * " + n2 + " = " + multiplicacao);
		System.out.println(n1 + " / " + n2 + " = " + divisao);
		

	}

}
