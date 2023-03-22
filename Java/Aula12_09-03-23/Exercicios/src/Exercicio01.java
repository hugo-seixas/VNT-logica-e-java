import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String[] nome = new String[5];
		double[] nota1 = new double[5];
		double[] nota2 = new double[5];
		double[] media = new double[5];
		double somaDasMedias = 0, mediaDaTurma;

		for (int i = 0; i < 5; i++) {
			System.out.println("--------------------");
			System.out.println("DADOS DO ALUNO ");
			System.out.println("--------------------");

			System.out.print("Nome: ");
			nome[i] = scanner.next();
			System.out.print("Nota1: ");
			nota1[i] = scanner.nextDouble();
			System.out.print("Nota2: ");
			nota2[i] = scanner.nextDouble();
			System.out.print("Media: ");

			media[i] = (nota1[i] + nota2[i]) / 2;
			System.out.println(media[i]);
			somaDasMedias = somaDasMedias + media[i];
		}
		mediaDaTurma = somaDasMedias / 5;
		System.out.println("\nA média da turma e " + mediaDaTurma);
		System.out.println("---------------------------------");
		System.out.println("Alunos que ficaram acima da media");
		System.out.println("---------------------------------");
		for (int i = 0; i < 5; i++) {
			if (media[i] > mediaDaTurma) {
				System.out.println(nome[i] + "\t" + media[i]);
			}
		}

		scanner.close();

	}

}
