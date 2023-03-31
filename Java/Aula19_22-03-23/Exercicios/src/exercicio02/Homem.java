package exercicio02;

public class Homem extends Animal {

	@Override
	public void falar() {
		System.out.println("Oi, eu sou humano!");
	}

	@Override
	public void comer() {
		if (isFome()) {
			System.out.println("Quero Comida");
			System.out.println("Arroz, Feijao, Carne e Salada");
		} else {
			System.out.println("Não estou com fome!!");
		}

	}
}
