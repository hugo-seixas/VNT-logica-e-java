package exercicio02;

public class Teste02 {

	public static void main(String[] args) {

		Cao cachorro = new Cao();
		cachorro.setNome("Tobi");
		cachorro.setIdade(7);
		cachorro.setFome(false);
		System.out.println(cachorro);
		cachorro.falar();
		cachorro.comer();
		System.out.println("\n******************************");
		System.out.println(" ");

		Gato gato = new Gato();
		gato.setNome("Prince");
		gato.setIdade(3);
		gato.setFome(true);
		System.out.println(gato);
		gato.falar();
		gato.comer();
		System.out.println("\n******************************");
		System.out.println(" ");

		Homem homem = new Homem();
		homem.setNome("Hugo");
		homem.setIdade(39);
		homem.setFome(true);
		System.out.println(homem);
		homem.falar();
		homem.comer();
		System.out.println("\n******************************");
		System.out.println(" ");

		Papagaio papagaio = new Papagaio();
		papagaio.setNome("José");
		papagaio.setIdade(10);
		papagaio.setFome(false);
		System.out.println(papagaio);
		papagaio.falar();
		papagaio.comer();
		System.out.println("\n******************************");
		System.out.println(" ");
	}

}
