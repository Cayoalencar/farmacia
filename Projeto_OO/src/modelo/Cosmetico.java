	package modelo;

public class Cosmetico extends Produto {
	
	private String marca;
	private String tipo;
	
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
		return "Nome: " + nome  + "\n Valor: " + valor + "\n Quatidade: " + quantidade + "\n Peso: " + peso +
				"\n Codigo: " + codigo  + "\n Marca: " + marca + "\n Tipo: " + tipo;

	}
	
}
