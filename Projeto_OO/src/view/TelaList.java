package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.ControleFarmacia;
import modelo.Filial;
import modelo.Produto;

public class TelaList {

	private JList<String> list;
	private DefaultListModel<String> listModel = new DefaultListModel<>();
	private JList<String> products;
	private DefaultListModel<String> productsModel = new DefaultListModel<>();
	private ControleFarmacia dados;
	private JTextField cidadeList;

	public TelaList(ControleFarmacia dados) {
		list = new JList<>(listModel);
		products = new JList<>(productsModel);
		this.dados = dados;

		final JFrame telafiliais = new JFrame("FILIAIS");

		telafiliais.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		telafiliais.setSize(1440, 900);

		telafiliais.setVisible(true);

		telafiliais.setLayout(null);

		ImageIcon logo = new ImageIcon("imagens/logof1.png");

		Image image = logo.getImage();

		ImageIcon logopesquisa = new ImageIcon("imagens/logopesquisa.png");

		Image image2 = logopesquisa.getImage();

		ImageIcon back = new ImageIcon("imagens/back.png");

		Image image1 = back.getImage();

		list.setVisible(false);
		list.setBackground(null);
		list.setBounds(400, 250, 900, 460);
		list.setFont(new Font("Arial Black", Font.PLAIN, 22));

		products.setVisible(false);
		products.setBackground(null);
		products.setBounds(400, 250, 900, 460);
		products.setFont(new Font("Arial Black", Font.PLAIN, 22));

		JLabel selecao = new JLabel("SELECIONE O QUE DESEJA EDITAR");

		selecao.setFont(new Font("Arial Black", Font.PLAIN, 22));

		selecao.setBounds(500, 120, 500, 30);

		selecao.setVisible(false);

		final JTextField nomep = new JTextField(10);

		nomep.setBounds(730, 270, 200, 30);

		final JTextField valor = new JTextField(10);

		valor.setBounds(730, 320, 200, 30);

		final JTextField qtd = new JTextField(10);

		qtd.setBounds(730, 370, 200, 30);

		final JTextField peso = new JTextField(10);

		peso.setBounds(730, 420, 200, 30);

		final JTextField codigo = new JTextField(10);

		codigo.setBounds(730, 470, 200, 30);

		codigo.setLayout(null);

		nomep.setVisible(false);

		valor.setVisible(false);

		qtd.setVisible(false);

		peso.setVisible(false);

		codigo.setVisible(false);

		JLabel jlabPrompt7 = new JLabel("NOME: ");

		jlabPrompt7.setFont(new Font("Arial Black", Font.PLAIN, 22));

		jlabPrompt7.setBounds(520, 270, 240, 30);

		JLabel jlabPrompt3 = new JLabel("VALOR: ");

		jlabPrompt3.setFont(new Font("Arial Black", Font.PLAIN, 22));

		jlabPrompt3.setBounds(520, 320, 240, 30);

		JLabel jlabPrompt4 = new JLabel("QUANTIDADE: ");

		jlabPrompt4.setFont(new Font("Arial Black", Font.PLAIN, 22));

		jlabPrompt4.setBounds(520, 370, 240, 30);

		JLabel jlabPrompt5 = new JLabel("PESO: ");

		jlabPrompt5.setFont(new Font("Arial Black", Font.PLAIN, 22));

		jlabPrompt5.setBounds(520, 420, 240, 30);

		JLabel jlabPrompt6 = new JLabel("CODIGO: ");

		jlabPrompt6.setFont(new Font("Arial Black", Font.PLAIN, 22));

		jlabPrompt6.setBounds(520, 470, 240, 30);

		final JTextField classificacao = new JTextField(10);

		classificacao.setBounds(730, 520, 200, 30);

		final JTextField finalidade = new JTextField(10);

		finalidade.setBounds(730, 570, 200, 30);

		final JTextField lab = new JTextField(10);

		lab.setBounds(730, 620, 200, 30);

		final JLabel j = new JLabel("CLASSIFICAÇAO: ");

		j.setFont(new Font("Arial Black", Font.PLAIN, 22));

		j.setBounds(520, 520, 240, 30);

		JLabel u = new JLabel("FINALIDADE: ");

		u.setFont(new Font("Arial Black", Font.PLAIN, 22));

		u.setBounds(520, 570, 240, 30);

		JLabel t = new JLabel("LABORATORIO: ");

		t.setFont(new Font("Arial Black", Font.PLAIN, 22));

		t.setBounds(520, 620, 240, 30);

		JTextField marca = new JTextField(10);

		marca.setBounds(730, 520, 200, 30);

		final JTextField tipo = new JTextField(10);

		tipo.setBounds(730, 570, 200, 30);

		final JLabel r = new JLabel("MARCA: ");

		r.setFont(new Font("Arial Black", Font.PLAIN, 22));

		r.setBounds(520, 520, 200, 30);

		JLabel b = new JLabel("TIPO: ");

		b.setFont(new Font("Arial Black", Font.PLAIN, 22));

		b.setBounds(520, 570, 200, 30);

		final JTextField cidade = new JTextField(10);

		cidade.setBounds(730, 270, 200, 30);

		final JTextField nome = new JTextField(10);

		nome.setBounds(730, 320, 200, 30);

		final JTextField endereco = new JTextField(10);

		endereco.setBounds(730, 370, 200, 30);

		final JTextField cnpj = new JTextField(10);

		cnpj.setBounds(730, 420, 200, 30);

		JLabel jlabCidade = new JLabel("CIDADE: ");

		jlabCidade.setFont(new Font("Arial Black", Font.PLAIN, 22));

		jlabCidade.setBounds(520, 270, 240, 30);

		JLabel jlabPrompt = new JLabel("NOME DA FILIAL: ");

		jlabPrompt.setFont(new Font("Arial Black", Font.PLAIN, 22));

		jlabPrompt.setBounds(520, 320, 240, 30);

		JLabel jlabPrompt1 = new JLabel("ENDERECO: ");

		jlabPrompt1.setFont(new Font("Arial Black", Font.PLAIN, 22));

		jlabPrompt1.setBounds(520, 370, 240, 30);

		JLabel jlabPrompt2 = new JLabel("CNPJ: ");

		jlabPrompt2.setFont(new Font("Arial Black", Font.PLAIN, 22));

		jlabPrompt2.setBounds(520, 420, 240, 30);

		jlabPrompt.setVisible(false);

		jlabPrompt2.setVisible(false);

		jlabPrompt1.setVisible(false);

		jlabCidade.setVisible(false);

		cnpj.setVisible(false);

		cidade.setVisible(false);

		nome.setVisible(false);

		endereco.setVisible(false);

		jlabPrompt7.setVisible(false);

		jlabPrompt3.setVisible(false);

		jlabPrompt4.setVisible(false);

		jlabPrompt5.setVisible(false);

		jlabPrompt6.setVisible(false);

		marca.setVisible(false);

		tipo.setVisible(false);

		r.setVisible(false);

		b.setVisible(false);

		classificacao.setVisible(false);

		lab.setVisible(false);

		finalidade.setVisible(false);

		j.setVisible(false);

		t.setVisible(false);

		u.setVisible(false);

		// Cria um JLabel para exibir a imagem

		JLabel imageLabel = new JLabel(new ImageIcon(image));

		imageLabel.setBounds(0, 0, image.getWidth(null), image.getHeight(null));

		JButton botao1 = new JButton("BACK");

		botao1.setIcon(new ImageIcon(image1));

		botao1.setBounds(1350, 0, 90, 80);

		final JButton botaoFiliais = new JButton("FILIAIS");

		botaoFiliais.setFont(new Font("Arial Black", Font.PLAIN, 22));

		botaoFiliais.setForeground(Color.RED);

		botaoFiliais.setBounds(130, 150, 200, 50);

		cidadeList = new JTextField();
		cidadeList.setBounds(150, 320, 200, 30);
		cidadeList.setVisible(false);

		JButton botaoupdate = new JButton("EDIT PRODUTO OU FILIAL");

		botaoupdate.setFont(new Font("Arial Black", Font.PLAIN, 22));

		botaoupdate.setForeground(Color.RED);

		botaoupdate.setBounds(1000, 720, 400, 50);

		botaoupdate.setVisible(true);

		JLabel cidadeFind = new JLabel("CIDADE: ");

		cidadeFind.setFont(new Font("Arial Black", Font.PLAIN, 22));

		cidadeFind.setBounds(40, 320, 200, 30);

		cidadeFind.setVisible(false);

		JButton botaoList = new JButton("LISTAR ");
		botaoList.setFont(new Font("Arial Black", Font.PLAIN, 22));
		botaoList.setForeground(Color.red);
		botaoList.setBounds(150, 360, 200, 30);
		botaoList.setVisible(false);

		botaoFiliais.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cidadeList.setVisible(true);
				cidadeFind.setVisible(true);
				botaoList.setVisible(true);
				list.setVisible(true);
				products.setVisible(false);
			}

		});

		botaoList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				list.setVisible(true);
				products.setVisible(false);
				
				if (cidadeList.getText().isBlank() || cidadeList.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "PREENCHA CORRETAMENTE!");
				} else {
					dados.getFarmacia().listFilial(cidadeList.getText());
					if (dados.listagemFilial(cidadeList.getText())) {
						updatedata(dados, cidadeList.getText());
					}
				}

			}
		});

		JLabel nomeFDell = new JLabel("NOME: ");

		nomeFDell.setFont(new Font("Arial Black", Font.PLAIN, 22));

		nomeFDell.setBounds(60, 660, 200, 30);

		nomeFDell.setVisible(false);

		JTextField nomeToDell = new JTextField();
		nomeToDell.setBounds(150, 660, 200, 30);
		nomeToDell.setVisible(false);

		JButton dell = new JButton("DELL");
		dell.setFont(new Font("Arial Black", Font.PLAIN, 22));
		dell.setForeground(Color.red);
		dell.setBounds(150, 700, 200, 30);
		dell.setVisible(false);

		JButton botaoDell = new JButton("DELETE");
		botaoDell.setBounds(750, 150, 200, 50);
		botaoDell.setFont(new Font("Arial Black", Font.PLAIN, 22));

		botaoDell.setForeground(Color.RED);

		botaoDell.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				nomeToDell.setVisible(true);
				nomeFDell.setVisible(true);
				dell.setVisible(true);

			}

		});

		dell.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				if (nomeToDell.getText().isBlank() || nomeToDell.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "PREENCHA CORRETAMENTE!");
				} else {
					dados.getFarmacia().delete(nomeToDell.getText());
					updatedata(dados);
				}

			}

		});

		JTextField pesquisa = new JTextField();
		pesquisa.setBounds(1020, 157, 270, 35);
		pesquisa.setLayout(null);
		pesquisa.setVisible(true);

		JLabel nomeProd = new JLabel("FILIAL: ");

		nomeProd.setFont(new Font("Arial Black", Font.PLAIN, 22));

		nomeProd.setBounds(60, 500, 200, 30);

		nomeProd.setVisible(false);

		JButton botaoProd = new JButton("PRODUTOS");

		botaoProd.setFont(new Font("Arial Black", Font.PLAIN, 22));

		botaoProd.setForeground(Color.RED);

		botaoProd.setBounds(430, 150, 220, 50);

		JTextField pToList = new JTextField();
		pToList.setBounds(150, 500, 200, 30);
		pToList.setVisible(false);

		JButton botaoLPd = new JButton("LISTAR");

		botaoLPd.setFont(new Font("Arial Black", Font.PLAIN, 22));

		botaoLPd.setForeground(Color.RED);

		botaoLPd.setBounds(150, 540, 200, 30);

		botaoLPd.setVisible(false);

		JButton botaopesquisa = new JButton("");
		botaopesquisa.setIcon(new ImageIcon(image2));
		botaopesquisa.setBounds(1320, 150, 50, 50);
		botaopesquisa.setLayout(null);
		botaopesquisa.setVisible(true);

		botaoProd.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
				list.setVisible(false);
				products.setVisible(true);
				botaoLPd.setVisible(true);
				pToList.setVisible(true);
				nomeProd.setVisible(true);
				
				updatedatap(dados);
				dados.getFarmacia().listarCosmetico();
				
			}

		});

		botaoLPd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				list.setVisible(false);
				products.setVisible(true);
				
				updatedatap(dados);
				dados.getFarmacia().listar(pToList.getText());

				if (pToList.getText().isBlank() || pToList.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "PREENCHA CORRETAMENTE!");
				} else {

				}
			}
		});

		botaopesquisa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});

		JButton botaocorrect = new JButton("EDITAR");

		botaocorrect.setFont(new Font("Arial Black", Font.PLAIN, 22));

		botaocorrect.setForeground(Color.RED);

		botaocorrect.setBounds(620, 700, 200, 50);

		botaocorrect.setVisible(false);

		botaocorrect.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				if (marca.isVisible() && tipo.isVisible()) {
					if (nomep.getText().isBlank() || valor.getText().isEmpty() || qtd.getText().isBlank()
							|| qtd.getText().isEmpty() || peso.getText().isBlank() || peso.getText().isEmpty()
							|| codigo.getText().isBlank() || codigo.getText().isEmpty() || marca.getText().isBlank()
							|| marca.getText().isEmpty() || tipo.getText().isBlank() || tipo.getText().isEmpty()) {
						JOptionPane.showMessageDialog(null, "PREENCHA CORRETAMENTE!");
					}

					else {

					}
				}

				else if (classificacao.isVisible() && finalidade.isVisible() && lab.isVisible()) {
					if (nomep.getText().isBlank() || valor.getText().isEmpty() || qtd.getText().isBlank()
							|| qtd.getText().isEmpty() || peso.getText().isBlank() || peso.getText().isEmpty()
							|| codigo.getText().isBlank() || codigo.getText().isEmpty()
							|| classificacao.getText().isBlank() || classificacao.getText().isEmpty()
							|| finalidade.getText().isBlank() || finalidade.getText().isEmpty()
							|| lab.getText().isBlank() || lab.getText().isEmpty()) {
						JOptionPane.showMessageDialog(null, "PREENCHA CORRETAMENTE!");
					}

					else {

					}
				}

				else if (cidade.getText().isBlank() || cidade.getText().isBlank() || cidade.getText().isEmpty()
						|| nome.getText().isBlank() || nome.getText().isEmpty() || endereco.getText().isBlank()
						|| endereco.getText().isEmpty() || cnpj.getText().isBlank() || cnpj.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "PREENCHA CORRETAMENTE!");
				}

				else {

				}

			}

		});

		JButton botaop = new JButton("MEDICAMENTO");

		botaop.setFont(new Font("Arial Black", Font.PLAIN, 22));

		botaop.setForeground(Color.RED);

		botaop.setBounds(150, 180, 200, 50);

		botaop.setVisible(false);

		botaop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				classificacao.setVisible(true);

				lab.setVisible(true);

				finalidade.setVisible(true);

				j.setVisible(true);

				t.setVisible(true);

				u.setVisible(true);

				jlabPrompt7.setVisible(true);

				jlabPrompt3.setVisible(true);

				jlabPrompt4.setVisible(true);

				jlabPrompt5.setVisible(true);

				jlabPrompt6.setVisible(true);

				nomep.setVisible(true);

				valor.setVisible(true);

				qtd.setVisible(true);

				peso.setVisible(true);

				codigo.setVisible(true);

				botaocorrect.setVisible(true);

				marca.setVisible(false);

				tipo.setVisible(false);

				r.setVisible(false);

				b.setVisible(false);

				cnpj.setVisible(false);

				cidade.setVisible(false);

				nome.setVisible(false);

				endereco.setVisible(false);

				jlabPrompt.setVisible(false);

				jlabPrompt2.setVisible(false);

				jlabPrompt1.setVisible(false);

				jlabCidade.setVisible(false);

			}

		});

		JButton botaoc = new JButton("COSMETICO");
		botaoc.setFont(new Font("Arial Black", Font.PLAIN, 22));

		botaoc.setForeground(Color.RED);

		botaoc.setBounds(620, 180, 200, 50);

		botaoc.setVisible(false);

		botaoc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				marca.setVisible(true);

				tipo.setVisible(true);

				r.setVisible(true);

				b.setVisible(true);

				jlabPrompt7.setVisible(true);

				jlabPrompt3.setVisible(true);

				jlabPrompt4.setVisible(true);

				jlabPrompt5.setVisible(true);

				jlabPrompt6.setVisible(true);

				botaocorrect.setVisible(true);

				classificacao.setVisible(false);

				lab.setVisible(false);

				finalidade.setVisible(false);

				j.setVisible(false);

				t.setVisible(false);

				u.setVisible(false);

				cnpj.setVisible(false);

				cidade.setVisible(false);

				nome.setVisible(false);

				endereco.setVisible(false);

				jlabPrompt.setVisible(false);

				jlabPrompt2.setVisible(false);

				jlabPrompt1.setVisible(false);

				jlabCidade.setVisible(false);

				nomep.setVisible(true);

				valor.setVisible(true);

				qtd.setVisible(true);

				peso.setVisible(true);

				codigo.setVisible(true);

			}

		});

		JButton botaof = new JButton("FILIAIS");
		botaof.setFont(new Font("Arial Black", Font.PLAIN, 22));
		botaof.setBounds(1070, 180, 200, 50);
		botaof.setForeground(Color.RED);
		botaof.setVisible(false);

		botaof.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				marca.setVisible(false);

				tipo.setVisible(false);

				r.setVisible(false);

				b.setVisible(false);

				jlabPrompt7.setVisible(false);

				jlabPrompt3.setVisible(false);

				jlabPrompt4.setVisible(false);

				jlabPrompt5.setVisible(false);

				jlabPrompt6.setVisible(false);

				botaocorrect.setVisible(true);

				classificacao.setVisible(false);

				lab.setVisible(false);

				finalidade.setVisible(false);

				j.setVisible(false);

				t.setVisible(false);

				u.setVisible(false);

				nomep.setVisible(false);

				valor.setVisible(false);

				qtd.setVisible(false);

				peso.setVisible(false);

				codigo.setVisible(false);

				cnpj.setVisible(true);

				cidade.setVisible(true);

				nome.setVisible(true);

				endereco.setVisible(true);

				jlabPrompt.setVisible(true);

				jlabPrompt2.setVisible(true);

				jlabPrompt1.setVisible(true);

				jlabCidade.setVisible(true);

			}

		});

		botao1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				telafiliais.dispose();
			}

		});

		botaoupdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				botaoupdate.setVisible(false);
				list.setVisible(false);
				products.setVisible(false);
				botaoLPd.setVisible(false);
				pToList.setVisible(false);
				nomeProd.setVisible(false);
				botaopesquisa.setVisible(false);
				pesquisa.setVisible(false);
				botaoFiliais.setVisible(false);
				botaoProd.setVisible(false);
				botaoDell.setVisible(false);
				nomeFDell.setVisible(false);
				dell.setVisible(false);
				nomeToDell.setVisible(false);
				cidadeFind.setVisible(false);
				botaoList.setVisible(false);
				cidadeList.setVisible(false);
				jlabPrompt.setVisible(false);
				botaop.setVisible(true);
				botaoc.setVisible(true);
				botaof.setVisible(true);
				selecao.setVisible(true);

			}
		});

		telafiliais.add(list);

		telafiliais.add(pToList);

		telafiliais.add(products);

		telafiliais.add(cidadeFind);

		telafiliais.add(cidadeList);

		telafiliais.add(botaoLPd);

		telafiliais.add(botaoList);

		telafiliais.add(nomeFDell);

		telafiliais.add(nomeProd);

		telafiliais.add(nomeToDell);

		telafiliais.add(dell);

		telafiliais.add(botao1);

		telafiliais.add(botaoDell);

		telafiliais.add(botaoFiliais);

		telafiliais.add(botaoProd);

		telafiliais.add(imageLabel);

		telafiliais.add(jlabPrompt);

		telafiliais.add(botaopesquisa);

		telafiliais.add(botaoupdate);

		telafiliais.add(pesquisa);

		telafiliais.add(botaop);

		telafiliais.add(botaof);

		telafiliais.add(botaoc);

		telafiliais.add(tipo);

		telafiliais.add(marca);

		telafiliais.add(b);

		telafiliais.add(r);

		telafiliais.add(classificacao);

		telafiliais.add(lab);

		telafiliais.add(finalidade);

		telafiliais.add(j);

		telafiliais.add(t);

		telafiliais.add(u);

		telafiliais.add(jlabPrompt7);

		telafiliais.add(jlabPrompt6);

		telafiliais.add(jlabPrompt1);

		telafiliais.add(jlabPrompt2);

		telafiliais.add(jlabPrompt5);

		telafiliais.add(jlabPrompt4);

		telafiliais.add(jlabPrompt3);

		telafiliais.add(nomep);

		telafiliais.add(valor);

		telafiliais.add(qtd);

		telafiliais.add(peso);

		telafiliais.add(codigo);

		telafiliais.add(botaocorrect);

		telafiliais.add(cidade);

		telafiliais.add(jlabCidade);

		telafiliais.add(nome);

		telafiliais.add(endereco);

		telafiliais.add(cnpj);

		telafiliais.add(nomep);

		telafiliais.add(valor);

		telafiliais.add(qtd);

		telafiliais.add(peso);

		telafiliais.add(codigo);

		telafiliais.add(tipo);

		telafiliais.add(marca);

		telafiliais.add(selecao);

	}

	public void updatedata(ControleFarmacia atual, String filial) {
		listModel.clear();
		for (Filial f : atual.getFarmacia().getFiliais()) {
			if (filial.equals(f.getCidade())) {
				listModel.addElement(f.toString());
			}
		}

	}

	public void updatedata(ControleFarmacia atual) {
		listModel.clear();
		for (Filial f : atual.getFarmacia().getFiliais()) {
			listModel.addElement(f.toString());

		}

	}

	public void updatedatap(ControleFarmacia atualPd) {
		productsModel.clear();
		for (Filial f : atualPd.getFarmacia().getFiliais()) {
			for (Produto p : f.getProdutos()) {
				productsModel.addElement(p.toString() + f.getNome());

			}

		}

	}

}
