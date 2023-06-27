package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.TextField;
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

import controller.Controle_farmacia;
import modelo.Filial;
import modelo.Produto;

public class Telafiliais {

	private JList<String> list;
	private DefaultListModel<String> listModel = new DefaultListModel<>();
	private JList<String> products;
	private DefaultListModel<String> productsModel = new DefaultListModel<>();
	private JPanel panel = new JPanel();
	private Controle_farmacia dados;
	private JTextField cidadeList;

	public Telafiliais(Controle_farmacia dados) {
		list = new JList<>(listModel);
		products = new JList<>(productsModel);
		this.dados = dados;

		final JFrame telafiliais = new JFrame("FILIAIS");

		telafiliais.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		telafiliais.setSize(1440, 900);

		telafiliais.setVisible(true);

		ImageIcon logo = new ImageIcon("imagens/logof1.png");

		Image image = logo.getImage();

		ImageIcon back = new ImageIcon("imagens/back.png");

		Image image1 = back.getImage();

		JPanel panel = new JPanel();
		panel.setBackground(new Color(211, 211, 211));
		panel.setBounds(150, 300, 1000, 300);
		panel.setLayout(null);
		panel.setVisible(false);
		list.setVisible(false);
		list.setBackground(null);
		list.setBounds(450, 250, 400, 500);
		list.setFont(new Font("Arial Black", Font.PLAIN, 10));

		products.setVisible(false);
		products.setBackground(new Color(211, 211, 211));
		products.setBounds(450, 250, 400, 500);
		products.setFont(new Font("Arial Black", Font.PLAIN, 10));

		// Cria um JLabel para exibir a imagem

		JLabel imageLabel = new JLabel(new ImageIcon(image));

		imageLabel.setBounds(0, 0, image.getWidth(null), image.getHeight(null));

		JButton botao1 = new JButton("BACK");

		botao1.setIcon(new ImageIcon(image1));

		botao1.setBounds(1350, 0, 90, 80);

		final JButton botaoFiliais = new JButton("FILIAIS");

		botaoFiliais.setFont(new Font("Arial Black", Font.PLAIN, 22));

		botaoFiliais.setForeground(Color.RED);

		botaoFiliais.setBounds(150, 150, 200, 50);

		cidadeList = new JTextField();
		cidadeList.setBounds(150, 320, 200, 30);
		cidadeList.setVisible(false);

		JLabel cidadeFind = new JLabel("CIDADE: ");

		cidadeFind.setFont(new Font("Arial Black", Font.PLAIN, 22));

		cidadeFind.setBounds(40, 320, 200, 30);

		cidadeFind.setVisible(false);
		JButton botaoList = new JButton("LISTAR: ");
		botaoList.setFont(new Font("Arial Black", Font.PLAIN, 22));
		botaoList.setForeground(Color.red);
		botaoList.setBounds(150, 360, 200, 30);
		botaoList.setVisible(false);

		botaoFiliais.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cidadeList.setVisible(true);
				cidadeFind.setVisible(true);
				botaoList.setVisible(true);
			}

		});

		botaoList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
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

		nomeFDell.setBounds(60, 520, 200, 30);

		nomeFDell.setVisible(false);

		JTextField nomeToDell = new JTextField();
		nomeToDell.setActionCommand("myTF");
		nomeToDell.setBounds(150, 520, 200, 30);
		nomeToDell.setVisible(false);

		JButton dell = new JButton("DELL");
		dell.setFont(new Font("Arial Black", Font.PLAIN, 22));
		dell.setForeground(Color.red);
		dell.setBounds(150, 560, 200, 30);
		dell.setVisible(false);

		JButton botaoDell = new JButton("DELETE");
		botaoDell.setBounds(770, 150, 200, 50);
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

		JButton botaoProd = new JButton("PRODUTOS");

		botaoProd.setFont(new Font("Arial Black", Font.PLAIN, 22));

		botaoProd.setForeground(Color.RED);

		botaoProd.setBounds(450, 150, 220, 50);
		
		JButton botaoLPd = new JButton("LISTAR");

		botaoLPd.setFont(new Font("Arial Black", Font.PLAIN, 22));

		botaoLPd.setForeground(Color.RED);

		botaoLPd.setBounds(850, 350, 220, 50);
		
		botaoLPd.setVisible(true);

		JTextField pToList = new JTextField();
		pToList.setBounds(850, 420, 200, 30);
		pToList.setVisible(true);

		botaoProd.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				// list.setVisible(false);
				 products.setVisible(true);
				
			}

		});
		
		botaoLPd.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent e) {
				 updatedatap(dados);
					dados.getFarmacia().listar(pToList.getText());
					dados.getFarmacia().listarCosmetico();
			}
	});

		JLabel jlabPrompt = new JLabel(" ");

		jlabPrompt.setFont(new Font("Arial Black", Font.PLAIN, 22));

		jlabPrompt.setBounds(840, 290, 240, 30);

		botao1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				telafiliais.dispose();
			}

		});

		telafiliais.add(panel);
		telafiliais.add(list);
		telafiliais.add(pToList);
		telafiliais.add(products);
		telafiliais.add(cidadeFind);
		telafiliais.add(cidadeList);
		telafiliais.add(botaoLPd);
		telafiliais.add(botaoList);
		telafiliais.add(nomeFDell);
		telafiliais.add(nomeToDell);
		telafiliais.add(dell);
		telafiliais.add(botao1);
		telafiliais.add(botaoDell);
		telafiliais.add(botaoFiliais);
		telafiliais.add(botaoProd);
		telafiliais.add(imageLabel);
		telafiliais.add(jlabPrompt);

	}

	public void updatedata(Controle_farmacia atual, String filial) {
		listModel.clear();
		for (Filial f : atual.getFarmacia().getFiliais()) {
			if (filial.equals(f.getCidade())) {
				listModel.addElement(f.toString());
			}
		}

	}

	public void updatedata(Controle_farmacia atual) {
		listModel.clear();
		for (Filial f : atual.getFarmacia().getFiliais()) {
			listModel.addElement(f.toString());

		}

	}

	public void updatedatap(Controle_farmacia atualPd) {
		productsModel.clear();
		for (Filial f : atualPd.getFarmacia().getFiliais()) {
			for (Produto p : f.getProdutos()) {
				productsModel.addElement(p.toString() + f.getNome());

			}

		}

	}

}
