package br.com.abc.javacore.exemploenum;

public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa Física") , PESSOA_JURIDICA(2, "Pessoa Juridica"); //sempre na primeira linha

    private int tipo;
    private String nome;

    TipoCliente(int tipo, String nome) {
        this.tipo = tipo;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int getTipo() {
        return tipo;
    }

}
