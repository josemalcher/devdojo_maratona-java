package br.com.abc.javacore.exemploenum;

public class Cliente {
    private String nome;
    private TipoCliente tipo;
    private TipoPagamento tipoPagamento;

    enum TipoPagamento{
        AVISTA, APRAZO;
    }

    public Cliente(String nome, TipoCliente tipo, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipo = tipo;
        this.tipoPagamento = tipoPagamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoCliente getTipo() {
        return tipo;
    }

    public void setTipo(TipoCliente tipo) {
        this.tipo = tipo;
    }


    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipo=" + tipo +
                ", tipo Valor=" + tipo.getTipo() +
                ", tipo Nome=" + tipo.getNome() +
                ", tipoPagamento=" + tipoPagamento +
                '}';
    }
}
