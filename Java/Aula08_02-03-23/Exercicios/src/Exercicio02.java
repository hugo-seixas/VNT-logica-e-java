import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = scanner.nextInt();

        if (num > 0) {

            if (num % 2 == 0) {
                System.out.println(num + " é PAR");
            } else {
                System.out.println(num + " é ÍMPAR");
            }
        } else {
            System.out.println("NEGATIVO");
        }
        
        scanner.close();
    }
}
