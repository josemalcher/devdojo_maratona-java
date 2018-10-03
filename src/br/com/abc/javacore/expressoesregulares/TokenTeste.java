package br.com.abc.javacore.expressoesregulares;

public class TokenTeste {
    public static void main(String[] args) {
        String str = "José Malcher Joanna Camila Anna John Matheus junior";
        String[] tokens = str.split(" ");
        for(String arr: tokens){
            System.out.println(arr.trim());
        }
    }
}
