import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite a idade: ");
		int idade = scanner.nextInt();
		
		String voto = ((idade >= 16 && idade < 18) || (idade > 70)) ? "É opcional" : "Não é opcional";
		System.out.println(voto);
		
		scanner.close();
	}

}
