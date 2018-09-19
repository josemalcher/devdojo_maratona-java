package br.com.abc.javacore.heranca;

public class Pessoa {
    protected String nome;
    protected String cpf;
    protected Endereco endereco;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public Pessoa(String nome, String cpf) {
        this(nome);
        this.cpf = cpf;
    }

    static{
        System.out.println("BLoco de inicilização estático - PESSOA");
    }
    {
        System.out.println("BLoco de inicialização - 1 - pessoa");
    }
    {
        System.out.println("BLoco de inicialização - 2 - pessoa");
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void imprime(){
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Rua : " + this.endereco.getRua());
    }
}
