
package modelo;

/**
 * 
 * @author Cayo Felipe Alencar Camara
 * @author Gabryel Nicolas Soares
 * 
 *         a classe cosmetico e uma classe que herda de produto que representa
 *         um cosmetico que pode ser adicionado a uma filial da farmacia
 * @see Produto
 */
public class Cosmetico extends Produto {

	private String marca;
	private String tipo;

	/**
	 * 
	 * @param nome       nome de um produto
	 * @param valor      valor de um produto
	 * @param quantidade quantidade de produtos na filial
	 * @param peso       peso de um produto
	 * @param codigo     codigo de um produto
	 * @param marca      marca de um cosmetico
	 * @param tipo
	 */
	public Cosmetico(String nome, double valor, int quantidade, double peso, int codigo, String marca, String tipo) {
		super(nome, valor, quantidade, peso, codigo);

		this.marca = marca;
		this.tipo = tipo;

	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String toString() {
		return "Nome: " + nome + ",Valor: " + valor + ",Quatidade: " + quantidade + ",Peso: " + peso + ",Codigo: "
				+ codigo + ",Marca: " + marca + ",Tipo: " + tipo;

	}

}
