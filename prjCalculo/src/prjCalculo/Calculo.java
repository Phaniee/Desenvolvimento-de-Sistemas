package prjCalculo;
import java.util.Scanner;
public class Calculo {
	Scanner in = new  Scanner (System.in);
	 
	 public void somar ( ) { 
		 System.out.println("Digite o valor do numero 1:");
		double numero1=in.nextDouble();
		 System.out.println("Digite o valor do numero 2:");
		double numero2=in.nextDouble();
		 
		double resultadoSoma=numero1+numero2;
		System.out.println(+resultadoSoma);
	 }
	 public void subtrair ( ) {
		 System.out.println("Digite o valor do numero 1:");
		 double numero1=in.nextDouble();
		 System.out.println("Digite o valor do numero 2:");
		double numero2=in.nextDouble();
		 
		 double resultadoSubtrair = numero1-numero2;
		 System.out.println(+resultadoSubtrair);
	 }
	 public void multiplicar ( ) {
		 System.out.println("Digite o valor do numero 1:");
		double numero1=in.nextDouble();
		 System.out.println("Digite o valor do numero 2:");
		 double numero2=in.nextDouble();
		 
		 double resultadoMultiplicar = numero1*numero2;
		 System.out.println(+resultadoMultiplicar);
	 }
	 public void dividir ( ) {
		 System.out.println("Digite o valor do numero 1:");
		double numero1=in.nextDouble();
		 System.out.println("Digite o valor do numero 2:");
		double numero2=in.nextDouble();
		 
		 if ( numero2 ==0) {
			 System.out.println("N�o � possivel fazer divis�o por zero");
		 }else {
		 double resultadoDividir = numero1/numero2;
		 System.out.println(+resultadoDividir);
		 }
	 }
	
	 public void maiorValor( ) {
		 System.out.println("Digite o valor do numero 1:");
		double numero1=in.nextDouble();
		 System.out.println("Digite o valor do numero 2:");
		 double numero2=in.nextDouble();
		 
		 if (numero1>numero2) {
			 System.out.println("O maior valor � :"+numero1);
		 }else {
			 System.out.println("O maior valor �:"+numero2);
		 }
		 
	 }
	 public void tabuadaDoAtributoNumero1 ( ) {
		 System.out.println("Digite o valor do numero 1:");
		int numero1=in.nextInt();
		 
		 for( int i=1;i<=10;i++) {
					System.out.println(+i+"x"+numero1+"=" +i*numero1);
			}		
	 }
		 public String verifMaiorIdade ( ) {
			 int x = 17;
			 if (x >=18) {
				 return "maior de idade";
			 }else {
				 return "menor de idade";
			 }
		 }
		public  boolean verifIdade (int idade) {
			 
			 if (idade >= 18) {
				 return true;
			 }else {
				 return false;
			 }
		}
		public void exibicao (int n ) {
			switch ( n) {
			case 1 :
				System.out.println("adi��o");
				break;
			case 2:
			System.out.println("subtra��o");
			break;
			case 3:
				System.out.println("multiplica��o");
				break;
			case 4: 
				System.out.println("divis�o");
				break;
			case 0:
				System.out.println("");
				break;
			default:
					System.out.println("op��o inv�lida.");
			}
		}
}
