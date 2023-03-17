import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        
        System.out.print("Informe a quantidade de alunos: ");
        int alunos = scanner.nextInt();
        
        for (int i = 0; i < alunos; i++) {
            
        	System.out.print("Digite o nome do aluno: ");
            String nome = scanner.next();
            
            System.out.print("Digite a primeira nota: ");
            double nota1 = scanner.nextDouble();
           
            System.out.print("Digite a segunda nota: ");
            double nota2 = scanner.nextDouble();
           
            System.out.println("Digite a terceira nota: ");
            double nota3 = scanner.nextDouble();

            double media = (nota1 * 2 + nota2 * 3 + nota3 * 5) / 10;
            
            System.out.printf("A média de "+ nome + " é %.2f%n", media);
        }
        scanner.close();
    }


}
