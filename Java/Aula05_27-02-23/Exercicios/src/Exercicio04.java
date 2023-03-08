import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe o preço do produto: R$ ");
		double precoNormal = scanner.nextDouble();
		
		double precoComDesconto = (precoNormal < 30) ? precoNormal * 0.9 : precoNormal * 0.8;
		
		System.out.println("Preço com desconto: R$ " + precoComDesconto);
		
		scanner.close();

	}

}
