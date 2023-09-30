package prjPesquisaDate;
import java.util.Calendar;
public class CalendarTesteSet {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();//É UMA CLASSE ABSTRATA, ELA NÃO PODE SER INSTANCIADA, POR ISSO PUXA UM METODO ESPECIFICO
		
		c.set(Calendar.YEAR, 1999); //QUANDO VOCÊ QUER MOSTRAR UMA DATA/ANO/MES ESPECIFICO
		c.set(Calendar.MONTH, Calendar.JANUARY);
		c.set(Calendar.DAY_OF_MONTH, 29);

		System.out.println("Data/Hora atual: "+c.getTime()); 
		System.out.println("Ano: "+c.get(Calendar.YEAR));
		System.out.println("Mês: "+(c.get(Calendar.MONTH)+1));
		System.out.println("Dia do Mês: "+c.get(Calendar.DAY_OF_MONTH));
	}

}
