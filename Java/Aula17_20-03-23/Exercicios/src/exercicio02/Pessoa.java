package exercicio02;

import java.util.Scanner;

public class Pessoa {

	private int incricao;
	private String nome;
	private String sobrenome;
	private Endereco endereco;

	Scanner scanner = new Scanner(System.in);

	public void apresentar() {
		System.out.println("A pessoa " + this.nome + " " + this.sobrenome);
		System.out.println("foi inscrita com o numero : " + this.incricao);
		System.out.println("Mora no endereco: " + this.endereco.rua + "," + this.endereco.numero + "."
				+ this.endereco.bairro + ", " + this.endereco.cidade + ", " + this.endereco.estado);

	}

	public void cadastrar() {
		System.out.print("Digite o nome: ");
		nome = scanner.nextLine();

		System.out.print("Digite o sobrenome: ");
		sobrenome = scanner.nextLine();

		System.out.print("Digite a inscricao: ");
		incricao = scanner.nextInt();
	}

	public int getIncricao() {
		return incricao;
	}

	public void setIncricao(int incricao) {
		this.incricao = incricao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

}
