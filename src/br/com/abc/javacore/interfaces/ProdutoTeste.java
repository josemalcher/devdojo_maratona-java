package br.com.abc.javacore.interfaces;

public class ProdutoTeste {
    public static void main(String[] args) {
        Produto p = new Produto("Notebook", 4, 2000);
        p.calcularImposto();
        p.calculaFrete();
        System.out.println(p);
    }
}
