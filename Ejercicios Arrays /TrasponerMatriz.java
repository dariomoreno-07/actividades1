import java.util.Scanner;
public class TrasponerMatriz {
    public static void main(String[] args) {

        // Creamos el scanner
        Scanner sc = new Scanner(System.in);

        // Pedimos las dimensiones
        System.out.println("Ingresa el numero de filas (n): ");
        int n = sc.nextInt();

        System.out.println("Ingresa el numero de columnas (m): ");
        int m = sc.nextInt();


        // Creamos la matriz
        int[][] matriz = new int [n][m];


        // Recorremos la matriz con dos bucles for, uno para filas y otro para columnas
        for (int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                System.out.print("Valor [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
            
        }

        // Creamos la matriz trasnpuesta (filas y columnas al reves)
        int [][] transpuesta = new int [m][n];


        // Copiamos cada elemento intercambiando fila y columna
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                transpuesta[j][i] = matriz[i][j];
            }
        }

        // Mostramos la matriz transpuesta
        System.out.println("Matriz transpuesta: ");
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                System.out.print(transpuesta[i][j] + " ");

            }
            System.out.println(""); // Salto de linea

        }

        sc.close();
        

        
    }
    
}
