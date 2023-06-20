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
import javax.swing.JPanel;

import controller.Controle_farmacia;
import modelo.Filial; 

  

public class Telafiliais { 
	
	private JList<String> list;
	private DefaultListModel<String> listModel = new DefaultListModel<>();
	private JPanel panel = new JPanel();
	private Controle_farmacia dados;

	public Telafiliais(Controle_farmacia dados) { 
		list = new JList<>(listModel);
		this.dados=dados;
		
		final JFrame telafiliais = new JFrame("FILIAIS"); 

		telafiliais.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

		telafiliais.setSize(1440, 900); 

		telafiliais.setVisible(true);	 

		ImageIcon logo = new ImageIcon("imagens/logof1.png"); 

        Image image = logo.getImage(); 

        ImageIcon back = new ImageIcon("imagens/back.png"); 

        Image image1 = back.getImage(); 
        
        final JPanel panel = new JPanel();
        panel.setBackground(new Color(211, 211, 211));
        panel.setBounds(800, 200, 300, 300); 
        panel.setLayout(null);
        

  

        // Cria um JLabel para exibir a imagem 

        JLabel imageLabel = new JLabel(new ImageIcon(image)); 

        imageLabel.setBounds(0, 0, image.getWidth(null), image.getHeight(null)); 

	     

	    JButton botao1 = new JButton("BACK"); 

	    botao1.setIcon(new ImageIcon(image1)); 

	    botao1.setBounds(1350, 0, 90, 80); 
	    
		final JButton botaoProdutos = new JButton("PRODUTOS");

		botaoProdutos.setFont(new Font("Arial Black", Font.PLAIN, 22));

		botaoProdutos.setForeground(Color.RED);

		botaoProdutos.setBounds(150, 150, 200, 50);
		
		botaoProdutos.addActionListener(new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				panel.add(list);
			}
			
		});

		JButton botaoMed = new JButton("MEDICAMENTOS");

		botaoMed.setFont(new Font("Arial Black", Font.PLAIN, 22));

		botaoMed.setForeground(Color.RED);

		botaoMed.setBounds(450, 150, 200, 50);
		
		JButton botaoCosm = new JButton("COSMETICOS");

		botaoCosm.setFont(new Font("Arial Black", Font.PLAIN, 22));

		botaoCosm.setForeground(Color.RED);

		botaoCosm.setBounds(750, 150, 200, 50);

	    JLabel jlabPrompt = new JLabel(" ");  

		jlabPrompt.setFont(new Font("Arial Black", Font.PLAIN, 22)); 

		jlabPrompt.setBounds(840, 290, 240, 30); 
		
		

		 

	    botao1.addActionListener(new ActionListener() { 

	        public void actionPerformed(ActionEvent e) { 
	        	telafiliais.dispose(); 
	        } 

	    });	    
	    
	    telafiliais.add(panel);
	    telafiliais.add(botao1); 
	    telafiliais.add(botaoProdutos); 
	    telafiliais.add(botaoMed);
	    telafiliais.add(botaoCosm);
	    telafiliais.add(imageLabel); 
	    telafiliais.add(jlabPrompt); 

	    

	} 
	
	public void updatedata() {
		listModel.clear();
		for (Filial f : dados.getFarmacia().getFiliais()) {
			listModel.addElement(f.toString());

		}

	}

} 