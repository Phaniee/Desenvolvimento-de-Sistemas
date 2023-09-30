package prjCalculo;

import java.util.Scanner;

public class Aplicacao {
	public static void main(String [] args) {	
		Calculo conta = new Calculo ( );
		Scanner ler = new Scanner (System.in);

		System.out.println("Digite um numero que atenda a operação que deseja realizar:\n1-adição \n2-subtração \n3-multiplicação \n4-divisão \n0-nenhuma");
		int n = ler.nextInt();
		conta.exibicao(n);
		
		if (n==1) {
			conta.somar();
		}else if (n==2) {
			conta.subtrair();
		}else if (n==3) {
			conta.multiplicar();
		}else if (n==4) {
			conta.dividir();
		}else {
			System.out.println("");
		}
		
		
//		conta.tabuadaDoAtributoNumero1();
		
//		conta.maiorValor();
		
//		System.out.println(conta.verifIdade(17));
		
//		System.out.println(conta.verifMaiorIdade());
		
		ler.close();
	}
}
