package test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.text.ParseException;

import org.junit.jupiter.api.Test;

import controller.ControleFarmacia;
import view.TelaCadastro;

/**
 * 
 * @author Cayo Felipe Alencar Camara
 * @author Gabryel Nicolas Soares
 * 
 *         Classe responsavel pelo teste de checagem de um cnpj
 * 
 * @see ControleFarmacia
 */
public class CNPJTest {

	/**
	 * Teste de Verificacao de um cnpj, onde ele verifica se um cnpj
	 * possui apenas numeros
	 * 
	 * @throws ParseException
	 */
	@Test
	void testeCNPJ() throws ParseException {
		
		ControleFarmacia Cnpj = new ControleFarmacia();
		Cnpj.checkCNPJ("123219302900");

		String valorCNPJErrado = "12.345.678/0001-90";
		String valorCNPJCorreto = "12345678000190";
		
		assertTrue(Cnpj.checkCNPJ(valorCNPJCorreto));
		assertFalse(Cnpj.checkCNPJ(valorCNPJErrado));
	}
}