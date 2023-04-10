package FormatarApiLegadaTimeDate;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class FormatapiLegadaSimpleDateFormat {
    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        calendar.set(2021, Calendar.APRIL, 12);//Se voce não definir hora ele joga a hora do sistema

        System.out.println(calendar.getTime());

        //Crio um objeto de SimpleDateFormat
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        //Calendar Formatado
        //Objeto SimpleDateFormat tem um método .format que formata um Date
        String calendarFormat = simpleDateFormat.format(calendar.getTime());//getTime retorna um Date
        System.out.println(calendarFormat);

        //objeto Date formatado direto
        Date aedv = new Date();
        System.out.println(aedv);

        System.out.println(simpleDateFormat.format(aedv));
    }
}
