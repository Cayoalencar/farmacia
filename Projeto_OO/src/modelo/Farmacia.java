package modelo;

import java.util.ArrayList;

public class Farmacia {

	public ArrayList<Filial> filiais = new ArrayList<>();

	public ArrayList<Filial> getFiliais() {
		return filiais;
	}

	public void adicionar(Filial filial) {
		filiais.add(filial);
	}

	public void delete(String nome) {
		for (Filial f : filiais) {
			if (f.getNome().equalsIgnoreCase(nome)) {
				filiais.remove(f);
				break;
			}
		}
	}
	
	public void deletepd(String nome) {
		for (Filial f : filiais) {
			for(Produto p: f.getProdutos()) {
			if (p.getNome().equalsIgnoreCase(nome)) {
				f.getProdutos().remove(p);
				break;
			}
				
			}
		}
	}

	public void listar(String nome) {
		for (Filial f : filiais) {
			if (f.getNome().equalsIgnoreCase(nome)) {
				// System.out.println(f.toString());
				for (Produto p : f.getProdutos()) {
					System.out.println(p.toString());
				}
			}
		}

	}

	public void listFilial(String cidade) {
		for (Filial f : filiais) {
			if (cidade.equalsIgnoreCase(cidade)) {

				System.out.println(cidade);
				System.out.println(f);
			}
		}
	}

	public Filial searchFilial(String nome) {
		for (Filial f : filiais) {
			if (f.getNome().equalsIgnoreCase(nome)) {
				return f;
			}
		}
		return null;
	}

	public Produto searchProduto(String nome) {
		for (Filial f : filiais) {
			for (Produto p : f.produtos) {
				if (p.getNome().equalsIgnoreCase(nome)) {
					return p;
				}
			}
		}
		return null;
	}

	public void addProduto(String nomeFilial, Produto produto) {
		for (Filial f : filiais) {
			if (nomeFilial.equals(f.getNome())) {

				f.produtos.add(produto);
			}
		}
	}

	public void listarCosmetico() {
		for (Filial f : filiais) {
			for (Produto p : f.produtos) {
				if (p instanceof Cosmetico) {
					System.out.println(p.toString());
				}
			}
		}
	}

}
