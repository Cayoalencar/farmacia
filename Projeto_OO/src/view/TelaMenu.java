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

import controller.ControleFarmacia;

/**
 * 
 * @author Cayo Felipe Alencar Camara
 * @author Gabryel Nicolas Soares
 * 
 *         Classe responsavel por criar uma nova tela, a telamenu, tela onde irao
 *         estar as opcoes de listagem de filiais ou produtos e a nova tela de cadastro
 *         de filiais e produtos
 *         
 * @see TelaMenu
 */
public class TelaMenu {
	private ControleFarmacia dados = new ControleFarmacia();
	private TelaList tela;
	private TelaCadastro telaadd;

	public TelaMenu() {

		JFrame telamenu = new JFrame("Tela Menu");

		telamenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		telamenu.setSize(1440, 900);

		JPanel barra = new JPanel() {

			public void paintComponent(Graphics g) {

				super.paintComponent(g);

				g.fillRect(0, 0, getWidth(), 85);

				Image imagem = new ImageIcon("imagens/acess1.png").getImage();

				g.drawImage(imagem, 0, 0, null);

				Image logo = new ImageIcon("imagens/logo2.png").getImage();

				g.drawImage(logo, 0, 0, null);

			}

		};

		JButton botao1 = new JButton("LIST");

		botao1.setBackground(Color.WHITE);

		botao1.setFont(new Font("Arial Black", Font.PLAIN, 22));

		botao1.setForeground(Color.RED);

		botao1.setBounds(410, 650, 200, 80);

		botao1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				TelaList telaFilial = new TelaList(dados);

			}

		});

		JButton botao3 = new JButton("CADASTRO");

		botao3.setBackground(Color.WHITE);

		botao3.setFont(new Font("Arial Black", Font.PLAIN, 22));

		botao3.setForeground(Color.RED);

		botao3.setBounds(830, 650, 200, 80);

		botao3.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				telaadd = new TelaCadastro(dados);

			}

		});

		telamenu.add(botao1);

		telamenu.add(botao3);

		telamenu.add(barra);

		telamenu.setVisible(true);

	}

}