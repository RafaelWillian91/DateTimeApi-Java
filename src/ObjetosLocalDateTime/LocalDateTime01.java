package ObjetosLocalDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTime01 {

    public static void main(String[] args) {

        LocalDate date = LocalDate.of(2000, 12, 12);
        LocalTime time = LocalTime.of(13, 44, 39);

        //Contrutor do LocalDateTime que recebe um LocalDate e um LocalTime
        LocalDateTime ltd1 = LocalDateTime.of(date, time);
        System.out.println(ltd1);

        //Uma outra forma de construcao do LocalDateTime
        LocalDateTime ltd2 = LocalDateTime.of(1991,03,25, 15,25);
        System.out.println(ltd2);

        //Se ja temos uma data e queremos emendar uma hora podemos usar o método atTime
        LocalDateTime ltd3 = date.atTime(time);
        System.out.println(ltd3);
        //Ou a partir de um time retornar um Date
        LocalDateTime ltd4 = time.atDate(date);
        System.out.println(ltd4);

        String dateTimeformat =  ltd1.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
        System.out.println(dateTimeformat);

        //Posso tambem mudar porcoes e igual Localdate e LocalTime com o metodo with
        LocalDateTime ltdwth= ltd1.withYear(10);
        System.out.println(ltdwth);

        //Aqui uma chamada encadeada
        String s1 = ltd1.withYear(2011).format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
        System.out.println(s1);

    }
}
