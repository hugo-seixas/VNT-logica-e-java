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
			System.out.println("Ração e Osso..Ração e Osso");
		} else {
			System.out.println("Não estou com fome!!");
		}

	}
}
