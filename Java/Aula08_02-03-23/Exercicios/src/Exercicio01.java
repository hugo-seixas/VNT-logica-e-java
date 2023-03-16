import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = scanner.nextInt();
        
        System.out.println((num % 2 == 0) ? "O número " + num + " é par" : "O número " + num + " é ímpar");

        scanner.close();
    }
}
