package br.com.abc.javacore.classesinternas.test;

public class ClassesLocaisTest {

    private String nome = "jose";

    public void fazAlgumaCoisa(){
        String sobrenome = "Malcher"; // por padrão = final

        class Interna{ // abstract ou final
            public void imprimeNomeExterno(){
                System.out.println(nome);
                System.out.println(sobrenome);
            }
        }
        Interna in = new Interna();
        in.imprimeNomeExterno();
    }



    public static void main(String[] args) {

        ClassesLocaisTest externa = new ClassesLocaisTest();
        externa.fazAlgumaCoisa();
    }
}
