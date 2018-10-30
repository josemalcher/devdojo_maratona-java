package br.com.abc.javacore.colecoes.classes;

import java.util.Objects;

public class Produto implements Comparable<Produto> {

    private String serialNumero;
    private String nome;
    private Double preco;


    public Produto(String serialNumero, String nome, Double preco) {
        this.serialNumero = serialNumero;
        this.nome = nome;
        this.preco = preco;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return Objects.equals(serialNumero, produto.serialNumero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serialNumero);
    }

    @Override
    public String toString() {
        return "Produto{" +
                "serialNumero='" + serialNumero + '\'' +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }

    public String getSerialNumero() {
        return serialNumero;
    }

    public void setSerialNumero(String serialNumero) {
        this.serialNumero = serialNumero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }


    @Override
    public int compareTo(Produto o) {

        Double d = preco;

        //return this.serialNumero.compareTo(o.getSerialNumero());
        return d.compareTo(o.getPreco());
    }
}
