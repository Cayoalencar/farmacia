package controller;

import java.util.*;
import modelo.*;
import view.*;

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
		for(Filial f : farma.getFiliais()) {
			if (cidadeList.equalsIgnoreCase(f.getCidade())) {
				return true;
			}
		}
		return false;
	}

}
