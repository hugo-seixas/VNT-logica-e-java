
public class Atividade1 {

	public static void main(String[] args) {
		
		String produto1 = "Computador";
		String produto2 = "Tablet";
		int idade = 30;
		int codigo = 5290;
		char sexo = 'F';
		double preco1 = 5100.0;
		double preco2 = 1000.50;
		double medida = 53.234567;
		
		System.out.println("Produtos:");
		
		System.out.printf("%s, Preco Total: R$ %.2f%n", produto1, preco1);
		System.out.printf("%s, Preco Total: R$ %.2f%n", produto2, preco2);
		System.out.println();
		System.out.printf("Registro: %d anos, codigo %d e sexo: %c%n", idade, codigo, sexo);
		System.out.println();
		System.out.printf("Medida com oito casas decimais: %.8f%n", medida);
		System.out.printf("Medida com tres casas decimais: %.3f%n", medida);
		
	}

}
