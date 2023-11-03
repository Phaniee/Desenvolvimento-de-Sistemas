package prjInterfaceEtec;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GerenciarProduto extends JDialog {
	
	private JLabel lbTitulo;
	private JLabel lbProduto;
	private JTextField txProduto;
	private JLabel lbCategoria;
	private JTextField txCategoria;
	private JLabel lbValor;
	private JTextField txValor;
	private JLabel lbDescricao;
	private JTextField txDescricao;
	private JLabel lbQuantidade;
	private JTextField txQuantidade;
	private JButton btExibir;
	
	public GerenciarProduto() {
		
			setTitle("Gerenciar Produtos");
			setModal(true);
			//largura e altura
			setSize(800,600);
			setResizable(false);
			setLocationRelativeTo(null);
			setLayout(null);
			
			lbTitulo = new JLabel();
			lbTitulo.setText("Gerenciar Produtos");
			//setBounds x y largura altura
			lbTitulo.setBounds(325,10,200,30);		
			add(lbTitulo);
			
			lbProduto = new JLabel();
			lbProduto.setText("Produto:");
			//setBounds x y largura altura
			lbProduto.setBounds(200,50,200,30);		
			add(lbProduto);
					
			txProduto= new JTextField();			
			txProduto.setBounds(270,50,230,30);
			add(txProduto);
			
			lbCategoria = new JLabel();
			lbCategoria.setText("Categoria:");
			//setBounds x y largura altura
			lbCategoria.setBounds(200,100,200,30);		
			add(lbCategoria);
					
			txCategoria = new JTextField();			
			txCategoria.setBounds(270,100,230,30);
			add(txCategoria);
			
			lbValor= new JLabel();
			lbValor.setText("Valor:");
			//setBounds x y largura altura
			lbValor.setBounds(200,150,200,30);		
			add(lbValor);
					
			txValor = new JTextField();			
			txValor.setBounds(270,150,230,30);
			add(txValor);
			
			lbDescricao= new JLabel();
			lbDescricao.setText("Descrição:");
			//setBounds x y largura altura
			lbDescricao.setBounds(200,200,200,30);		
			add(lbDescricao);
					
			txDescricao = new JTextField();			
			txDescricao.setBounds(270,200,230,30);
			add(txDescricao);
			
			lbQuantidade= new JLabel();
			lbQuantidade.setText("Quantidade:");
			//setBounds x y largura altura
			lbQuantidade.setBounds(200,250,200,30);		
			add(lbQuantidade);
					
			txQuantidade = new JTextField();			
			txQuantidade.setBounds(270,250,230,30);
			add(txQuantidade);
			
			btExibir = new JButton();
			btExibir.setText("Salvar");
			btExibir.setBounds(400, 300, 100, 30);
			add(btExibir);
		
	}
}


