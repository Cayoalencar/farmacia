package modelo;

public class Medicamento extends Produto {
	
	private String classificacao; 
	private String finalidade;
	private String laboratorio;

	public Medicamento(String nome, double valor, int quantidade, double peso, int codigo, String classificacao, String finalidade, String laboratorio) {
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

	public String toString() {
		return "\nNome Medicamento: " + getNome() + "| Valor: " + getValor() + " R$ | Quantidade: " + getQuantidade() + " | Peso: " + getPeso() + " mg | Codigo: " + getCodigo() + " | Classificacao: " + getClassificacao() + " | Finalidade: " + getFinalidade()
				+ " | Laboratorio: " + getLaboratorio();
	}

}
