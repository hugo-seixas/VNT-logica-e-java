import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

	    Scanner scanner = new Scanner(System.in);
	    
	    String categoria;

        System.out.print("Informe o nome do atleta: ");
        String nome = scanner.nextLine();

        System.out.print("Informe a idade do atleta: ");
        int idade = scanner.nextInt();

        switch (idade) {
            case 5, 6, 7, 8, 9, 10:
                categoria = "Infantil";
                break;

            case 11,12,13,14,15:
                categoria = "Juvenil";
                break;

            case 16,17,18,19,20:
                categoria = "Junior";
                break;

            case 21,22,23,24,25:
                categoria = "Profissional";
                break;

            default:
                categoria = "Inválido";
                break;
        }
        System.out.println("Nome: " + nome + "\nIdade: " + idade + "\nCategoria: " + categoria);
        
        scanner.close();
	}

}
