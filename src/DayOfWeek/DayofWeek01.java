package DayOfWeek;

import java.time.*;
import java.time.format.TextStyle;
import java.time.temporal.TemporalUnit;
import java.util.Locale;

public class DayofWeek01 {

    public static void main(String[] args) {

        DayOfWeek of = DayOfWeek.MONDAY;
        System.out.println(of);

        //Apesar de ser um Enum, existem algumas operacoes interessantes.

        //Cada dia da semana é um numero
        System.out.println(of.getValue());//Saida: 1


        System.out.println(DayOfWeek.of(5).getDisplayName(TextStyle.FULL, Locale.of("pt")));



    }

}
