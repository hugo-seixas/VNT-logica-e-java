package atividade03;

public class Salario {

	int i, anoAtual;
	double salario;
	double percentual;
	double novoSalario;

	public double salarioAtual() {
		percentual = 0.015;
		novoSalario = salario + percentual * salario;

		for (i = 2018; i <= anoAtual; i++) {
			percentual = 2 * percentual;
			novoSalario += percentual * novoSalario;
		}
		return novoSalario;

	}

}
