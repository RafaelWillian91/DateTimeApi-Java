package ConsiderandoFusoHorarioComOffsetDateTime;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class LocalDateTimeFusoHorario {

    public static void main(String[] args) {

        LocalDateTime ldt1 = LocalDateTime.of(2012, 12, 25, 16,45);
        System.out.println(ldt1);

        //Local.... quer dizer que não está atrelado a alguma data ou hora de algum lugar do Mundo
        //Para trabalhar com Fuso Horario, usamos a classe OffsetDateTime
        OffsetDateTime off = OffsetDateTime.of(ldt1, ZoneOffset.UTC);

        System.out.println(off);//Saida é com final Z que é o horario base o 0

        //O padra do UTC é 0 e no Brasil o deslocamento é -3, entao passamos dessa forma: with para alterar
        //o que precisamos e passamos -03:00 do Horario do Brasil na hora informada
        //Com esse método eu mantenho o horario e mudo apenas o fuso horário
        OffsetDateTime off2 = off.withOffsetSameInstant(ZoneOffset.of("-03:00"));
        System.out.println(off2);

        //Mostra a data e hora com o meu UTC padrão do sistema
        OffsetDateTime offsetDateTime = OffsetDateTime.now();
        System.out.println(offsetDateTime);

        //Passando uma data e hora e Fuso
        OffsetDateTime offsetDateTime101 =  OffsetDateTime.of(2021, 03,25, 12, 0,0,0, ZoneOffset.of("-03:00"));
        System.out.println(offsetDateTime101);



    }
}
