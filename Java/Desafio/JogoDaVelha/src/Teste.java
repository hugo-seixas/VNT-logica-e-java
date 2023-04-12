import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		JogoDaVelha jogo = new JogoDaVelha();

		System.out.print("Jogador 1, digite seu nome: ");
		String nome1 = scanner.nextLine();
		Jogador jogador1 = new Jogador(nome1, 'X');

		System.out.print("Jogador 2, digite seu nome: ");
		String nome2 = scanner.nextLine();
		Jogador jogador2 = new Jogador(nome2, 'O');

		Jogador jogadorAtual = jogador1;

		while (!jogo.isFimDeJogo()) {
			System.out.print("\nJogador " + jogadorAtual.getNome() + " - Digite a linha (1-3): ");
			int i = scanner.nextInt() - 1;
			System.out.print("Jogador " + jogadorAtual.getNome() + " - Digite a coluna (1-3): ");
			int j = scanner.nextInt() - 1;

			if (jogo.jogadaValida(i, j)) {
				jogo.setTabuleiro(i, j, jogadorAtual.getCaracter());

				if (jogadorAtual.getCaracter() == 'X') {
					jogadorAtual = jogador2;
				} else {
					jogadorAtual = jogador1;
				}
				jogo.print();
			} else {
				System.out.println("Jogada inválida, tente novamente.");
			}
		}

		if (jogo.getVencedor() == 'X') {
			System.out.println("\nJogador " + jogador1.getNome() + " venceu o jogo!");
		} else if (jogo.getVencedor() == 'O') {
			System.out.println("\nJogador " + jogador2.getNome() + " venceu o jogo!");
		} else {
			System.out.println("\nEmpate!");
		}

		scanner.close();
	}
}
