package br.com.abc.javacore.classesabstrata;

public abstract class Pessoa {
    protected String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract void imprime();
}
