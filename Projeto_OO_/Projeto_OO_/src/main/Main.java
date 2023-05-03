package main;

import java.util.ArrayList;
import modelo.*;

public class Main {

	public static void main(String[] args) {

		ArrayList<Filial> filiais = new ArrayList<Filial>();

		ArrayList<Produto> produtosgama = new ArrayList<Produto>();
		ArrayList<Produto> produtossm = new ArrayList<Produto>();
		
		Produto produtom= new Medicamento("Paracetamol ", 12.99 , 10 , 2.5 , 15701, "Controlado", "Analgésico", "União Química");
		Produto produtom1= new Medicamento("amoxicilina ", 19.99 , 8 , 2.5 , 15702, "Controlado", "Anti Inflamatorio", "GSK");
		Produto produtom2= new Medicamento("Dipirona ", 8.95 , 10 , 2.5 , 15703, "Controlado", "Analgésico", "Cosmed");
		Produto produtom3= new Medicamento("Xarope ", 15.95 , 9 , 250 , 15704, "Não Controlado", "Expectorate", "Bayer");
		Produto produtoc= new Cosmetico("Malbec ", 50.90 , 10 , 250 , 19701, "Boticario", "Perfume");
		Produto produtoc1= new Cosmetico("Hidratante Cereja ", 30.95 , 9 , 500 , 19702, "Natura", "Creme para pele");
		Produto produtoc2= new Cosmetico("Condicionador Fyo ", 40.99 , 10 , 750 , 19703, "Jequiti", "Condicionador capilar");
		Produto produtoc3= new Cosmetico("Shampoo Siage ", 35.99 , 8 , 500 , 19704, "Eudoera", "Shampoo capilar");

		
		//produtos da filial gama
		produtosgama.add(produtom);
		produtosgama.add(produtom1);
		produtosgama.add(produtom2);
		produtosgama.add(produtoc);
		produtosgama.add(produtoc1);
		produtosgama.add(produtoc2);
		
		//produtos da filial santa maria
		produtossm.add(produtom3);
		produtossm.add(produtom);
		produtossm.add(produtom1);
		produtossm.add(produtoc);
		produtossm.add(produtoc1);
		produtossm.add(produtoc3);
		
		Filial filial= new Filial("PharmaPhorte GAMA ", new Endereco("GAMA ", "SETOR SUL ", "QR 200 LOTE 2 "), 1013760 , produtosgama);
		Filial filial1= new Filial("PharmaPhorte SANTA MARIA ", new Endereco("SANTA MARIA ", "SETOR NORTE ", "QR 124 LOTE 15 "), 1012689 , produtossm);
		
		filiais.add(filial);
		filiais.add(filial1);
		
		System.out.println(filiais.toString());
		
		}

}
