package atividade02;

public class Teste02 {

	public static void main(String[] args) {
		
		PessoaFisica pf = new PessoaFisica();
		
		PessoaJuridica pj = new PessoaJuridica();
		
		pf.setNome("Hugo");
		pf.setCpf("123456789-99");
		
		pj.setNome("Venturus");
		pj.setCnpj("010001238/0001-02");
		
		System.out.println(pf);
		System.out.println();
		System.out.println(pj);

	}

}
