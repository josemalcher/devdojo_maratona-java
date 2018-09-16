package br.com.abc.javacore.modificadorestatico;

public class Carro {
    // velocidade limite dece ser de 240 km/h

    private String nome;
    private double velocidadeMaxima;

    private static double velocidadeLimite = 240;

    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    /* Métodos estáticos */
    public static double getVelocidadeLimite() {
        return velocidadeLimite;
    }
    /* Métodos estáticos */
    public static void setVelocidadeLimite(double velocidadeLimite) {
        Carro.velocidadeLimite = velocidadeLimite;
    }

    public void imprime(){
        System.out.println("--------------------------------------------");
        System.out.println("Nome " + this.nome);
        System.out.println("Velocidade Máxima " + this.velocidadeMaxima);
        //System.out.println("Velocidade Limite " + this.velocidadeLimite);
        System.out.println("Velocidade Limite " + velocidadeLimite);
    }
}
