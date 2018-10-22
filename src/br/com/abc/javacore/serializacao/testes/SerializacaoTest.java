package br.com.abc.javacore.serializacao.testes;

import br.com.abc.javacore.serializacao.classes.Aluno;
import br.com.abc.javacore.serializacao.classes.Turma;

import java.io.*;

public class SerializacaoTest {
    public static void main(String[] args) {
        gravadorObjeto();
        leitorObjeto();
    }

    public static void gravadorObjeto(){

        Turma t = new Turma("MARATONA JAVA");

        Aluno aluno = new Aluno(1L, "josé Malcher", "123456");

        aluno.setTurma(t);

        try(ObjectOutputStream oss = new ObjectOutputStream(new FileOutputStream("aluno.ser"))){
            oss.writeObject(aluno);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void leitorObjeto(){
        try(ObjectInputStream osi = new ObjectInputStream(new FileInputStream("aluno.ser"))){
            Aluno aluno = (Aluno) osi.readObject();
            System.out.println(aluno);
        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
