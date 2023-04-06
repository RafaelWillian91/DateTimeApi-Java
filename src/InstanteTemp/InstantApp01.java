package InstanteTemp;

import java.time.*;

public class InstantApp01 {

    public static void main(String[] args) {

        //Ela pode ser usada para realizar operações aritméticas entre datas e horas, calcular a diferença entre
        //dois pontos no tempo, comparar instantes ou converter para outras representações de data e hora.
        //O que o Instante usa é um EPOCH. Foi convencionado que o EPOCH é 1 de janeiro 1970 00:00. No UTC.1970-01-01T00:00:00Z
        Instant instant = Instant.EPOCH;
        System.out.println(instant);
        System.out.println(instant.toEpochMilli());//Saida 0
        System.out.println(instant.getEpochSecond());//Saida é 0. Pq o marco é 0, estamos no ponto de partida.
        //É a partir dessa data que comeca a contar 1970-01-01T00:00:00Z.

        OffsetDateTime offsetDateTime = OffsetDateTime.of(2016, 03, 16, 0,0,0,0, ZoneOffset.of("+00:00"));
        System.out.println(offsetDateTime);

        //Ele retorna um Objeto do Tipo Instante carregado com as informacoes de data
        Instant instant2 = offsetDateTime.toInstant();

        System.out.println(instant2);
        System.out.println(instant2.toEpochMilli());
        System.out.println(instant2.getEpochSecond());

        //Como Base em um instante retornado pelo offsetDateTime.toInstant(); posso saber a data. Fazendo o processo inverso
        OffsetDateTime offsetDateTime1 =  OffsetDateTime.ofInstant(instant2, ZoneOffset.UTC);
        System.out.println(offsetDateTime1);


        OffsetDateTime offsetDateTimeNow = OffsetDateTime.now();
        Instant instant1 = offsetDateTimeNow.toInstant();





    }
}
