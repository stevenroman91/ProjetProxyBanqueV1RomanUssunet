package presentation;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;


public class Lanceur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale loc = new Locale("fr");
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy",loc);
		Calendar date= Calendar.getInstance();
		
		String mois = df.format(date.getTime());
		
		for(int i=0; i<mois.length();i++){
		 int n = (int)mois.toCharArray()[i]-48;
		System.out.println(n);
		}
		
		 
	}

}
