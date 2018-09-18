package br.com.abc.javacore.associacao.exercicio;

public class Professor {
    private String nome;
    private String especialidades;
    private Seminario[] seminarios;

    public void print(){
        System.out.println("----  RELATORIO PROFESSOR ---- ");
        System.out.println("Nome Professor: "+ this.nome);
        System.out.println("Especialidade "+ this.especialidades);
        System.out.println("Seminários: ");
        if(seminarios != null && seminarios.length != 0){
            for(Seminario sem: seminarios){
                System.out.println(sem.getTitulo() + " ");
            }
            return;
        }
        System.out.println("Professor não vinculado a nenhum seminário");
    }

    public Professor() {
    }

    public Professor(String nome, String especialidades) {
        this.nome = nome;
        this.especialidades = especialidades;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(String especialidades) {
        this.especialidades = especialidades;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }
}
