import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		int i, j;
        int matriz[][] = new int[3][4];
        
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 4; j++) {
                System.out.println("Entre com o elemento da posição: " + i + j );
                matriz[i][j] = scanner.nextInt();
            }
        }
       
        System.out.println("Matriz Principal");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 4; j++) {                
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println("");
        }
       
        System.out.println("Matriz Modificada");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 4; j++) {
                if (matriz[i][j] < 0) {
                    matriz[i][j] = 0;
                }
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println("");
        }

	}
}