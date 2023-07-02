package modelo;

/**
 * 
 * @author Cayo Felipe Alencar Camara
 * @author Gabryel Nicolas Soares
 * 
 *         A classe produto e uma classe abstrata que representa um produto de
 *         uma filial que pode ser um cosmetico ou um medicamento
 * @see Cosmetico
 * @see Medicamento
 */
public abstract class Produto {
	protected String nome;
	protected double valor;
	protected int quantidade;
	protected double peso;
	protected int codigo;

	/**
	 * construtor da classe
	 * 
	 * @param nome       nome do produto
	 * @param valor      valor do produto
	 * @param quantidade quantidade de um produto
	 * @param peso       peso de um produto
	 * @param codigo     codigo de um produto
	 */
	public Produto(String nome, double valor, int quantidade, double peso, int codigo) {
		super();
		this.nome = nome;
		this.valor = valor;
		this.quantidade = quantidade;
		this.peso = peso;
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public double getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

}
