import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int contador;
		
		System.out.print("Digite o número inicial: ");
		int numeroInicial = scanner.nextInt();
		
		System.out.print("Digite o número final: ");
		int numeroFinal = scanner.nextInt();
		
		if (numeroInicial < numeroFinal) {
			contador = numeroInicial;
			while (contador <= numeroFinal) {
				System.out.print(contador + " ");
				contador++;
			}
		} else {
			contador = numeroInicial;
			while (contador >= numeroFinal) {
				System.out.print(contador + " ");
				contador--;
			}
		}
		
		scanner.close();
	}

}
