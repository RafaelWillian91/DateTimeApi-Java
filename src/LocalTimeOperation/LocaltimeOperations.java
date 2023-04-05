package LocalTimeOperation;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocaltimeOperations {

    public static void main(String[] args) {

        LocalTime l1 = LocalTime.of(15,50);
        System.out.println(l1);

        //Somar 12h
        LocalTime l2 = l1.plusHours(12);
        System.out.println(l2);

        //Subtrair 10 minutos
        LocalTime l3 = l1.minusMinutes(10);
        System.out.println(l3);

        //Formatar a saida de um LocalTime em um padrão especifico
        String l4 = l1.format(DateTimeFormatter.ofPattern("HH mm"));
        System.out.println(l4);





    }
}
