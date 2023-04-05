package LocalTime;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Localtimeapp01 {

    public static void main(String[] args) {

        //Para obter instancia de LocalTime é igual LocalDate
        LocalTime time = LocalTime.of(23, 10, 55);
        System.out.println(time);//Saida: 23:10:55

        //Hora atual
        LocalTime time2 = LocalTime.now();
        System.out.println(time2);

        //Assim como LocalDate, temos o método with que retorna aquilo que foi mudado e mantem o restante
        LocalTime time3 = time2.withNano(0).withSecond(0);
        System.out.println(time3);

        //Com parse eu informo o padrão do Tempo
        LocalTime time4 = LocalTime.parse("00:00:00");
        System.out.println(time4);

        //O parse tambem pode pegar um padrao espeficico de Hora e converter para o padrão específico de LocalTime
        LocalTime time5 = LocalTime.parse("12:30-22", DateTimeFormatter.ofPattern("HH:mm-ss"));
        System.out.println(time5);

        String time6 = time5.format(DateTimeFormatter.ofPattern("HH:mm"));
        System.out.println(time6);
    }

}
