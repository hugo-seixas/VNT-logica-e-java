package exercicio02;

public class Gato extends Animal {

	@Override
	public void falar() {
		System.out.println("Miau...Miau...");
	}

	@Override
	public void comer() {
		if (isFome()) {
			System.out.println("Quero Comida");
			System.out.println("Ra��o e Leite..Ra��o e Leite");
		} else {
			System.out.println("N�o estou com fome!!");
		}
	}

}
