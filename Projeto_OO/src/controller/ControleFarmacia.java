package controller;

import modelo.Cosmetico;
import modelo.Farmacia;
import modelo.Filial;
import modelo.Medicamento;
import view.TelaCadastro;
import view.TelaList;

/**
 * 
 * @author Cayo Felipe Alencar Camara
 * @author Gabryel Nicolas Soares
 * 
 *         A classe Controle_farmacia e responsavel por fazer a ligacao entre as
 *         telas e a modelo armazenando metodos e puxando metodos da classe do
 *         modelo Farmacia
 * 
 * @see Farmacia
 */

public class ControleFarmacia {

	Farmacia farma = new Farmacia();

	public Farmacia getFarmacia() {
		return farma;
	}

	
	Medicamento produtom = new Medicamento("Paracetamol ", 12.99, 10, 2.5, 15701, "Controlado", "Analgésico",
			"União Química");
	Cosmetico produtoc = new Cosmetico("Malbec ", 50.90, 10, 250, 19701, "Boticario", "Perfume");
	Filial filial = new Filial("GAMA", "PHARMA FORTE GAMA", "SETOR SUL", "12412");

	/**
	 * Adiciona uma filial a farmacia farma instanciada no controlador
	 * 
	 * @param filial representa uma filial que tem seus atributos setados por
	 *               textfields na view
	 * @see TelaCadastro
	 */
	public void adicionar(Filial filial) {
		farma.adicionar(filial);
	}
	
	
	
	

	/**
	 * deleta uma filial a partir do nome da filial que recebe de um textfield na
	 * tela de listagem
	 * 
	 * @param nome da filial que sera deletada
	 * @see TelaList
	 */
	public void delete(String nome) {
		farma.delete(nome);
	}

	/**
	 * Realiza a filtragem das filiais pela cidade a que pertecem
	 * 
	 * @param cidadeList representa a cidade que tera suas filiais listadas
	 * @return true sempre que existe uma filial na cidade, do contrario retorna
	 *         falso
	 * @see Filial
	 */
	public boolean listagemFilial(String cidadeList) {
		for (Filial f : farma.getFiliais()) {
			if (cidadeList.equalsIgnoreCase(f.getCidade())) {
				return true;
			}
		}
		return false;
	}

	/**
	 * realiza uma checagem do cnpj
	 * 
	 * @param valor recebe o valor por meio de um textfield para checagem
	 * 
	 *              verifica se o cnpj possui apenas numeros sem caracteres
	 */
	public boolean checkCNPJ(String valor) {
		try {

			Long.parseLong(valor);

		} catch (NumberFormatException e) {

			return false;

		}
		return true;
	}

	/**
	 * realiza o update dos atributos de um cosmetico
	 * 
	 * @param produto recebe o produto que é um cosmetico por meio de um click em
	 *                uma lista e tera seus atributos atualizados
	 * @param nome    recebe o nome por meio de um textfield para atualizacao
	 * @param valor   recebe o valor por meio de um textfield para atualizacao
	 * @param qtd     recebe a quantidade por meio de um textfield para atualizacao
	 * @param marca   recebe a marca por meio de um textfield para atualizacao
	 * @param tipo    recebe o valor por meio de um textfield para atualizacao
	 * 
	 *                verifica se os dados recebidos nos parametros e igual aos do
	 *                modelo e se for diferente ele e alterado
	 */
	public void updateCosmetico(Cosmetico produto, String nome, Double valor, Integer qtd, String marca, String tipo) {
		if (!nome.equals(produto.getNome())) {
			produto.setNome(nome);
			if (!valor.equals(produto.getValor())) {
				produto.setValor(valor);
			}
			if (!qtd.equals(produto.getQuantidade()))
				;
			produto.setQuantidade(qtd);

		}

		if (!marca.equals(produto.getMarca())) {
			produto.setMarca(marca);
		}

		if (!tipo.equals(produto.getTipo())) {
			produto.setTipo(tipo);
		}
	}

	/**
	 * realiza o update dos atributos de uma filial
	 * 
	 * @param filial   recebe a filial por meio de um click em uma lista que tera
	 *                 seus atributos atualizados
	 * @param nome     recebe o nome por meio de um textfield para atualizacao
	 * @param cidade   recebe a cidade por meio de um textfield para atualizacao
	 * @param endereco recebe o endereco por meio de um textfield para atualizacao
	 * @param cnpj     recebe o cnpj por meio de um textfield para atualização
	 * 
	 *                 verifica se os dados recebidos nos parametros e igual aos do
	 *                 modelo e se for diferente ele e alterado
	 */

	public void updateFilial(Filial filial, String nome, String cidade, String endereco, String cnpj) {
		if (!nome.equals(filial.getNome())) {
			filial.setNome(nome);
		}
		if (!cidade.equals(filial.getCidade())) {
			filial.setCidade(cidade);
		}

		if (!endereco.equals(filial.getEndereco())) {
			filial.setEndereco(endereco);
		}

		if (!cnpj.equals(filial.getCnpj())) {
			filial.setCnpj(cnpj);
		}
	}

	/**
	 * realiza a atualização dos atributos de um medicamento
	 * 
	 * @param produto       recebe o medicamento por meio de um click em uma lista
	 *                      para realizar a atualização
	 * @param nome          recebe nome por meio de um textfield para atualizacao
	 * @param valor         recebe valor por meio de um textfield para atualizacao
	 * @param qtd           recebe quantidade por meio de um textfield para
	 *                      atualizacao
	 * @param classificacao recebe a classificacao de um medicamento por meio de um
	 *                      textfield para atualizacao
	 * @param finalidade    recebe a finalidade por meio de um textfield para
	 *                      atualizacao
	 * @param lab           recebe o laboratorio por meio de um textfield para
	 *                      atualizacao
	 * 
	 *                      verifica se os dados recebidos nos parametros e igual
	 *                      aos do modelo e se for diferente ele e alterado
	 */
	public void updateMedicamento(Medicamento produto, String nome, Double valor, Integer qtd, String classificacao,
			String finalidade, String lab) {
		if (!nome.equals(produto.getNome())) {
			produto.setNome(nome);
			if (!valor.equals(produto.getValor())) {
				produto.setValor(valor);
			}
			if (!qtd.equals(produto.getQuantidade()))
				;
			produto.setQuantidade(qtd);

		}

		if (!classificacao.equals(produto.getClassificacao())) {
			produto.setClassificacao(classificacao);
		}

		if (!finalidade.equals(produto.getFinalidade())) {
			produto.setFinalidade(finalidade);
		}
		if (!lab.equals(produto.getLaboratorio())) {
			produto.setLaboratorio(lab);
		}
	}

}