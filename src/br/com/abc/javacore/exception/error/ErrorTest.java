package br.com.abc.javacore.exception.error;

public class ErrorTest {
    public static void main(String[] args) {
        stackOverFlowError();
    }
    public static void stackOverFlowError(){
        stackOverFlowError();
    }
}
