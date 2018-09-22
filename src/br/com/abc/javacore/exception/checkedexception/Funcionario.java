package br.com.abc.javacore.exception.checkedexception;

import java.io.FileNotFoundException;

public class Funcionario extends Pessoa{

    /*
    @Override
    public void salvar() throws LoginInvalidoException {

    }
    */
    /*
    @Override
    public void salvar() throws LoginInvalidoException, FileNotFoundException {

    }
    */
    // pode declarar "filhas" (IOException)
    public void salvar() throws FileNotFoundException {

    }
}
