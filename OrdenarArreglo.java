import java.util.Arrays;
public class OrdenarArreglo {
    public static void main(String[] args) {
        
        //Declaramos el Array
        int[] numeros = {1, 8, 5, 7};

        //Hacemos que el array se imprima en orden ascendente con sort
        Arrays.sort(numeros);

        //Hacemos println para mostrar el array por pantalla
        System.out.println(Arrays.toString (numeros));
    }
}
