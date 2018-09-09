package br.com.abc.javacore.sobrecargacontrutores.classes;

public class Estudante {
    private String matricula;
    private String nome;
    private double[] notas;
    private String rg;

    public Estudante() {
    }

    public Estudante(String matricula, String nome, double[] notas) {
        this.matricula = matricula;
        this.nome = nome;
        this.notas = notas;
    }

    public Estudante(String matricula, String nome, double[] notas, String rg) {
        this(matricula, nome, notas);
        this.rg = rg;
    }

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.matricula);
        for (double nota : this.notas) {
            System.out.println(nota + " ");
        }
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
}
