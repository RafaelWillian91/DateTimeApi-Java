package YearMonth;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class YearMonthapp1 {

    public static void main(String[] args) {

        //Muito usado em sistemas de cartoes de Credito. Sempre é um par dados ano e mes.
        YearMonth yearMonth = YearMonth.of(2000, Month.APRIL);
        System.out.println(yearMonth);

        //Parecido com LocalDate e LocalTime.
        YearMonth yearMonth1 = yearMonth.withYear(2022);
        System.out.println(yearMonth1);//Saida é 2022-03

        String yearMonth2 = yearMonth1.format(DateTimeFormatter.ofPattern("MM/yyyy"));
        System.out.println(yearMonth2);

        //Retornar só o ano
        System.out.println(yearMonth.getYear());

        //Combina este ano-mês com um dia do mês para criar um arquivo LocalDate.
        LocalDate localDate3 = yearMonth.atDay(25);
        System.out.println(localDate3);

        if(yearMonth.isLeapYear()){
            System.out.println("É Bissexto");
        }

        //Ano e mes como uma String
       YearMonth yearMonth4 =  YearMonth.parse("2030-12");
        System.out.println(yearMonth4);

        YearMonth yearMonth5 = yearMonth.plus(Period.ofYears(15));
        System.out.println(yearMonth5);


    }

}
