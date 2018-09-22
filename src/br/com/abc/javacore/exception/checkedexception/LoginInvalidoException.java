package br.com.abc.javacore.exception.checkedexception;

public class LoginInvalidoException extends Exception {
    public LoginInvalidoException() {
        super("Usuario ou senha inválidos");
    }
}
