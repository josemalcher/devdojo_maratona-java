package br.com.abc.javacore.modificadorfinal;

public class Carro {
    private String nome;
    private String marca;
    public static final double VELOCIDADE_FINAL = 250;
    public final Comprador COMPRADOR = new Comprador();

    public Carro() {
    }

    public Comprador getComprador() {
        return COMPRADOR;
    }

    public Carro(String nome, String marca) {
        this.nome = nome;
        this.marca = marca;
    }

    public final void imprime(){
        System.out.println("imprimindo um carro");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "nome='" + nome + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
}
