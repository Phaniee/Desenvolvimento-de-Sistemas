package prjInterfaceEtec;

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JLabel;

public class Sobre extends JDialog {
	
	private JLabel lbTitulo;
	private JLabel lbNome1;
	private JLabel lbEmail1;
	private JLabel lbNome;
	private JLabel lbEmail;
	private ImageIcon imagemNy;
	private JLabel lbFotoNy;
	private ImageIcon imagemSte;
	private JLabel lbFotoSte;
	public Sobre() {
		
		setTitle("Desenvolvedores");
		setModal(true);
		//largura e altura
		setSize(800,600);
		setResizable(false);
		setLocationRelativeTo(null);
		setLayout(null);
		
		lbTitulo = new JLabel();
		lbTitulo.setText("Desenvolvedoras");
		//setBounds x y largura altura
		lbTitulo.setBounds(350,10,200,30);		
		add(lbTitulo);
		
		imagemNy = new ImageIcon(getClass().getResource("nycolly.png"));
		
		lbFotoNy= new JLabel(imagemNy);
		lbFotoNy.setBounds(140, 50, 200, 200);
	    add(lbFotoNy);
	    
	    lbNome1 = new JLabel();
		lbNome1.setText("Nome: Nycolly Pereira D'Almeida Felix");
		//setBounds x y largura altura
		lbNome1.setBounds(135,200,250,150);		
		add(lbNome1);
		
		lbEmail1 = new JLabel();
		lbEmail1.setText("E-mail: nycolly.felix@etec.sp.gov.br");
		//setBounds x y largura altura
		lbEmail1.setBounds(135,220,250,150);		
		add(lbEmail1);
	    
	    imagemSte = new ImageIcon(getClass().getResource("stephanie.png"));
		
		lbFotoSte= new JLabel(imagemSte);
		lbFotoSte.setBounds(450, 50, 200, 200);
	    add(lbFotoSte);
		
	    lbNome = new JLabel();
		lbNome.setText("Nome: Stephanie Medeiros da Silva");
		//setBounds x y largura altura
		lbNome.setBounds(450,200,250,150);		
		add(lbNome);
		
		lbEmail = new JLabel();
		lbEmail.setText("E-mail: stephanie.silva185@etec.sp.gov.br");
		//setBounds x y largura altura
		lbEmail.setBounds(450,220,250,150);		
		add(lbEmail);
		
	}

}
