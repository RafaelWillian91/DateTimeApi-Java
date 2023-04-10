package APIdeDateTimeLegada;

import java.util.Date;

public class DateLegada {

    //A classe Date, na api legada, representa um instante no tempo
    public static void main(String[] args) {

        //Unico construtor aceito é o padrão ou que recebe um long (long que marca o tempo desde Epoch 1970/01/01)
        Date date = new Date();

        System.out.println(date);

        //Retorno de EPOCH
        System.out.println(date.getTime());

        //Date só traz informacao até milissegundos e um Instante traz em nanossegundos

        


    }


}
