import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		int contador, numero, fatorial;
		char resp;
      
        Scanner scanner = new Scanner(System.in);
       
		do {
            System.out.print("Digite um numero: ");
            numero = scanner.nextInt();
           
            contador = numero;
            fatorial = 1;
          
            do {
                fatorial = fatorial * contador;
                contador = contador - 1;
            } while (contador > 1);              
           
            if (numero==0) {
                fatorial = 1;
            }             
           
            System.out.println("O fatorial de " + numero + " é igual a " + fatorial);
            System.out.print("Quer continuar? [S/N]");
            resp = scanner.next().charAt(0);
            
        } while (resp != 'n');
		
		scanner.close();
    }


}
