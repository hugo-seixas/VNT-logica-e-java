package exercicio01;

public class Teste01 {

	public static void main(String[] args) {
		
		Carro carro1 = new Carro();
		
		carro1.cor = "vermelho";
		carro1.modelo = "VolksWagen";
		carro1.velocidade = 0;
		
		System.out.println("*************** CARRO 1 ***************");
		System.out.println(carro1.toString());
		carro1.acenderFarol();

		System.out.println();
		if (carro1.velocidade <= 20) {
			carro1.acelerar();
			System.out.println("Acelerando!!!");
		} else if (carro1.velocidade > 60) {
			carro1.frear();
			System.out.println("Freando!!!");
		}else {
			System.out.println("Velocidade dentro do limite");
		}
		
		System.out.println();
		System.out.println("Velocidade atual: " + carro1.velocidade);
		carro1.acenderFarol();
		
		Carro carro2 = new Carro();
		carro2.cor = "azul";
		carro2.modelo = "Fiat";
		carro2.velocidade = 48.5;
		
		System.out.println();
		System.out.println("*************** CARRO 2 ***************");
		System.out.println(carro2.toString());
		carro1.acenderFarol();

		System.out.println();
		if (carro2.velocidade <= 20) {
			carro2.acelerar();
			System.out.println("Acelerando!!!");
		} else if (carro2.velocidade > 60){
			carro2.frear();
			System.out.println("Freando!!!");
		}else {
			System.out.println("Velocidade dentro do limite");
		}
		
		System.out.println();
		System.out.println("Velocidade atual: " + carro2.velocidade);
		carro2.acenderFarol();

		
		Carro carro3 = new Carro();
		carro3.cor = "amarelo";
		carro3.modelo = "Ford";
		carro3.velocidade = 80;
		
		System.out.println();
		System.out.println("*************** CARRO 3 ***************");
		System.out.println(carro3.toString());
		carro1.acenderFarol();

		System.out.println();
		if (carro3.velocidade <= 20) {
			carro3.acelerar();
			System.out.println("Acelerando!!!");
		} else if (carro3.velocidade > 60){
			carro3.frear();
			System.out.println("Freando!!!");
		}else {
			System.out.println("Velocidade dentro do limite");
		}
		
		System.out.println();
		System.out.println("Velocidade atual: " + carro3.velocidade);
		carro3.acenderFarol();


	}

}
