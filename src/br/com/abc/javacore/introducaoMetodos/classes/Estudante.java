package br.com.abc.javacore.introducaoMetodos.classes;

public class Estudante {
    private String nome;
    private int idade;
    private double[] notas;
    private boolean situacao;

    public void print(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("Idade: " + this.getIdade());
        if(getNotas() != null){
            for (double nota: getNotas()) {
                System.out.println("Notas: " + nota);
            }
        }
    }

    public void calcMedia(){
        if(getNotas() == null){
            System.out.println("Esse aluno não possuí notas!!");
            return;
        }
        double media = 0;
        for (double nota : getNotas()){
            media = media + nota; // media += nota
        }

        media = media / getNotas().length;

        if(media > 6){
            situacao = true;
            System.out.println("A média é: "+media+"   !!! APROVADO !!!");
        }else{
            situacao = false;
            System.out.println("A média é: "+media+" ...RERPROVADO!");
        }
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public boolean isSituacao() {
        return situacao;
    }

//    public void setSituacao(boolean situacao) {
//        this.situacao = situacao;
//    }
}
