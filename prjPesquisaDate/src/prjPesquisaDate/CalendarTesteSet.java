package prjPesquisaDate;
import java.util.Calendar;
public class CalendarTesteSet {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();//� UMA CLASSE ABSTRATA, ELA N�O PODE SER INSTANCIADA, POR ISSO PUXA UM METODO ESPECIFICO
		
		c.set(Calendar.YEAR, 1999); //QUANDO VOC� QUER MOSTRAR UMA DATA/ANO/MES ESPECIFICO
		c.set(Calendar.MONTH, Calendar.JANUARY);
		c.set(Calendar.DAY_OF_MONTH, 29);

		System.out.println("Data/Hora atual: "+c.getTime()); 
		System.out.println("Ano: "+c.get(Calendar.YEAR));
		System.out.println("M�s: "+(c.get(Calendar.MONTH)+1));
		System.out.println("Dia do M�s: "+c.get(Calendar.DAY_OF_MONTH));
	}

}
