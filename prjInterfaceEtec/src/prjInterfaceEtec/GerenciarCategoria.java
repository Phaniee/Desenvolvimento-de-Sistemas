package prjInterfaceEtec;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GerenciarCategoria extends JDialog {
	
	private JLabel lbTitulo;
	private JLabel lbCategoria;
	private JTextField txCategoria;
	private JButton btExibir;
	
	public GerenciarCategoria(){
		setTitle("Gerenciar Categoria");
		setModal(true);
		//largura e altura
		setSize(800,600);
		setResizable(false);
		setLocationRelativeTo(null);
		setLayout(null);
		
		lbTitulo = new JLabel();
		lbTitulo.setText("Gerenciar Categorias");
		//setBounds x y largura altura
		lbTitulo.setBounds(325,10,200,30);		
		add(lbTitulo);
		
		lbCategoria = new JLabel();
		lbCategoria.setText("Categoria:");
		//setBounds x y largura altura
		lbCategoria.setBounds(200,100,200,30);		
		add(lbCategoria);
				
		txCategoria = new JTextField();			
		txCategoria.setBounds(270,100,230,30);
		add(txCategoria);
		
		btExibir = new JButton();
		btExibir.setText("Salvar");
		btExibir.setBounds(400, 150, 100, 30);
		add(btExibir);
		
	}

}
