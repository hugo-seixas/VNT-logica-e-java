package atividade07;

import java.util.Scanner;

public class Atividade07 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
        Estudante estudante = new Estudante();
        
        System.out.println("Digite o nome do aluno: ");
        estudante.nome = scanner.nextLine();
        
        System.out.println("Primeira Nota: ");
        estudante.grade1 = scanner.nextDouble();
        
        System.out.println("Segunda Nota: ");
        estudante.grade2 = scanner.nextDouble();
        
        System.out.println("Terceira Nota: ");
        estudante.grade3 = scanner.nextDouble();
        
        System.out.printf("FINAL GRADE: %.2f%n", estudante.finalGrade());
        if (estudante.finalGrade() < 60.0) {
            System.out.println("REPROVADO");
            System.out.printf("FALTANDO %.2f PONTOS%n", estudante.pontosFaltantes());
        } else {
            System.out.println("APROVADO");
        }
        scanner.close();

	}

}
