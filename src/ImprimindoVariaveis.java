public class ImprimindoVariaveis {
    public static void main(String[] args) {
        /* Comentário
        * de várias
        * linhas
        * */
        //Comentário
        /***
         * Comentário de Doc oficial
         * @param parametro de entrada
         * */

        int idade = 34;
        int idadeDosPais = 66;
        double salarioDouble = 2000;
        float salarioFloat = 2000;
        byte idadeByte = 12;
        short idadeShort = 2345;
        boolean verdade = true;
        boolean falso = false;
        long numeroGrande = 1000L;
        char caractere = '\u0041'; // 2 bytes // valor da tabela unicode
        String nome = "Jose";
        System.out.println("Dados impressos");
        System.out.println(idade);
        System.out.println(idadeDosPais);
        System.out.println("Dados impressos" + idade);
    }
}
