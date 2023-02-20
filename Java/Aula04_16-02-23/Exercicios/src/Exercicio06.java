import java.util.Scanner;

//Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas 
//no mês, o valor que recebe por hora e calcular o salário desse funcionário. A seguir, mostre 
//o número e o salário do funcionário, com duas casas decimais

public class Exercicio06 {

	public static void main(String[] args) {
		
		int numeroFuncionario, horasTrabalhadas;
		double valorHora, salario;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe o número do funcionário: ");
		numeroFuncionario = scanner.nextInt();

		System.out.print("Informe a quantidade de horas trabalhadas: ");
		horasTrabalhadas = scanner.nextInt();
		
		System.out.print("Informe o valor por hora: R$ ");
		valorHora = scanner.nextDouble();
		
		salario = horasTrabalhadas * valorHora;
		
		System.out.println("Número: " + numeroFuncionario);
		System.out.printf("Salário: R$ %.2f \n", salario);
		scanner.close();
		
	}

}
