package view;

import java.awt.Color;

import java.awt.Font;

import java.awt.Image;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javax.swing.ImageIcon;

import javax.swing.JButton;

import javax.swing.JFrame;

import javax.swing.JLabel;

import javax.swing.JOptionPane;

import javax.swing.JTextField;

import controller.*;

import modelo.*;

public class Adiciona {
	private JFrame telaadd;
	private Controle_farmacia dados;

	public Adiciona(Controle_farmacia dados) {
		this.dados = dados;
		telaadd = new JFrame("CADASTRO");

		telaadd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		telaadd.setSize(1440, 900);

		telaadd.setVisible(true);

		// Carregar a imagem

		ImageIcon logo = new ImageIcon("imagens/logo2.png");

		Image image = logo.getImage();

		ImageIcon back = new ImageIcon("imagens/back.png");

		Image image1 = back.getImage();

		// Cria um JLabel para exibir a imagem

		JLabel imageLabel = new JLabel(new ImageIcon(image));

		imageLabel.setBounds(0, 0, image.getWidth(null), image.getHeight(null));

		JTextField classificacao = new JTextField(10);

		classificacao.setBounds(360, 520, 200, 30);

		classificacao.setActionCommand("myTF");

		 JTextField finalidade = new JTextField(10);

		finalidade.setBounds(360, 570, 200, 30);

		finalidade.setActionCommand("myTF");

		JTextField lab = new JTextField(10);

		lab.setBounds(360, 620, 200, 30);

		lab.setActionCommand("myTF");

		 JLabel j = new JLabel("CLASSIFICAÇAO: ");

		j.setFont(new Font("Arial Black", Font.PLAIN, 22));

		j.setBounds(150, 520, 240, 30);

		 JLabel j1 = new JLabel("");

		j1.setBounds(390, 200, 200, 30);

		 JLabel u = new JLabel("FINALIDADE: ");

		u.setFont(new Font("Arial Black", Font.PLAIN, 22));

		u.setBounds(150, 570, 240, 30);

		 JLabel u1 = new JLabel("");

		u1.setBounds(390, 300, 20, 30);

		 JLabel t = new JLabel("LABORATORIO: ");

		t.setFont(new Font("Arial Black", Font.PLAIN, 22));

		t.setBounds(150, 620, 240, 30);

		 JLabel t1 = new JLabel("");

		t1.setBounds(390, 100, 20, 30);

		classificacao.setVisible(false);

		lab.setVisible(false);
		;

		finalidade.setVisible(false);

		j.setVisible(false);

		j1.setVisible(false);

		t1.setVisible(false);

		t.setVisible(false);

		u.setVisible(false);

		u1.setVisible(false);

		 JTextField marca = new JTextField(10);

		marca.setBounds(360, 520, 200, 30);

		marca.setActionCommand("myTF");

		 JTextField tipo = new JTextField(10);

		tipo.setBounds(360, 570, 200, 30);

		tipo.setActionCommand("myTF");

		 JLabel r = new JLabel("MARCA: ");

		r.setFont(new Font("Arial Black", Font.PLAIN, 22));

		r.setBounds(150, 520, 200, 30);

		 JLabel re = new JLabel("");

		re.setBounds(350, 520, 10, 30);

		 JLabel b = new JLabel("TIPO: ");

		b.setFont(new Font("Arial Black", Font.PLAIN, 22));

		b.setBounds(150, 570, 200, 30);

		 JLabel be = new JLabel("");

		be.setBounds(350, 570, 10, 30);

		marca.setVisible(false);

		tipo.setVisible(false);

		r.setVisible(false);

		b.setVisible(false);

		re.setVisible(false);

		be.setVisible(false);

		JButton botaop = new JButton("MEDICAMENTO");

		botaop.setFont(new Font("Arial Black", Font.PLAIN, 22));

		botaop.setForeground(Color.RED);

		botaop.setBounds(150, 150, 200, 50);

		botaop.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				classificacao.setVisible(true);

				lab.setVisible(true);
				;

				finalidade.setVisible(true);

				j.setVisible(true);

				j1.setVisible(true);

				t1.setVisible(true);

				t.setVisible(true);

				u.setVisible(true);

				u1.setVisible(true);

				marca.setVisible(false);

				tipo.setVisible(false);

				r.setVisible(false);

				b.setVisible(false);

				re.setVisible(false);

				be.setVisible(false);

			}

		});

		JButton botaof = new JButton("COSMETICO");
		botaof.setFont(new Font("Arial Black", Font.PLAIN, 22));

		botaof.setForeground(Color.RED);

		botaof.setBounds(360, 150, 200, 50);

		botaof.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				marca.setVisible(true);

				tipo.setVisible(true);

				r.setVisible(true);

				b.setVisible(true);

				re.setVisible(true);

				be.setVisible(true);

				classificacao.setVisible(false);

				lab.setVisible(false);
				;

				finalidade.setVisible(false);

				j.setVisible(false);

				j1.setVisible(false);

				t1.setVisible(false);

				t.setVisible(false);

				u.setVisible(false);

				u1.setVisible(false);

			}

		});

		// criando caixas de texto

		final JTextField nome = new JTextField(10);

		nome.setBounds(1080, 290, 200, 30);

		nome.setActionCommand("myTF");

		final JTextField endereco = new JTextField(10);
		endereco.setText("Cidade: ;Bairro: ;Logradouro:");

		endereco.setBounds(1080, 370, 200, 30);

		endereco.setActionCommand("myTF");

		 final JTextField cnpj = new JTextField(10);

		cnpj.setBounds(1080, 450, 200, 30);

		cnpj.setActionCommand("myTF");

		final JTextField nomep = new JTextField(10);

		nomep.setBounds(360, 270, 200, 30);

		nomep.setActionCommand("myTF");

		final JTextField valor = new JTextField(10);

		valor.setBounds(360, 320, 200, 30);

		valor.setActionCommand("myTF");

		final JTextField qtd = new JTextField(10);

		qtd.setBounds(360, 370, 200, 30);

		qtd.setActionCommand("myTF");

		final JTextField peso = new JTextField(10);

		peso.setBounds(360, 420, 200, 30);

		peso.setActionCommand("myTF");

		final JTextField codigo = new JTextField(10);

		codigo.setBounds(360, 470, 200, 30);

		codigo.setActionCommand("myTF");

		// Cria rótulos.

		JLabel jlabPrompt = new JLabel("NOME DA FILIAL: ");

		jlabPrompt.setFont(new Font("Arial Black", Font.PLAIN, 22));

		jlabPrompt.setBounds(840, 290, 240, 30);

		JLabel jlabContents = new JLabel("");

		jlabContents.setBounds(980, 100, 20, 30);

		JLabel jlabPrompt1 = new JLabel("ENDERECO: ");

		jlabPrompt1.setFont(new Font("Arial Black", Font.PLAIN, 22));

		jlabPrompt1.setBounds(840, 370, 240, 30);

		JLabel jlabContents1 = new JLabel("");

		jlabContents1.setBounds(980, 200, 20, 30);

		JLabel jlabPrompt2 = new JLabel("CNPJ: ");

		jlabPrompt2.setFont(new Font("Arial Black", Font.PLAIN, 22));

		jlabPrompt2.setBounds(840, 450, 240, 30);

		JLabel jlabContents2 = new JLabel("");

		jlabContents2.setBounds(980, 300, 20, 30);

		JLabel jlabPrompt7 = new JLabel("NOME: ");

		jlabPrompt7.setFont(new Font("Arial Black", Font.PLAIN, 22));

		jlabPrompt7.setBounds(150, 270, 240, 30);

		JLabel jlabContents7 = new JLabel("");

		jlabContents1.setBounds(390, 200, 20, 30);

		JLabel jlabPrompt3 = new JLabel("VALOR: ");

		jlabPrompt3.setFont(new Font("Arial Black", Font.PLAIN, 22));

		jlabPrompt3.setBounds(150, 320, 240, 30);

		JLabel jlabContents3 = new JLabel("");

		jlabContents.setBounds(390, 100, 20, 30);

		JLabel jlabPrompt4 = new JLabel("QUANTIDADE: ");

		jlabPrompt4.setFont(new Font("Arial Black", Font.PLAIN, 22));

		jlabPrompt4.setBounds(150, 370, 240, 30);

		JLabel jlabContents4 = new JLabel("");

		jlabContents1.setBounds(390, 200, 20, 30);

		JLabel jlabPrompt5 = new JLabel("PESO: ");

		jlabPrompt5.setFont(new Font("Arial Black", Font.PLAIN, 22));

		jlabPrompt5.setBounds(150, 420, 240, 30);

		JLabel jlabContents5 = new JLabel("");

		jlabContents2.setBounds(390, 300, 20, 30);

		JLabel jlabPrompt6 = new JLabel("CODIGO: ");

		jlabPrompt6.setFont(new Font("Arial Black", Font.PLAIN, 22));

		jlabPrompt6.setBounds(150, 470, 240, 30);

		JLabel jlabContents6 = new JLabel("");

		jlabContents.setBounds(390, 100, 20, 30);

		// Cria o botão com para transformar todas as letras em maiúsculo.

		JButton botao = new JButton("ADICIONA PRODUTO");

		botao.setFont(new Font("Arial Black", Font.PLAIN, 22));

		botao.setForeground(Color.RED);

		botao.setBounds(200, 720, 300, 50);

		botao.addActionListener(new ActionListener() {

			// erro aqui, essa ação só pode ocorrer se o botao medicamentos estiver
			// acionado!

			public void actionPerformed(ActionEvent e) {

				if (classificacao.isVisible() && finalidade.isVisible() && lab.isVisible()) {
					if (nomep.getText().isBlank() || valor.getText().isEmpty() || qtd.getText().isBlank()
							|| qtd.getText().isEmpty() || peso.getText().isBlank() || peso.getText().isEmpty()
							|| codigo.getText().isBlank() || codigo.getText().isEmpty()
							|| classificacao.getText().isBlank() || classificacao.getText().isEmpty()
							|| finalidade.getText().isBlank() || finalidade.getText().isEmpty()
							|| lab.getText().isBlank() || lab.getText().isEmpty()) {
						JOptionPane.showMessageDialog(null, "PREENCHA CORRETAMENTE!");
					} else {
						for (Filial f : dados.getFarmacia().getFiliais()) {

							dados.getFarmacia()
									.addProduto(new Medicamento(nomep.getText(), Double.parseDouble(valor.getText()),
											Integer.parseInt(qtd.getText()), Double.parseDouble(peso.getText()),
											Integer.parseInt(codigo.getText()), classificacao.getText(),
											finalidade.getText(), lab.getText()));
							JOptionPane.showMessageDialog(null, "PRODUTO CADASTRADO");
						}

					}
				}

				else if (marca.isVisible() && tipo.isVisible()) {

					if (nomep.getText().isBlank() || valor.getText().isEmpty() || qtd.getText().isBlank()
							|| qtd.getText().isEmpty() || peso.getText().isBlank() || peso.getText().isEmpty()
							|| codigo.getText().isBlank() || codigo.getText().isEmpty() || marca.getText().isBlank()
							|| marca.getText().isEmpty() || tipo.getText().isBlank() || tipo.getText().isEmpty()) {
						JOptionPane.showMessageDialog(null, "PREENCHA CORRETAMENTE!");
					}

					else {

						dados.getFarmacia()
								.addProduto(new Cosmetico(nomep.getText(), Double.parseDouble(valor.getText()),
										Integer.parseInt(qtd.getText()), Double.parseDouble(peso.getText()),
										Integer.parseInt(codigo.getText()), marca.getText(), tipo.getText()));
						JOptionPane.showMessageDialog(null, "PRODUTO CADASTRADO");
					}

				}

			}

		});
		// Controle_farmacia controleFarmacia = new Controle_farmacia();

		JButton botao2 = new JButton("ADICIONA FILIAL");

		botao2.setFont(new Font("Arial Black", Font.PLAIN, 22));

		botao2.setForeground(Color.RED);

		botao2.setBounds(900, 720, 300, 50);

		botao2.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				if (nome.getText().isBlank() || nome.getText().isEmpty() || endereco.getText().isBlank()
						|| endereco.getText().isEmpty() || cnpj.getText().isBlank() || cnpj.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "PREENCHA CORRETAMENTE!");
				} else {

					dados.getFarmacia().adicionar((new Filial(nome.getText(), endereco.getText(), cnpj.getText())));

					JOptionPane.showMessageDialog(null, "FILIAL CADASTRADA");

				}

			}

		});

		JButton botao1 = new JButton("BACK");

		botao1.setIcon(new ImageIcon(image1));

		botao1.setBounds(1350, 0, 90, 80);

		botao1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				telaadd.dispose();

			}

		});

		// Adiciona os componentes ao painel de conteúdo.

		telaadd.add(botao1);

		telaadd.add(imageLabel);

		telaadd.add(jlabPrompt);

		telaadd.add(jlabPrompt1);

		telaadd.add(jlabPrompt2);

		telaadd.add(jlabPrompt3);

		telaadd.add(jlabPrompt4);

		telaadd.add(jlabPrompt5);

		telaadd.add(jlabPrompt6);

		telaadd.add(jlabPrompt7);

		telaadd.add(nome);

		telaadd.add(endereco);

		telaadd.add(cnpj);

		telaadd.add(nomep);

		telaadd.add(valor);

		telaadd.add(qtd);

		telaadd.add(peso);

		telaadd.add(codigo);

		telaadd.add(botao);

		telaadd.add(botao2);

		telaadd.add(botaof);

		telaadd.add(botaop);

		telaadd.add(jlabContents);

		telaadd.add(jlabContents1);

		telaadd.add(jlabContents2);

		telaadd.add(jlabContents3);

		telaadd.add(jlabContents4);

		telaadd.add(jlabContents5);

		telaadd.add(jlabContents6);

		telaadd.add(jlabContents7);

		telaadd.add(tipo);

		telaadd.add(marca);

		telaadd.add(be);

		telaadd.add(re);

		telaadd.add(b);

		telaadd.add(r);

		telaadd.add(classificacao);

		telaadd.add(lab);

		telaadd.add(finalidade);

		telaadd.add(j);

		telaadd.add(j1);

		telaadd.add(t1);

		telaadd.add(t);

		telaadd.add(u);

		telaadd.add(u1);

		// Mostra o frame construído.

		telaadd.setVisible(true);

	}

}