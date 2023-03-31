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
			System.out.println("Ração e Leite..Ração e Leite");
		} else {
			System.out.println("Não estou com fome!!");
		}
	}

}
