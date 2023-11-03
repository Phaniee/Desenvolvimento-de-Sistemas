package prjInterfaceEtec;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuEtec extends JFrame {
	
	public MenuEtec() {
		
		this.setTitle("ETEC de Guaianazes");
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setExtendedState(MAXIMIZED_BOTH);
		
		JMenu arquivo = new JMenu("Arquivo");
		JMenu cadastrar = new JMenu("Cadastrar");
		JMenu visu = new JMenu ("Visualizar");
		JMenu ajuda = new JMenu ("Ajuda");
		
		JMenuItem sair = new JMenuItem("Sair");
		JMenuItem categoria = new  JMenuItem ("Categoria");
		JMenuItem produto = new JMenuItem ("Produto");
		JMenuItem categoria1 = new  JMenuItem ("Categorias");
		JMenuItem produto1 = new JMenuItem ("Produtos");
		JMenuItem sobre = new JMenuItem ("Sobre");
		
		//parte para acrescentar itens nas listas
		arquivo.add(sair);
		cadastrar.add(categoria);
		cadastrar.add(produto);
		visu.add(categoria1);
		visu.add(produto1);
		ajuda.add(sobre);
		
		JMenuBar bar = new JMenuBar();
		setJMenuBar(bar);
		bar.add(arquivo);
		bar.add(cadastrar);
		bar.add(visu);
		bar.add(ajuda);
		
		sair.addActionListener(
				(ActionListener) new ActionListener() {
					public void actionPerformed(ActionEvent event) {
						System.exit(0);
					
					}
				}
				
			);
		categoria.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent event) {
						GerenciarCategoria gerenCategoria= new GerenciarCategoria();
						gerenCategoria.setVisible(true);
					}
				}
			);
		produto.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent event) {
						GerenciarProduto gerenProduto= new GerenciarProduto();
						gerenProduto.setVisible(true);
					}
				}
			);
		
		sobre.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent event) {
						Sobre sobre= new Sobre();
						sobre.setVisible(true);
					}
				}
			);

		this.setVisible(true);
	}
}