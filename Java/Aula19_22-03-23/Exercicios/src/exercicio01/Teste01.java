package exercicio01;

public class Teste01 {

	public static void main(String[] args) {
		
		Funcionario funcionario1 = new Funcionario();
		
		funcionario1.setNome("Maria");
		funcionario1.setCpf("123456789-99");
		funcionario1.setSalario(3500);
		
		Gerente gerente1 = new Gerente();
		
		gerente1.setNome("Tereza");
		gerente1.setCpf("987654321-00");
		gerente1.setSalario(6800);
		gerente1.setSenha(1234);
		
		funcionario1.apresentar();
		gerente1.apresentar();
		
		System.out.println("Gerente autenticado? " + gerente1.autentica(1234));
		
	}

}
