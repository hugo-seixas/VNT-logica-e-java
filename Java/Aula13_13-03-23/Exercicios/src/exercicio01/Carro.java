package exercicio01;

public class Carro {
	
	String cor;
	String modelo;
	double velocidade;
	
	public double acelerar() {
		return this.velocidade += 10;
		
	}
	
	public double frear() {
		return this.velocidade -= 10;
		
	}

	public void acenderFarol() {
		if (this.velocidade > 0) {
			System.out.println("Farol Aceso");
		}else {
			System.out.println("Farol Apagado");
		}
		
	}

	@Override
	public String toString() {
		return "Cor = " + cor + ", Modelo = " + modelo + ", Velocidade = " + velocidade + " Km/h";
	}
	
	

}
