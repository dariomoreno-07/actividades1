import java.util.Arrays;
public class IntercalarArreglos {
    public static void main(String[] args) {
        
        //Declarar arrays
        int[] a = {1, 2, 3, 4};
        int[] b = {5, 6, 7, 8};

    
        int[] resultado = new int[a.length + b.length];

        for (int i = 0; i < a.length; i++) {

            // LINEA NUEVA: a[i] va a las posiciones pares (0, 2, 4, 6)
            resultado[i * 2] = a[i];

            // LINEA NUEVA: b[i] va a las posiciones impares (1, 3, 5, 7)
            resultado[i * 2 + 1] = b[i];

        }

        System.out.println(Arrays.toString(resultado));

    }
}
