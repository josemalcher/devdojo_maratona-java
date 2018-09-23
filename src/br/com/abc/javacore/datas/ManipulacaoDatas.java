package br.com.abc.javacore.datas;

import java.util.Calendar;
import java.util.Date;

public class ManipulacaoDatas {

    public static void main(String[] args) {
        Date date = new Date();
        date.setTime(date.getTime() + 3_600_000L);
        System.out.println(date);

        Calendar c = Calendar.getInstance();
        c.setTime(date);
        System.out.println(c);

        if(Calendar.SUNDAY == c.getFirstDayOfWeek()){
            System.out.println("Domingo é o primeiro dia da semana");
        }

        System.out.println(Calendar.DAY_OF_MONTH);
        System.out.println(Calendar.DAY_OF_WEEK);
        System.out.println(Calendar.DAY_OF_YEAR);

        c.roll(Calendar.HOUR, 24); // so mexe no dado hora
        c.add(Calendar.HOUR, 24); // ajusta relogio geral

        Date date2 = c.getTime();
        System.out.println(date2);


    }
}
