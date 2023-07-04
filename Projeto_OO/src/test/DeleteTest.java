package test;

import java.text.ParseException;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import modelo.Farmacia;

/**
 * 
 * @author Cayo Felipe Alencar Camara
 * @author Gabryel Nicolas Soares
 * 
 *         Classe responsavel pelo teste de delete
 *         
 * @see Farmacia
 */
public class DeleteTest {

	/**
	 * 
	 * Teste de delete de uma filial existente em farmacia
	 * 
	 * @throws ParseException
	 */
	@Test
	public void TesteDeleteFilial() throws ParseException {
		Farmacia dell = new Farmacia();

		dell.delete("PHARMA FORTE GAMA");
		
		assertEquals(0, dell.getFiliais().size());
	
		
	}
	
}