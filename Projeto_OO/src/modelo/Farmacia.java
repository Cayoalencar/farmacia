package modelo;

import java.util.ArrayList;

public class Farmacia {
	
	public static  ArrayList<Filial> filiais = new ArrayList<>();
 
	public ArrayList<Filial> getFiliais() {
		return filiais;
	}
	public void adicionar (Filial filial) {
		filiais.add(filial);
	}
	public void delete (String nome) {
	for( Filial f: filiais) {
		if(f.getNome().equalsIgnoreCase(nome)) {
			filiais.remove(f);
			break;
		}
	}
	}
	public void listar (String nome) {
		for(Filial f: filiais) {
			if(f.getNome().equalsIgnoreCase(nome)) {
				 System.out.println(f.toString()); 
			for(Produto p: f.getProdutos()) {
				System.out.println(p.toString());
			}
			}
	}
		
	}
	
	public void searchFilial (String nome) {
		//String resultadoBusca="";
		for( Filial f: filiais) {
			if(f.getNome().equalsIgnoreCase(nome)) {
				System.out.println(f.toString());
			}
		}
		}
	
	public void searchProduto (String nome) {
		for (Filial f: filiais) {
		for(Produto p: f.produtos) {
			if(p.getNome().equalsIgnoreCase(nome)) {
				System.out.println(p.toString());
			}
		}
		}	
		}
	public void addProduto (String nome, Produto produto) {
		for(Filial f: filiais) {
			if(f.getNome().equalsIgnoreCase(nome)) {
				f.adicionar(produto);
			}
		}
	}
	
}
	
