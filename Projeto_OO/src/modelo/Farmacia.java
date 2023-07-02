package modelo;

import java.util.ArrayList;

/**
 * classe responsável por armazenar todas as filiais e carrega os métodos de
 * manipulação de filiais e produtos.
 * 
 * @author Cayo Felipe Alencar Câmara
 * @author Gabryel Nicolas Soares
 */
public class Farmacia {

	public ArrayList<Filial> filiais = new ArrayList<>();

	/**
	 * retorna todas as filiais registradas no ArrayList.
	 * 
	 */

	public ArrayList<Filial> getFiliais() {
		return filiais;
	}

	/**
	 * Adicona uma nova filial
	 * 
	 * @param filial filial que será adicionada
	 */

	public void adicionar(Filial filial) {
		filiais.add(filial);
	}

	/**
	 * o método delete que percorre a lista de filiais por meio do for each e remove
	 * a filial cujo nome foi passado
	 * 
	 * @param nome nome da filial que será passado para verificação
	 * @see Filial
	 */

	public void delete(String nome) {
		for (Filial f : filiais) {
			if (f.getNome().equalsIgnoreCase(nome)) {
				filiais.remove(f);
				break;
			}
		}
	}

	/**
	 * o método delete que percorre a lista de filiais e a lista de produtos de uma
	 * filial por meio do for each e remove o produto cujo nome foi passado
	 * 
	 * @param nome nome do produto que será passado para verificação
	 */

	public void deletepd(String nome) {
		for (Filial f : filiais) {
			for (Produto p : f.getProdutos()) {
				if (p.getNome().equalsIgnoreCase(nome)) {
					f.getProdutos().remove(p);
					break;
				}

			}
		}
	}

	/**
	 * metodo que realiza a pesquisa de uma filial por meio de um nome
	 * 
	 * @param nome nome da filial que sera usado como parametro da pesquisa
	 * @return f que e a filial encontrada do contrario nao retorna nada
	 */

	public Filial searchFilial(String nome) {
		for (Filial f : filiais) {
			if (f.getNome().equalsIgnoreCase(nome)) {
				return f;
			}
		}
		return null;
	}

	/**
	 * todo que realiza a pesquisa de um produto por meio de um nome
	 * 
	 * @param nome nome do produto que será utilizado como parametro da pesquisa
	 * @return p que e o produto encontrado do contrario nao retorna nada
	 */
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

	/**
	 * metodo que adiciona um produto a uma determinada filial
	 * 
	 * @param nomeFilial nome da filial que receberá o produto
	 * @param produto    produto a ser adicionado
	 * @see Produto
	 */
	public void addProduto(String nomeFilial, Produto produto) {
		for (Filial f : filiais) {
			if (nomeFilial.equals(f.getNome())) {

				f.produtos.add(produto);
			}
		}
	}

}
