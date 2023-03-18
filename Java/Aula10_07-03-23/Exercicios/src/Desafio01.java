import java.util.Scanner;

public class Desafio01 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int votos1, votos2, votos3, votos4, votos5;
		int votacao, totalVotos, maiorVotacao;
		votos1 = votos2 = votos3 = votos4 = votos5 = 0;

		System.out.println("Digite o nome de todos o candidatos!!");
		System.out.println("O candidato � representado pelos respectivos n�meros: ");

		System.out.print("Candidato 1: ");
		String candidato1 = scanner.nextLine();
		System.out.print("Candidato 2: ");
		String candidato2 = scanner.nextLine();
		System.out.print("Candidato 3: ");
		String candidato3 = scanner.nextLine();
		System.out.print("Candidato 4: ");
		String candidato4 = scanner.nextLine();
		System.out.print("Candidato 5: ");
		String candidato5 = scanner.nextLine();

		totalVotos = 0;
		System.out.println("Inicie a vota��o!!Pra finalizar, digite 0");

		do {
			System.out.print("Digite seu voto: ");
			votacao = scanner.nextInt();
			switch (votacao) {
			case 1:
				votos1++;
				totalVotos++;
				break;

			case 2:
				votos2++;
				totalVotos++;
				break;

			case 3:
				votos3++;
				totalVotos++;
				break;

			case 4:
				votos4++;
				totalVotos++;
				break;

			case 5:
				votos5++;
				totalVotos++;
				break;

			default:
				if (votacao != 0) {
					System.out.println("Voto Invalido!");
				}
			}
		} while (votacao != 0);

		System.out.println("Candidato " + candidato1 + " teve " + votos1 + " votos");
		System.out.println("Candidato " + candidato2 + " teve " + votos2 + " votos");
		System.out.println("Candidato " + candidato3 + " teve " + votos3 + " votos");
		System.out.println("Candidato " + candidato4 + " teve " + votos4 + " votos");
		System.out.println("Candidato " + candidato5 + " teve " + votos5 + " votos");

		System.out.printf("Total de Votos da Eleicao: %d\n", totalVotos);

		maiorVotacao = votos1;
		if (votos2 > maiorVotacao)
			maiorVotacao = votos2;
		if (votos3 > maiorVotacao)
			maiorVotacao = votos3;
		if (votos4 > maiorVotacao)
			maiorVotacao = votos4;
		if (votos5 > maiorVotacao)
			maiorVotacao = votos5;

		System.out.println("Candidato(s) Vencedor(es) da Eleicao:");
		if (votos1 == maiorVotacao)
			System.out.println(candidato1);
		if (votos2 == maiorVotacao)
			System.out.println(candidato2);
		if (votos3 == maiorVotacao)
			System.out.println(candidato3);
		if (votos4 == maiorVotacao)
			System.out.println(candidato4);
		if (votos5 == maiorVotacao)
			System.out.println(candidato5);
		scanner.close();

	}

}
