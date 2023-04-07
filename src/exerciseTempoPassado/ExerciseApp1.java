package exerciseTempoPassado;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class ExerciseApp1 {

    public static void main(String[] args) {

        LocalDate d1 = LocalDate.of(1991, 3, 25);

        elapsedTime(d1);



    }

    private static void elapsedTime(LocalDate localDate){
        LocalDate localDate1 = LocalDate.now();

        long years = ChronoUnit.YEARS.between(localDate, localDate1);
        long days = ChronoUnit.DAYS.between(localDate, localDate1);
        long month = ChronoUnit.MONTHS.between(localDate,localDate1);
        System.out.printf("Anos: %s \n", years);
        System.out.printf("Meses: %s \n", month);
        //System.out.println(p1.toTotalMonths());
        System.out.printf("Dias: %s \n", days);
        System.out.println("-----------------------------------------");

        Period p1 = Period.between(localDate, localDate1);
        //Period mostra o tempo total entre as datas passadas no between
        System.out.printf("Passou-se: %d anos, %d meses e %d dias", p1.getYears(), p1.getMonths(), p1.getDays());
    }

}
