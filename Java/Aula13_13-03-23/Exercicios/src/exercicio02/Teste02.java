package exercicio02;

public class Teste02 {

	public static void main(String[] args) {

		Candidatura c1 = new Candidatura();
		c1.nomeCandidato = "Ana Beatriz";
		c1.vaga = "TECNOLOGIA";
		c1.pretensaoSalarial = 12000;
		System.out.println(c1.toString());
		c1.enviarTesteTecnico();
		System.out.println(" ");

		Candidatura c2 = new Candidatura();
		c2.nomeCandidato = "Caio Jose";
		c2.vaga = "GERAL";
		c2.pretensaoSalarial = 8000;
		System.out.println(c2.toString());
		c2.enviarTesteTecnico();
		System.out.println(" ");

	}

}
