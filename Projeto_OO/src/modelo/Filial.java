package modelo;

import java.util.ArrayList;

/**
 * @author Cayo Felipe Alencar Camara
 * @author Gabryel Nicolas Soares
 * 
 *         A classe filial representa uma filial da farmacia e armazena uma lista de produtos
 */
public class Filial {

	private String nome;
	private String endereco;
	private String cidade;
	private String cnpj;
	public ArrayList<Produto> produtos = new ArrayList<>();

	/**
	 * Construtor da classe
	 * 
	 * @param nome     representa o nome da filial
	 * @param endereco representa o endereco de uma filial
	 * @param cidade   que representa a cidade a qual na filial está localizada
	 * @param cnpj     que representa o cnpj de uma filial, é uma string pois tem
	 *                 seu formato XX. XXX. XXX/0001-XX.
	 */
	public Filial(String cidade, String nome, String endereco, String cnpj) {

		super();
		this.nome = nome;
		this.endereco = endereco;
		this.cnpj = cnpj;
		this.cidade = cidade;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public ArrayList<Produto> getProdutos() {
		return produtos;
	}

	public String toString() {
		return "Cidade: " + cidade + "\nNome: " + nome + "\n Endereco: " + endereco + "\n CNPJ: " + cnpj;

	}

}
