import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um n�mero: ");
        int num = scanner.nextInt();
        
        System.out.println((num % 2 == 0) ? "O n�mero " + num + " � par" : "O n�mero " + num + " � �mpar");

        scanner.close();
    }
}
