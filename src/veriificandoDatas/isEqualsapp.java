package veriificandoDatas;

import java.time.*;

public class isEqualsapp {

    public static void main(String[] args) {

        OffsetDateTime offsetTime =
                OffsetDateTime.of(LocalDateTime.of(2000, 01,01,12,00, 00,00), ZoneOffset.of("-00:00"));
        System.out.println(offsetTime);

        OffsetDateTime offsetTime2 =
                //È o mesmo horário que offsetTime -1 UTC, porem o relógio foi atrasado um Uma hora.
                OffsetDateTime.of(LocalDateTime.of(2000, 01,01,11,00, 00,00), ZoneOffset.of("-01:00"));
        System.out.println(offsetTime2);

        //Para Comparar duas horas diferentes no relógio mas que talvez tenham a mesma hora devido a UTC
        //Para comparar o método converte para um EpochSecond os tempos e faz a comparacao de nanoSegundos para saber se é igual
        boolean tempEqual = offsetTime.isEqual(offsetTime2);
        System.out.println(tempEqual);



    }
}
