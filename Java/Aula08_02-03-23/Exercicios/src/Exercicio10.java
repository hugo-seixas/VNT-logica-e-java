import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
    
    	Scanner scanner = new Scanner(System.in);
    	int duracao;

    	System.out.println("Entre com a hora inicial: ");
        int horaInicial = scanner.nextInt();      
        
        System.out.println("Entre com a hora final: ");
        int horaFinal = scanner.nextInt();    
        
        if (horaInicial < horaFinal) {
            duracao = horaFinal - horaInicial;
        } else {
            duracao = 24 - horaInicial + horaFinal;
        }
        
        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
        
        scanner.close();
    }
}
