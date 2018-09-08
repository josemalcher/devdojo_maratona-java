package br.com.abc.javacore.introducaoMetodos.classes;

public class Professor {
    public String nome;
    public String matricula;
    public Integer rg;
    public String cpf;

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.matricula);
        System.out.println(this.cpf);
        System.out.println(this.rg);
    }

}
