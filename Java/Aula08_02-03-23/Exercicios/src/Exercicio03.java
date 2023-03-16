import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        
    	Scanner scanner = new Scanner(System.in);

        System.out.print("Informe seu salário: R$ ");
        double salario = scanner.nextDouble();

        System.out.print("Informe o valor do financiamento pretendido: R$ ");
        double financiamento = scanner.nextDouble();

        System.out.println(financiamento <= salario * 5 ? "Financiamento Concedido" : "Financiamento Negado");

        System.out.println("Obrigado por nos consultar");
        
        scanner.close();
    }
}
