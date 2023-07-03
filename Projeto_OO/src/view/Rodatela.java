package view;

import controller.ControleFarmacia;

/**
 * classe responsável por fazer a telainicial inicializar
 * 
 * @author Cayo Felipe Alencar Câmara
 * @author Gabryel Nicolas Soares
 * 
 * @see TelaIncial
 */
public class Rodatela {
	
	/**
	 * Metodo main que inicializa a TelaInicial, chamando seu construtor e passando
	 * como parametro uma nova instancia de ControleFarmacia, chamando o construtor da
	 * classe ControleFarmacia.
	 * 
	 * @param args
	 * @throws ParseException
	 */
 
	public static void main(String[] args) {
	
		TelaInicial tela = new TelaInicial(new ControleFarmacia());

	}

}