package periodosTempocomPeriod;

import java.time.LocalDate;
import java.time.Period;

public class Periosapp1 {

    public static void main(String[] args) {

        //Period representa um periodo de tempo em dias, meses e anos.
        Period p1 = Period.ofYears(1);
        System.out.println(p1);//saida: P1Y
        System.out.println(p1.toTotalMonths());

        //Tem que ser LocalDate pq Period é no minímo dias
        Period p2 = Period.between(LocalDate.of(1991,03,25), LocalDate.of(2023, 04,05));
        System.out.println(p2);
        System.out.println("Meses: " + p2.toTotalMonths());
    }
}
