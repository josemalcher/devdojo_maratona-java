package br.com.abc.javacore.exception.checkedexception;

public class LoginInvalidoExceptionTeste {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
        /*
        br.com.abc.javacore.exception.checkedexception.LoginInvalidoException: Usuario ou senha inválidos
        */
    }

    private static void logar()throws LoginInvalidoException{
        String usuarioBD = "jose";
        String usuarioSenha = "123";
        String usuarioDigitado = "jose";
        String usuarioSenhaDigitado = "1233";

        if(!usuarioBD.equals(usuarioDigitado) || !usuarioSenha.equals(usuarioSenhaDigitado)){
            throw new LoginInvalidoException();
        }else{
            System.out.println("Logado");
        }
    }
}
