package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.text.ParseException;

import org.junit.jupiter.api.Test;

import controller.ControleFarmacia;
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
		TelaCadastro cadastro = new TelaCadastro(new ControleFarmacia());

		cadastro.getNome().setText("PHARMA FORTE GAMA");
		cadastro.getCidade().setText("GAMA");
		cadastro.getCnpj().setText("12313100");
		cadastro.getEndereco().setText("Setor SUL QD 10");
		cadastro.getCadastrar().doClick();

		assertEquals(1, cadastro.getDados().getFarmacia().getFiliais().size());
	}

}