import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um n�mero: ");
        int num = scanner.nextInt();

        if (num > 0) {

            if (num % 2 == 0) {
                System.out.println(num + " � PAR");
            } else {
                System.out.println(num + " � �MPAR");
            }
        } else {
            System.out.println("NEGATIVO");
        }
        
        scanner.close();
    }
}
