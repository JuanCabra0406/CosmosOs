package Clases;

import java.util.Calendar;
import java.util.GregorianCalendar;
    
public class Fecha_hora {
    
    Calendar fecha =new GregorianCalendar();
    
    String anho = Integer.toString(fecha.get(Calendar.YEAR));
    String mes = Integer.toString(fecha.get(Calendar.MONTH));
    String dia = Integer.toString(fecha.get(Calendar.DATE));

    public String Fecha= dia+"-"+mes+"-"+anho;
    
    String hora = Integer.toString(fecha.get(Calendar.HOUR_OF_DAY));
    String minutos = Integer.toString(fecha.get(Calendar.MINUTE));
    
    public String Hora= hora+":"+minutos;
}


