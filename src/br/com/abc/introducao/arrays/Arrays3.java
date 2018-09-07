package br.com.abc.introducao.arrays;

public class Arrays3 {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        int[] numeros1 = {1,2,3,4,5}; // tam = 5, index = 0 até 4
        int[] numweoa3 = new int[]{1,2,3,4,5};

        for(int i = 0; i< numeros1.length; i++){
            System.out.println(numeros1[i]);
        }

        for (int num : numweoa3) {
            System.out.println(num);
        }

    }
}
