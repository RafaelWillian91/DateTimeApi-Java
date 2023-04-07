package ExercicioDatadeExpiracaoInformacao;

import java.io.EOFException;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Dataexpiracao {

    public static void main(String[] args) {

        long temp = Expiration.expiration(2);
        System.out.println("Numero do cartao irá expirar em " + temp + " segundos");

        ZoneId zone = ZoneId.of("America/Sao_Paulo");
        //Espera um valor em nanoSegundos. Como esta sendo passado zero esta com imprecisão.
       // LocalDateTime localDate = LocalDateTime.ofEpochSecond(temp, 0 ,  ZoneOffset.UTC);

        //Melhor abordagem é o LocalDateTime.ofInstant(Instant.ofEpochSecond(temp), zone)
        //Nesse exemplo, o valor retornado pelo método Expiration.expiration(int qtdhours) é convertido diretamente
        // para um Instant usando o método Instant.ofEpochSecond(long epochSecond), e em seguida é passado para o
        // método LocalDateTime.ofInstant(Instant instant, ZoneId zone) para criar um objeto LocalDateTime com a zona de tempo desejada.
        LocalDateTime localDate = LocalDateTime.ofInstant(Instant.ofEpochSecond(temp), zone);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy - HH:mm");

        String myLocaldateTime = localDate.format(dateTimeFormatter);

        System.out.println(myLocaldateTime);

    }



}


class Expiration{

    public static long expiration(int qtdhours){
        return Instant.now().plus(qtdhours, ChronoUnit.HOURS).getEpochSecond();
    }


}
