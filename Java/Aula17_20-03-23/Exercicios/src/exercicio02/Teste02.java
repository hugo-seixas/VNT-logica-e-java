package exercicio02;

public class Teste02 {

	public static void main(String[] args) {

		Pessoa pessoa1 = new Pessoa();
		Endereco endereco = new Endereco();

		pessoa1.cadastrar();
		pessoa1.setEndereco(endereco);

		pessoa1.getEndereco().rua = "Avenida Paulista";
		pessoa1.getEndereco().numero = 14;
		pessoa1.getEndereco().bairro = "Bela Vista";
		pessoa1.getEndereco().cidade = "Sao Paulo";
		pessoa1.getEndereco().estado = "SP";
		pessoa1.apresentar();

	}

}
