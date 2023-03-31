package exercicio01;

public class Gerente extends Funcionario {

	private int senha;
	

	public boolean autentica(int senhaDigitada) {
		if (senhaDigitada == this.senha) {
			return true;
		}
		return false;
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

}
