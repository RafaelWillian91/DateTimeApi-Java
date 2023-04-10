package PonteEntreasDuasApisdeTIME;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Calendar;
import java.util.Date;

public class ConvertendoDate {
    public static void main(String[] args) {

        Instant instant = LocalDateTime.of(2030, 10, 20, 16,00,00,00).toInstant(ZoneOffset.UTC);
        System.out.println(instant);

        //Conversão para um Date. Metodo static

       Date date = Date.from(instant);
       System.out.println(date);

       //De um Date para um Instante. Metodo direto do Objeto
       Instant instant1 = date.toInstant();
        System.out.println(instant1);

        //Calendar para Date
       Calendar calendar =  Calendar.getInstance();
        calendar.setTime(date);
        System.out.println(calendar.getTime());

        //Calendar para Instante
        Instant instant2 = calendar.toInstant();
        System.out.println(instant2);
    }
}
