import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

	    Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor do raio: ");
        double raio = scanner.nextDouble();

        if (raio > 0) {
            double area = (Math.PI * (Math.pow(raio, 2)));
            System.out.printf("�rea do c�rculo = " + area);
        }
        else {
            System.out.println("Valor do raio n�o pode ser negativo");
        }
        
        scanner.close();
	}

}
