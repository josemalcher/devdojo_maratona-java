package br.com.abc.javacore.exception.runtimeexception;

public class RuntimeExceptionTest {
    public static void main(String[] args) {
        /*
        int a = 10;
        int b = 0;
        if(b != 0){
            int c = a/b;
            System.out.println(c);
        }
        */
        //Exception in thread "main" java.lang.ArithmeticException: / by zero

        //Object o  =  null;
        //System.out.println(o.toString());
        // Exception in thread "main" java.lang.NullPointerException

        try{
            int[] a = new int[2];
            System.out.println(a[2]);
        }catch (ArrayIndexOutOfBoundsException e ){
            e.printStackTrace();
        }
        System.out.println("Fora do bloco");

        // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 2
    }
}
