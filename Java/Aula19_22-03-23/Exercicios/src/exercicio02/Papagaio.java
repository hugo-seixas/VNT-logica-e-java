package exercicio02;

public class Papagaio extends Animal {

	@Override
	public void falar() {
		System.out.println("Qu� caf�");
	}

	@Override
	public void comer() {
		if (isFome()) {
			System.out.println("Quero Comida");
			System.out.println("Frutas e legumes");
		} else {
			System.out.println("N�o estou com fome!!");
		}
	}

}
