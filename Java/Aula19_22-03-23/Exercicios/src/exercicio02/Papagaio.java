package exercicio02;

public class Papagaio extends Animal {

	@Override
	public void falar() {
		System.out.println("Qué café");
	}

	@Override
	public void comer() {
		if (isFome()) {
			System.out.println("Quero Comida");
			System.out.println("Frutas e legumes");
		} else {
			System.out.println("Não estou com fome!!");
		}
	}

}
