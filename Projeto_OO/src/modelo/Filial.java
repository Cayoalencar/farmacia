package modelo;

import java.util.ArrayList;

public class Filial {
	private String nome;
	private String endereco;
	private String cnpj; 
	public  ArrayList <Produto> produtos = new ArrayList<>();
	
	public Filial(String nome, String endereco, String cnpj) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.cnpj = cnpj;
		
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
	public ArrayList<Produto> getProdutos() {
		return produtos;
	}
	

	public String toString() {
		return "Nome: " + nome + "\n Endereco: " + endereco + "\n CNPJ: " + cnpj;
		
	}
	
	public void adicionar (Produto produto) {
		produtos.add(produto);
	}
	public void delete (Produto produto) {
		produtos.remove(produto);
	}
	
	public void listarMedicamento () {
		for(Produto p: produtos) {
			if(p instanceof Medicamento ) {
				System.out.println(p.toString());
			}
		}
		}
	
	public void listarCosmetico () {
		for(Produto p: produtos) {
			if(p instanceof Cosmetico ) {
				System.out.println(p.toString());
			}
		}
		}
	
	

	

}


