package PassandoUmZonedDateTime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeapp7 {

    public static void main(String[] args) {

        //ZonedDateTime permite eu passar uma zona especifica para configuracao da data e hora
        LocalDateTime localDateTime = LocalDateTime.of(2000, 01, 01, 13,0,0);
        ZonedDateTime ztd = ZonedDateTime.of(localDateTime, ZoneId.systemDefault());

        System.out.println(ztd);

        //mudar para zona da Europa
        ZonedDateTime ztd1 = ztd.withZoneSameInstant(ZoneId.of("Europe/Lisbon"));
        System.out.println(ztd1);

        //ZonedDateTime Leva em consideracao o horário de Verão para a conta

        //Todas as regioes
        System.out.println(ZoneId.getAvailableZoneIds());

        //Horario em Portugal de acordo com a hora do meu sistema
        ZonedDateTime znP = ZonedDateTime.of(LocalDateTime.now(), ZoneId.systemDefault());
        znP = znP.withZoneSameInstant(ZoneId.of("Europe/Lisbon"));
        System.out.println(znP);
    }
}
