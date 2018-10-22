package br.com.abc.javacore.exemploenum;

public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa Física") , PESSOA_JURIDICA(2, "Pessoa Juridica"){
        public String getId(){
            return  "B"; //PESSOA_JURIDICA
        }
    };

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

    // constant specific classes body (corpo de classe especifico constante)

    public String getId(){
        return  "A";
    }

}
