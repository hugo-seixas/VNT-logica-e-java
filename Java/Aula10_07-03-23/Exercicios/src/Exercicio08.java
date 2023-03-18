import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
        double nota1, nota2, media, mediaTurma;
        mediaTurma = 0;                   
        
        for (int i = 0; i < 3; i++) {
            
        	System.out.print("Nome do Aluno: ");
            String aluno = scanner.nextLine();
            
            System.out.print("Nota 1: ");
            nota1 = scanner.nextDouble();
            
            System.out.print("Nota 2: ");
            nota2 = scanner.nextDouble();
           
            scanner.nextLine();

            media = (nota1 + nota2) / 2;
            mediaTurma += media;
        
            System.out.printf("Média do aluno é %.1f\n", media);
            if (media >= 6) {
                System.out.println("Aluno Aprovado. Parabéns.");
            } else {
                System.out.println("Reprovado! Estude mais.");
            }
        }
        
        mediaTurma /= 3;
        System.out.printf("Média da Turma = %.1f\n", mediaTurma);

        scanner.close();

	}

}
