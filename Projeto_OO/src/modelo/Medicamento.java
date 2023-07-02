package modelo;

/**
 * 
 * @author Cayo Felipe Alencar Camara
 * @author Gabryel Nicolas Soares
 * 
 *         A classe medicamento herda de produto e representa um medicamento que
 *         pode ser adicionado a uma filial da farmacia
 */
public class Medicamento extends Produto {

	private String classificacao;
	private String finalidade;
	private String laboratorio;

	/**
	 * 
	 * @param nome          nome do medicamento
	 * @param valor         valor do medicamento
	 * @param quantidade    quantidade do medicamento
	 * @param peso          peso do medicamento
	 * @param codigo        codigo do medicamento
	 * @param classificacao classificacao do medicamento (tarja preta, vermelha,
	 *                      amarela, etc...)
	 * @param finalidade    finalidade de um medicamento (analgesico,
	 *                      anti-inflamatorio, etc...)
	 * @param laboratorio   laboratorio responsavel pelo medicamento
	 */
	public Medicamento(String nome, double valor, int quantidade, double peso, int codigo, String classificacao,
			String finalidade, String laboratorio) {
		super(nome, valor, quantidade, peso, codigo);

		this.classificacao = classificacao;
		this.finalidade = finalidade;
		this.laboratorio = laboratorio;

	}

	public String getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}

	public String getFinalidade() {
		return finalidade;
	}

	public void setFinalidade(String finalidade) {
		this.finalidade = finalidade;
	}

	public String getLaboratorio() {
		return laboratorio;
	}

	public void setLaboratorio(String laboratorio) {
		this.laboratorio = laboratorio;
	}

	@Override
	public String toString() {
		return "Nome: " + nome + ",classificacao: " + classificacao + ", finalidade: " + finalidade + ", laboratorio: "
				+ laboratorio;
	}

}
