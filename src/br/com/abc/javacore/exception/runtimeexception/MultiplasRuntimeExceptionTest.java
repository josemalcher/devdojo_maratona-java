package br.com.abc.javacore.exception.runtimeexception;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.sql.SQLClientInfoException;

public class MultiplasRuntimeExceptionTest {
    public static void main(String[] args) {
        /*try{
            throw new IndexOutOfBoundsException();
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("dentro do ArrayIndexOutOfBoundsException");
        }catch (IndexOutOfBoundsException  e){
            System.out.println("dentro do IndexOutOfBoundsException");
        }catch (IllegalArgumentException e){
            System.out.println(" dentro do IllegalArgumentException");
        }catch (ArithmeticException e){
            System.out.println(" dentro do ArithmeticException");
        }*/

        try{
            throw new IndexOutOfBoundsException();
        }catch (IllegalArgumentException | IndexOutOfBoundsException | ArithmeticException e){
            System.out.println("dentro do ArrayIndexOutOfBoundsException");
        }



        System.out.println("final do programa");

        /*
        try {
            talvezLanceException();
        } catch (SQLClientInfoException e) {
            e.printStackTrace();
        } catch (FileAlreadyExistsException e) {
            e.printStackTrace();
        }
        */

        try {
            talvezLanceException();
        //} catch (SQLClientInfoException | IOException e) {
        } catch (Exception e) {
            //e = new Exception(); // não é mais possível
            e.printStackTrace();
        }

    }

    private static void talvezLanceException() throws SQLClientInfoException, FileAlreadyExistsException {


    }
}
