
public class Jogador {
	
	private String nome;
	private char caracter;
	
	public Jogador(String nome, char caracter) {
		this.nome = nome;
		this.caracter = caracter;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public char getCaracter() {
		return caracter;
	}

	public void setCaracter(char caracter) {
		this.caracter = caracter;
	}

}
