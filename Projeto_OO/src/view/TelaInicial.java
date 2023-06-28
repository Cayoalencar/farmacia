package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

import controller.ControleFarmacia;

public class TelaInicial extends JFrame {
	
	private ControleFarmacia dados;

	public TelaInicial(ControleFarmacia dados) {
		this.dados=dados;

		// Cria a tela inicial

		 JFrame telainicial = new JFrame("Tela Inicial");

		telainicial.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		telainicial.setSize(1440, 900);

		// Carrega a imagem a partir de um arquivo

		ImageIcon imagem = new ImageIcon("imagens/pharmaforteinicial.png");

		// Cria um nome e define a imagem nele

		JLabel logog = new JLabel(imagem);

		telainicial.getContentPane().add(logog);

		// Exibe a tella inicial

		telainicial.setVisible(true);

		// Aguarda 5 segundos e depois transita para a próxima tela

		Timer timer = new Timer(4000, new ActionListener() {

			public void actionPerformed(ActionEvent e) {
			
				TelaMenu menu = new TelaMenu();
				telainicial.dispose();

			}

		});

		timer.setRepeats(false); // Executa apenas uma vez

		timer.start();

	}

}