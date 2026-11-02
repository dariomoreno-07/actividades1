import java.util.Arrays;

public class EliminarDuplicados {
    public static void main(String[] args) {

        // Array con numeros repetidos (el 4 y el 2 aparecen dos veces)
        int[] numeros = {4, 2, 4, 7, 2, 9};

        // Array auxiliar del mismo tamano, por si no hubiera ningun duplicado
        int[] sinDuplicados = new int[numeros.length];

        // Cuantos elementos hemos guardado ya en el array auxiliar
        int cantidad = 0;

        // Recorremos el array original
        for (int i = 0; i < numeros.length; i++) {

            // Suponemos que el numero NO esta repetido
            boolean repetido = false;

            // Miramos si ya esta guardado en el array auxiliar.
            // Solo recorremos hasta "cantidad", que son las posiciones usadas.
            for (int j = 0; j < cantidad; j++) {
                if (numeros[i] == sinDuplicados[j]) {
                    repetido = true;
                    break;   // ya sabemos que esta repetido, no hace falta seguir
                }
            }

            // Si no estaba repetido, lo guardamos y sumamos uno al contador
            if (!repetido) {
                sinDuplicados[cantidad] = numeros[i];
                cantidad++;
            }
        }

        // El auxiliar tiene posiciones sobrantes a 0 al final.
        // copyOf crea un array nuevo con solo las "cantidad" primeras posiciones.
        int[] resultado = Arrays.copyOf(sinDuplicados, cantidad);

        System.out.println(Arrays.toString(resultado));
    }
}