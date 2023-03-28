package Exercicio02;

public class Produto {

	public String nome;
	protected double preco;
	protected int quantidade;
	
	public Produto(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public double totalValorEmEstoque() {
		return quantidade * preco;
	}

	public void addProdutos(int quantidade) {
		this.quantidade += quantidade;

	}

	public void removeProdutos(int quantidade) {
		this.quantidade -= quantidade;

	}

	@Override
	public String toString() {
		return "\nProduto = " + nome + "\nPreço = R$ " + preco + "\nQuantidade = " + quantidade + "\nValor Total: R$ "
				+ totalValorEmEstoque();
	}
	

}
