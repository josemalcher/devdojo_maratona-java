package br.com.abc.javacore.associacao.exercicio;

public class Local {
    private String rua;
    private String bairro;

    public void print(){
        System.out.println("----  RELATORIO LOCAL ---- ");
        System.out.println("Rua/Local: "+ this.rua);
        System.out.println("Rua/Local: "+ this.bairro);
    }

    public Local() {
    }

    public Local(String rua, String bairro) {
        this.rua = rua;
        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
}
