
public class JogoDaVelha {

	private char[][] tabuleiro;
	private char vencedor;

	public JogoDaVelha() {
		this.tabuleiro = new char[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				this.tabuleiro[i][j] = ' ';
			}
		}
	}

	public char getTabuleiro(int i, int j) {
		return this.tabuleiro[i][j];
	}

	public void setTabuleiro(int i, int j, char c) {
		this.tabuleiro[i][j] = c;
	}

	public char getVencedor() {
		return this.vencedor;
	}

	public void print() {
		System.out.println();
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(this.tabuleiro[i][j]);
				if (j < 2) {
					System.out.print(" | ");
				}
			}
			System.out.println();
			if (i < 2) {
				System.out.println("---------");
			}
		}
	}

	public boolean isFimDeJogo() {
		// Verifica se alguém venceu
		for (int i = 0; i < 3; i++) {
			if (this.tabuleiro[i][0] == this.tabuleiro[i][1] && this.tabuleiro[i][1] == this.tabuleiro[i][2]
					&& this.tabuleiro[i][0] != ' ') {
				this.vencedor = this.tabuleiro[i][0];
				return true;
			}
			if (this.tabuleiro[0][i] == this.tabuleiro[1][i] && this.tabuleiro[1][i] == this.tabuleiro[2][i]
					&& this.tabuleiro[0][i] != ' ') {
				this.vencedor = this.tabuleiro[0][i];
				return true;
			}
		}
		if (this.tabuleiro[0][0] == this.tabuleiro[1][1] && this.tabuleiro[1][1] == this.tabuleiro[2][2]
				&& this.tabuleiro[0][0] != ' ') {
			this.vencedor = this.tabuleiro[0][0];
			return true;
		}
		if (this.tabuleiro[0][2] == this.tabuleiro[1][1] && this.tabuleiro[1][1] == this.tabuleiro[2][0]
				&& this.tabuleiro[0][2] != ' ') {
			this.vencedor = this.tabuleiro[0][2];
			return true;
		}
		// Verifica se o tabuleiro ainda tem lugar para jogar
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (this.tabuleiro[i][j] == ' ') {
					return false;
				}
			}
		}
		return true;
	}

	public boolean jogadaValida(int i, int j) {
		return i >= 0 && i < 3 && j >= 0 && j < 3 && this.tabuleiro[i][j] == ' ';
	}
	
}
