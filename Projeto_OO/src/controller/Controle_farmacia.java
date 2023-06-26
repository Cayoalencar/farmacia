package controller;

import java.util.*;
import modelo.*;
import view.*;

public class Controle_farmacia {

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
	public Controle_farmacia() {
		// farma.adicionar(new Filial("Farma forte gama", "gama, quadra 10, lote 23",
		// "37.571.944/0001-29"));
	}

}
