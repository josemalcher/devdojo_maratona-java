package br.com.abc.javacore.associacao.exercicio;

public class Aluno {
    private String nome;
    private int idade;
    private Seminario seminario;

    public void print(){
        System.out.println("----  RELATORIO ALUNO ---- ");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        if(this.seminario != null){
            System.out.println("Seminário Inscrito: " + this.seminario.getTitulo());
        }else{
            System.out.println("Aluno não está em nenum seminário");
        }
    }

    public Aluno() {
    }

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Seminario getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }
}
