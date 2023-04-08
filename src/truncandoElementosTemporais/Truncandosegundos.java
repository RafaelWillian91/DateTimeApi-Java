package truncandoElementosTemporais;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class Truncandosegundos {

    public static void main(String[] args) {

        var time = LocalTime.now(ZoneId.systemDefault());
        System.out.println(time);

        //Muitas vezes não interessa esse tanto de segundos que o método devolve.
        //Existe o método truncatedTo que recebe um unidade temporal. Que geralmente é um ChronoUnit e cortar o restante
        var localTime = time.truncatedTo(ChronoUnit.MINUTES);
        System.out.println(localTime);//Saida: HH:mm

        //Em alguns Cenários isso é importante. Ex: Guardar informacao em um Banco de dados que os milissegundo não importão.

    }
}
