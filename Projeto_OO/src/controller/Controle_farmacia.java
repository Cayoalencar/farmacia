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

	

}


