
package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import controller.Controle_farmacia;

public class Telamenu {
	private Controle_farmacia dados = new Controle_farmacia();
	private Telafiliais tela;
	private Adiciona telaadd;

	public Telamenu() {

		// Cria a janela da próxima tela

		JFrame telamenu = new JFrame("Tela Menu");

		telamenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		telamenu.setSize(1440, 900);

		// Cria o painel com a barra

		JPanel barra = new JPanel() {

			public void paintComponent(Graphics g) {

				super.paintComponent(g);

				g.fillRect(0, 0, getWidth(), 85); // Define a posição e o tamanho do painel

				// Carregar a imagem

				Image imagem = new ImageIcon("imagens/acess1.png").getImage();

				// Desenhar a imagem

				g.drawImage(imagem, 0, 0, null);

				// Carregar a imagem

				Image logo = new ImageIcon("imagens/logo2.png").getImage();

				// Desenhar a imagem

				g.drawImage(logo, 0, 0, null);

			}

		};

		// Cria o primeiro botão

		JButton botao1 = new JButton("FILIAIS");

		botao1.setBackground(Color.WHITE);

		botao1.setFont(new Font("Arial Black", Font.PLAIN, 22));

		botao1.setForeground(Color.RED);

		botao1.setBounds(410, 650, 200, 80);

		botao1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				//Telafiliais.updatedata();

				Telafiliais telaFilial = new Telafiliais(dados);

			}

		});

// Cria o segundo botão 

		JButton botao3 = new JButton("ADICIONA");

		botao3.setBackground(Color.WHITE);

		botao3.setFont(new Font("Arial Black", Font.PLAIN, 22));

		botao3.setForeground(Color.RED);

		botao3.setBounds(830, 650, 200, 80);

		botao3.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				telaadd= new Adiciona(dados);

			}

		});

		// Adiciona os botões e barra a tela

		telamenu.add(botao1);

		telamenu.add(botao3);

		telamenu.add(barra);

		// Adiciona o painel as janelas

		// Exibe a janela

		telamenu.setVisible(true);

	}

}