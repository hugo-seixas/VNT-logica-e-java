import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
       
    	Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o primeiro n�mero:");
        int numeroA = scanner.nextInt();

        System.out.print("Segundo n�mero:");
        int numeroB = scanner.nextInt();

        if (numeroA % numeroB == 0 || numeroB % numeroA == 0) {
            System.out.println("S�o m�ltiplos");
        }
        else {
            System.out.println("N�o s�o m�ltiplos");
        }
        
        scanner.close();
    }
}
