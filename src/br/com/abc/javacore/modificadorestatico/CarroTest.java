package br.com.abc.javacore.modificadorestatico;

public class CarroTest {
    public static void main(String[] args) {
        Carro c1 = new Carro("BMW", 210);
        Carro c2 = new Carro("Audi", 220);
        Carro c3 = new Carro("Mercedes", 230);

        c1.imprime();
        c2.imprime();
        c3.imprime();

        System.out.println("##################################################");

        //c1.setVelocidadeLimite(300);
        Carro.velocidadeLimite = 200;

        c1.imprime();
        c2.imprime();
        c3.imprime();


    }
}
