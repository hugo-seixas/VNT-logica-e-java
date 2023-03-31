package atividade02;

public class PessoaJuridica extends Pessoa {
	
	private String cnpj;
	
	public PessoaJuridica() {
	}
	
	
	public String getCnpj() {
		return cnpj;
	}
	
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	
	@Override
	public String toString() {
		return "Pessoa Juridica - Nome: " + super.getNome() + " CNPJ: " + this.cnpj;
	}
	
}
