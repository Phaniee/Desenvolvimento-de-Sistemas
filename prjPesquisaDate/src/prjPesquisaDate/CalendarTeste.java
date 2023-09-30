package prjPesquisaDate;
import java.util.Calendar;
public class CalendarTeste {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();

		System.out.println("Data/Hora atual: "+c.getTime());
		System.out.println("Ano: "+c.get(Calendar.YEAR));
		System.out.println("Mês: "+(c.get(Calendar.MONTH)+1));
		//Para mês é utilizado um array de 0 a 11 então é necessário usar +1 para ficar certo de acordo com os meses do ano
		System.out.println("Dia do Mês: "+c.get(Calendar.DAY_OF_MONTH));
	}
}


