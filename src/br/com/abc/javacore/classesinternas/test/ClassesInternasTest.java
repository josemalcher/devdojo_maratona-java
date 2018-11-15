package br.com.abc.javacore.classesinternas.test;

public class ClassesInternasTest {
    private String nome = "José";
    public class Interna{
        public void verClassExterna(){
            System.out.println(nome);
            System.out.println(this);
            System.out.println(ClassesInternasTest.this);
        }
    }

    public static void main(String[] args) {

        ClassesInternasTest externa = new ClassesInternasTest();

        ClassesInternasTest.Interna in = externa.new Interna();

        ClassesInternasTest.Interna in2 = new ClassesInternasTest(). new Interna();

        in.verClassExterna();
    }
}

/*class Externa{
    private String nome = "José";

    class Interna{
        public void verClasseExterna){
            System.out.println(nome);
        }
    }
}*/
