package br.com.abc.javacore.introducaoMetodos.classes;

public class Estudante {
    public String nome;
    public int idade;
    public double[] notas;

    public void print(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        if(notas != null){
            for (double nota: notas) {
                System.out.println("Notas: " + nota);
            }
        }
    }

    public void calcMedia(){
        if(notas == null){
            System.out.println("Esse aluno não possuí notas!!");
            return;
        }
        double media = 0;
        for (double nota : notas){
            media = media + nota; // media += nota
        }

        media = media / notas.length;

        if(media > 6){
            System.out.println("A média é: "+media+"   !!! APROVADO !!!");
        }else{
            System.out.println("A média é: "+media+" ...RERPROVADO!");
        }
    }
}
