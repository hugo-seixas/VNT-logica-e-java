package atividade06;

import java.util.Scanner;

public class Atividade06 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        
		Funcionario funcionario = new Funcionario();
       
		System.out.print("Nome: ");
        funcionario.nome = scanner.nextLine();
       
        System.out.print("Salario Bruto: ");
        funcionario.salarioBruto = scanner.nextDouble();
       
        System.out.print("Imposto: ");
        funcionario.imposto = scanner.nextDouble();
        
        System.out.println();
        System.out.println("Funcionario: " + funcionario);
        System.out.println();
       
        System.out.print("Qual a porcentagem de aumento salarial? ");
        double percentage = scanner.nextDouble();
        funcionario.aumentoSalario(percentage);
        
        System.out.println();
        System.out.println("Dados atualizados: " + funcionario);
        scanner.close();

	}

}
