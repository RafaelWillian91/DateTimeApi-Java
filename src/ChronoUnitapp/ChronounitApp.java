package ChronoUnitapp;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Year;
import java.time.YearMonth;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;

public class ChronounitApp {

    public static void main(String[] args) {

        //ChronoUnit é um enum que varios elementos onde cada um é uma unidade de tempo (Mes, anos, dias...Forever)
        //Alguns métodos podem ajudar com operaçoes.
        //Todas as temporal tem o between que recebe dos Temporal. É claro que aquilo passado deve armazenar dias, senão dá erro

        LocalDate localDate =  LocalDate.of(2011,03,16);
        LocalDate localDate1 = LocalDate.now();
        //Diferenca entre datas com ChronoUnit
        System.out.println(ChronoUnit.DAYS.between(localDate, localDate1));
        System.out.println(ChronoUnit.MONTHS.between(localDate, localDate1));
        System.out.println(ChronoUnit.YEARS.between(localDate, localDate1));

        //Adicionando mais horas a um Temporal específico
        LocalTime t = ChronoUnit.HOURS.addTo(LocalTime.of(12, 0,0), 4);
        System.out.println(t);



    }
}
