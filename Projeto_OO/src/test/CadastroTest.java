package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.text.ParseException;

import org.junit.jupiter.api.Test;

import controller.ControleFarmacia;
import modelo.Farmacia;
import modelo.Filial;
import view.TelaCadastro;

/**
 * 
 * @author Cayo Felipe Alencar Camara
 * @author Gabryel Nicolas Soares
 * 
 *         Classe responsavel pelo teste de cadastro de uma filial
 * 
 * @see TelaCadastro
 */
public class CadastroTest {

	/**
	 * Teste de Cadastro onde se cadastra uma nova filial, verificando
	 * se uma nova filial foi cadastrada
	 * 
	 * @throws ParseException
	 */

	@Test
	public void cadastroFilial() throws ParseException {
		Farmacia cadastro = new Farmacia();

		cadastro.adicionar( new Filial("GAMA", "PHARMA FORTE GAMA", "SETOR SUL", "12412"));
		
		assertEquals(1, cadastro.getFiliais().size());
	
	}

}