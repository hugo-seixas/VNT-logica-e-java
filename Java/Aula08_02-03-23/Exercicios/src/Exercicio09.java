import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
       
    	Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o primeiro número:");
        int numeroA = scanner.nextInt();

        System.out.print("Segundo número:");
        int numeroB = scanner.nextInt();

        if (numeroA % numeroB == 0 || numeroB % numeroA == 0) {
            System.out.println("São múltiplos");
        }
        else {
            System.out.println("Não são múltiplos");
        }
        
        scanner.close();
    }
}
