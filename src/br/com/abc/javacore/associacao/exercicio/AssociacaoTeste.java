package br.com.abc.javacore.associacao.exercicio;

public class AssociacaoTeste {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Jose", 34);
        Aluno aluno2 = new Aluno("Maria", 30);

        Seminario sem = new Seminario("Como ser um programador melhor");

        Professor prof = new Professor("Yoda", "JAVA MASTER STAR WARS");

        Local local = new Local("Lua JAVA", "Via Lactea");

        aluno1.setSeminario(sem);
        aluno2.setSeminario(sem);

        sem.setProfessor(prof);
        sem.setLocal(local);
        sem.setAlunos(new Aluno[]{aluno1, aluno2});

        Seminario[] semArray = new Seminario[1];
        semArray[0] = sem;
        prof.setSeminarios(semArray);

        sem.print();
        prof.print();


    }
}
