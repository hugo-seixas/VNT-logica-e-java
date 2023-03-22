package exercicio02;

public class Candidatura {

	String nomeCandidato;
	String vaga;
	double pretensaoSalarial;

	void enviarTesteTecnico() {
		if (vaga == "TECNOLOGIA") {
			System.out.println("Enviar TESTE de TECNOLOGIA para " + this.nomeCandidato);

		} else {
			System.out.println("Enviar TESTE de GERAL para " + this.nomeCandidato);
		}
	}

	@Override
	public String toString() {
		return "Candidatura [nomeCandidato = " + nomeCandidato + ", vaga = " + vaga + ", pretensaoSalarial = R$ "
				+ pretensaoSalarial + "]";
	}
	
	
	
}
