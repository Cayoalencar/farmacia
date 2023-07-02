package controller;

import modelo.Cosmetico;
import modelo.Farmacia;
import modelo.Filial;
import modelo.Medicamento;

public class ControleFarmacia {

	Farmacia farma = new Farmacia();

	public Farmacia getFarmacia() {
		return farma;
	}

	public void adicionar(Filial filial) {
		farma.adicionar(filial);
	}

	public void delete(String nome) {
		farma.delete(nome);
	}

	public boolean listagemFilial(String cidadeList) {
		for (Filial f : farma.getFiliais()) {
			if (cidadeList.equalsIgnoreCase(f.getCidade())) {
				return true;
			}
		}
		return false;
	}

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
	
	public void updateMedicamento(Medicamento produto, String nome, Double valor, Integer qtd, String classificacao, String finalidade, String lab) {
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
