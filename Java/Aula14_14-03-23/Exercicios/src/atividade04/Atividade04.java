package atividade04;

import java.util.Scanner;

public class Atividade04 {

	public static void main(String[] args) {
		
        double tempo = 0;
        Scanner scanner = new Scanner(System.in);
       
        System.out.print("Digite a massa inicial: ");
        double massaInicial = scanner.nextDouble();
        double massaAtual = massaInicial;

        while (massaAtual >= 0.5) {
            tempo = tempo + 50;
            massaAtual = (massaAtual / 2);
        }
     
        double hora = tempo / 3600;
        double minuto = tempo / 60;     

        System.out.println("Massa Inicial: " + massaInicial + "g");
        System.out.println("Massa Final: " + massaAtual + "g");
        System.out.println("Tempo em segundos: " + tempo + "segundos");
        System.out.println("Horas: " + hora + "hs");
        System.out.println("Minutos: " + minuto + "min");   

        scanner.close();
	}

}
