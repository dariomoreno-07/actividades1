public class SumaMatrices {

    // Metodo que recibe dos matrices y DEVUELVE otra matriz (int[][]).
    // "static" para poder llamarlo desde main sin crear un objeto.
    static int[][] sumarMatrices(int[][] a, int[][] b) {

        // Numero de filas y de columnas (a.length = filas, a[0].length = columnas)
        int n = a.length;
        int m = a[0].length;

        // Matriz resultado con el mismo tamano que las originales
        int[][] resultado = new int[n][m];

        // Recorremos todas las posiciones: el bucle de fuera las filas,
        // el de dentro las columnas
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                // Sumamos los elementos que estan en la misma posicion
                resultado[i][j] = a[i][j] + b[i][j];
            }
        }

        // Devolvemos la matriz ya calculada
        return resultado;
    }

    // Metodo auxiliar para mostrar una matriz (no devuelve nada: void)
    static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();   // salto de linea al acabar cada fila
        }
    }

    public static void main(String[] args) {

        int[][] a = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int[][] b = {
            {7, 8, 9},
            {1, 2, 3}
        };

        // Llamamos al metodo y guardamos la matriz que devuelve
        int[][] suma = sumarMatrices(a, b);

        System.out.println("Matriz suma:");
        mostrarMatriz(suma);
    }
}
