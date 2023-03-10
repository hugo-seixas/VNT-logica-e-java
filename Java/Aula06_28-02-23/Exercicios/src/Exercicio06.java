import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira um valor inteiro: ");
        int valor = scanner.nextInt();

        System.out.println((valor > 10) ? "Valor maior que 10" : (valor > 5) ? "Valor maior que 5" : "Valor menor ou igual a 5");
        
        scanner.close();

	}

}
