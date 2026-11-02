import java.util.Arrays;

public class InvertirArreglo {
    public static void main(String[] args) {

        System.out.println("==== INVERTIR UN ARREGLO ====");
        
        // Declarar e inicializar un array de enteros
        int[] numeros = {1, 2, 3, 4};


        System.out.println("\nRecorrido normal: ");
        for (int i = 0; i < numeros.length; i++) {
                System.out.println("numeros[ "+ i +"] = " + numeros [i]);
        }

        System.out.println("\nRecorrido inverso: ");
        for (int i = numeros.length - 1; i >= 0; i--) {
                System.out.println("numeros[ "+ i +"] = " + numeros [i]);
        }
        
        

    }
}