package modelo;

import java.util.List;

public class Filial {
	private String nome;
	private Endereco endereco;
	private long cnpj; 
	private List<Produto> produtos;
	

	
	
	public Filial(String nome, Endereco endereco, long cnpj, List<Produto> produtos) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.cnpj = cnpj;
		this.produtos = produtos;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public double getCnpj() {
		return cnpj;
	}
	public void setCnpj(long cnpj) {
		this.cnpj = cnpj;
	}
	public List<Produto> getProdutos() {
		return produtos;
	}
	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public String toString() {
		return "Nome da filial: " + getNome() + "| " + getEndereco() + "| Cnpj: " + getCnpj() + "| " + getProdutos() + "\n\n";
	}

}


