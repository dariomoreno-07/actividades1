import java.util.Scanner;   // 1. Import arriba del todo (sustituye al de Arrays)

public class BuscarElemento {
    public static void main(String[] args) {

        // 2. Creamos el Scanner para leer lo que escribe el usuario por teclado
        Scanner sc = new Scanner(System.in);

        // Declarar e inicializar un array de enteros
        int[] numeros = {1, 2, 3, 4};

        // 3. Pedimos el numero al usuario y lo guardamos en "buscado"
        //    (esta linea sustituye a "int buscado = 3;")
        System.out.println("Que numero quieres buscar?");
        int buscado = sc.nextInt();

        // -1 significa "no encontrado", ya que las posiciones empiezan en 0
        int posicion = -1;

        // Recorremos el array con un bucle for
        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] == buscado) {
                // Guardamos la posicion donde lo hemos encontrado
                posicion = i;
                // Salimos del bucle porque ya no hace falta seguir buscando
                break;
            }
        }

        if (posicion != -1) {
            System.out.println("Encontrado en la posicion " + posicion);
        } else {
            System.out.println("No esta en el array");
        }

        // 4. Cerramos el Scanner al terminar de usarlo
        sc.close();
    }
}
