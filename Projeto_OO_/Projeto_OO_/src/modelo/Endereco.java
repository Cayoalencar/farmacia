package modelo;

public class Endereco {
	private String cidade;
	private String bairro;
	private String logradouro;
	
	public Endereco(String cidade, String bairro, String logradouro) {
		this.cidade = cidade;
		this.bairro = bairro;
		this.logradouro = logradouro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String toString() {
		return "Cidade: " + getCidade() + "| Bairro: " + getBairro() + "| Logradouro: " + getLogradouro();
	}
		
}
