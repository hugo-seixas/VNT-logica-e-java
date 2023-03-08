
public class Exercicio02 {

	public static void main(String[] args) {
		
		String verificacaoA = (10 == 10 && 10 == 20) ? "True" : "False";
		System.out.println("Letra A: " + verificacaoA);

		String verificacaoB = (11 == 12 && 20 == 20) ? "True" : "False";
		System.out.println("Letra B: " + verificacaoB);
		
		String verificacaoC = (15 == 15 && 16 == 16) ? "True" : "False";
		System.out.println("Letra C: " + verificacaoC);
		
		String verificacaoD = (12 == 11 && 23 == 24) ? "True" : "False";
		System.out.println("Letra D: " + verificacaoD);
		
		String verificacaoE = (10 == 10 || 10 == 20) ? "True" : "False";
		System.out.println("Letra E: " + verificacaoE);
		
		String verificacaoF = (11 == 12 || 20 == 20) ? "True" : "False";
		System.out.println("Letra F: " + verificacaoF);
		
		String verificacaoG = (15 == 15 || 16 == 16) ? "True" : "False";
		System.out.println("Letra G: " + verificacaoG);
		
		String verificacaoH = (12 == 11 || 23 == 24) ? "True" : "False";
		System.out.println("Letra H: " + verificacaoH);

	}

}
