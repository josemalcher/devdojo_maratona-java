package br.com.abc.javacore.datas;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class SimpleDateFormatTeste {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        String mascara = "'Belém/PA,' dd 'de' MMMM 'de' yyyy";
        SimpleDateFormat formatador = new SimpleDateFormat(mascara);
        System.out.println(formatador.format(c.getTime()));
    }
}
