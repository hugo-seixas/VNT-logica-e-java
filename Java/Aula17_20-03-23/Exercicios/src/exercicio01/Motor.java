package exercicio01;

public class Motor implements Controlador {

	public boolean ligado;
	private double gasolina;

	@Override
	public void ligar() {
		if (temGasolina()) {
			this.ligado = true;
			System.out.println("O motor foi ligado");
		} else {
			this.ligado = false;
			System.out.println("Não temos gasolina para ligar o motor");
		}
	}

	@Override
	public boolean temGasolina() {
		if (this.gasolina > 0) {
			return true;
		}
		return false;
	}

	public double getGasolina() {
		return gasolina;
	}

	public void setGasolina(double gasolina) {
		this.gasolina = gasolina;
	}


}
