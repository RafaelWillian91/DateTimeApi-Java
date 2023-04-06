package duracaoIntervaloDuration;

import java.time.Duration;
import java.time.LocalTime;

public class Durationapp {

    public static void main(String[] args) {

        //Duration não leva em consideracao horario de Verão

        //Duracao de 3 horas com duration
        Duration d1 = Duration.ofHours(3);
        System.out.println(d1);

        //Saida PT1H
        Duration d2 = Duration.ofMinutes(60);
        System.out.println(d2);

        //para converter em segundos
        System.out.println(d2.toSeconds());

        //Um dos usos interessantes nessa classe é com LocalTime
        LocalTime l1  = LocalTime.of(12,00);
        LocalTime l2  = LocalTime.of(22,00);

        //esse metodo aceita qualquer Temporal
        Duration d4 = Duration.between(l1, l2);
        System.out.println(d4);

        //quero esse tempo em segundos
        System.out.println(d4.toMinutes());

        //Todas as vezes que for representar uma duracao de tempo, podemos usar o Duration. Na conversão usamos o
        //toAlgumacoisa


    }


}
