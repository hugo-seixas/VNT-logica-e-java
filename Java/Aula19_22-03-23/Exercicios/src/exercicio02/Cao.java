package exercicio02;

public class Cao extends Animal {

	@Override
	public void falar() {
		System.out.println("Au..Au..Au..");
	}

	@Override
	public void comer() {
		if (isFome()) {
			System.out.println("Quero Comida");
			System.out.println("Ra��o e Osso..Ra��o e Osso");
		} else {
			System.out.println("N�o estou com fome!!");
		}

	}
}
