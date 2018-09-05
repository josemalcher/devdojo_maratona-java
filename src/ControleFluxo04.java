public class ControleFluxo04 {
    public static void main(String[] args) {
        int contador = 9;

        while(contador < 10){
            System.out.println(++contador);
        }

        do{
            System.out.println("Dentro do DO while");
        }while (contador < 10);

        for(int i = 0; i < 10; i++){
            System.out.println("Vador do i =" + i);
        }
    }
}
