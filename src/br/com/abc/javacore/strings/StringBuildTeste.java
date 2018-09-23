package br.com.abc.javacore.strings;

public class StringBuildTeste {
    public static void main(String[] args) {
        String s = "Uma Frase COmum";
        StringBuilder sb = new StringBuilder(16);
        // = StringBuffer
        sb.append("0123456789");
        System.out.println(sb);
        System.out.println(sb.reverse());
        System.out.println(sb.delete(0,2));
        System.out.println(sb.insert(2,"###"));

    }
}
