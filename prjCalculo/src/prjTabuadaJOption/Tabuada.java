package prjTabuadaJOption;
import javax.swing.JOptionPane;
public class Tabuada {
	public static void main(String[] args) {
		
		int num = Integer.parseInt(JOptionPane.showInputDialog("Insira um número para exibir tabuada: "));
		
		String tabuada="";
		
		 for( int i=1;i<=10;i++) {
			 
			 tabuada =  tabuada + String.format("%d x %d = %d\n",num,i,i*num);	
		 } 
		 JOptionPane.showMessageDialog(null, tabuada);
	}

}
