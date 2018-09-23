package br.com.abc.javacore.datas;

import java.text.DateFormat;
import java.util.Calendar;

public class DateFormatTeste {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        DateFormat[] dfa = new DateFormat[6];

        dfa[0] = DateFormat.getInstance();
        dfa[1] = DateFormat.getDateInstance();
        dfa[2] = DateFormat.getDateInstance(DateFormat.SHORT);
        dfa[3] = DateFormat.getDateInstance(DateFormat.MEDIUM);
        dfa[4] = DateFormat.getDateInstance(DateFormat.LONG);
        dfa[5] = DateFormat.getDateInstance(DateFormat.FULL);

        for(DateFormat df: dfa){
            System.out.println(df.format(c.getTime()));
        }
        /*
        22/09/18 23:29
        22/09/2018
        22/09/18
        22/09/2018
        22 de Setembro de 2018
        Sábado, 22 de Setembro de 2018
        */

    }
}
