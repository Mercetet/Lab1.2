import java.util.Random;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
/*1.	Escribir un método para sumar dos matrices de enteros y devolver la matriz resultante.
        int [][]matrizA = new int[3][3];
        int [][]matrizB = new int[3][3];

        llenar_matriz_random(matrizA);
        System.out.println("Matriz A:");
        mostrar_matriz(matrizA);

        llenar_matriz_random(matrizB);
        System.out.println("Matriz B:");
        mostrar_matriz(matrizB);

        int[][]suma = suma_matrices(matrizA, matrizB);
        System.out.println("Suma:");
        mostrar_matriz(suma);*/

/*2.	Implementar un método para multiplicar dos matrices de enteros y devolver el resultado.
        int [][]matrizA = new int[3][3];
        int [][]matrizB = new int[3][3];

        llenar_matriz_random(matrizA);
        System.out.println("Matriz A:");
        mostrar_matriz(matrizA);

        llenar_matriz_random(matrizB);
        System.out.println("Matriz B:");
        mostrar_matriz(matrizB);

        int[][]multi = multi_matriz(matrizA, matrizB);
        System.out.println("Multiplicacion:");
        mostrar_matriz(multi);*/

/*3.	Crear una función que calcule la transpuesta de una matriz.

La matriz transpuesta es una matriz obtenida al intercambiar las filas por columnas de una matriz dada. Esto significa que los elementos que estaban en la fila i y columna j de la matriz original estarán en la fila j y columna i de la matriz transpuesta. La notación típica para denotar la matriz transpuesta de A es A^T.
        int [][]matrizA = new int[3][3];

        llenar_matriz_random(matrizA);
        System.out.println("Matriz A:");
        mostrar_matriz(matrizA);

        int[][]trans = transpuesta(matrizA);
        System.out.println("Transpuesta:");
        mostrar_matriz(trans);*/

        /*4.	Desarrollar un método para verificar si una matriz es simétrica (igual a su transpuesta).
        int [][]matrizA = new int[3][3];
        boolean bol = true;

        llenar_matriz_random(matrizA);
        System.out.println("Matriz A:");
        mostrar_matriz(matrizA);

        int[][]trans = transpuesta(matrizA);
        System.out.println("Transpuesta:");
        mostrar_matriz(trans);

        for (int i = 0; i < trans.length; i++) {
            for (int j = 0; j < trans.length; j++) {
                if (matrizA[i][j] != trans[i][j]) {
                    bol = false;
                    break;
                }
            }
            if(!bol){
                break;
            }
        }

        if (bol) {
            System.out.println("Es simetrica");
        }else {
            System.out.println("No es simetrica");
        }*/

        /*5.	Escribir un método que calcule el producto escalar de un vector (matriz unidimensional) por un número.
        int [][]matrizA = new int[3][3];

        llenar_matriz_random(matrizA);
        System.out.println("Matriz A:");
        mostrar_matriz(matrizA);

        int[][]escalar = escalar(matrizA);
        System.out.println("Matriz unidimancional:");
        mostrar_matriz(escalar);*/

        /*6.	Implementar una función que calcule la suma de todos los elementos de una matriz.
        int [][]matrizA = new int[3][3];

        llenar_matriz_random(matrizA);
        System.out.println("Matriz A:");
        mostrar_matriz(matrizA);

        System.out.println("La suma de los elementos es: " + suma(matrizA));*/

        /*7.	Desarrollar un método para encontrar el elemento máximo en una matriz y su posición.
        int [][]matrizA = new int[3][3];

        llenar_matriz_random(matrizA);
        System.out.println("Matriz A:");
        mostrar_matriz(matrizA);

        elemento_max(matrizA);*/

        /*8.	Crear una función que devuelva la suma de una fila específica de una matriz.
        int [][]matrizA = new int[3][3];

        llenar_matriz_random(matrizA);
        System.out.println("Matriz A:");
        mostrar_matriz(matrizA);

        System.out.println("Ingrese la fila que quiere q se sume: ");
        int fila = leer.nextInt();

        System.out.println("La suma de los elementos de esa fila es: " + suma_fila(matrizA, fila));*/

/*9.	Implementar una función que determine si una matriz es diagonal (todos los elementos fuera de la diagonal principal son cero).

Matriz Diagonal:

Una matriz diagonal es una matriz cuadrada en la que todos los elementos fuera de la diagonal principal son iguales a 0. Los elementos en la diagonal principal pueden ser cualquier número, no necesariamente 1.

Por ejemplo, una matriz diagonal 3x3 podría ser:

D =  | 2  0  0 |
     | 0  5  0 |
     | 0  0  9 |
        int [][]matrizA = new int[3][3];

        llenar_matriz_random(matrizA);
        System.out.println("Matriz A:");
        mostrar_matriz(matrizA);

        System.out.println(matriz_diagonal(matrizA));*/

/*10.	Crear una función que genere una matriz identidad de tamaño n.

Matriz Identidad (o Matriz Unitaria):

La matriz identidad, denotada generalmente como "I" o "I_n" (donde "n" representa el tamaño de la matriz cuadrada), es una matriz cuadrada especial en la que todos los elementos de la diagonal principal son iguales a 1 y todos los demás elementos son iguales a 0.

Por ejemplo, la matriz identidad 3x3 sería:


I_3 = | 1  0  0 |
         | 0  1  0 |
         | 0  0  1 |
        System.out.println("Ingrese el tamaño de su matriz cuadrada: ");
        int n = leer.nextInt();
        int [][]matrizA = new int[n][n];

        int[][]identidad = matriz_identidad(matrizA);
        mostrar_matriz(identidad);*/

        /*11.	Escribir un método para contar la cantidad de elementos pares e impares en una matriz.
        int [][]matrizA = new int[3][3];

        llenar_matriz_random(matrizA);
        System.out.println("Matriz A:");
        mostrar_matriz(matrizA);

        par_o_inpar(matrizA);*/

        /*12.	Implementar una función que rote una matriz 90 grados en sentido horario.
        int [][]matrizA = new int[3][3];

        llenar_matriz_random(matrizA);
        System.out.println("Matriz A:");
        mostrar_matriz(matrizA);

        int[][]giro = girar_90(matrizA);
        System.out.println("Rotada 90°:");
        mostrar_matriz(giro);*/

        /*13.	Desarrollar un método para encontrar el número de veces que aparece un valor específico en una matriz.
        int [][]matrizA = new int[3][3];

        llenar_matriz_random(matrizA);
        System.out.println("Matriz A:");
        mostrar_matriz(matrizA);

        System.out.println("Ingrese el numero que quiere encontrar. ");
        int num = leer.nextInt();
        cont_num(matrizA, num);*/

        /*14.	Crear una función que invierta el orden de las filas en una matriz.
        int [][]matrizA = new int[3][3];

        llenar_matriz_random(matrizA);
        System.out.println("Matriz A:");
        mostrar_matriz(matrizA);

        System.out.println("Filas invertidas: ");
        int[][] filas_in = filas_invertidas(matrizA);
        mostrar_matriz(filas_in);*/

        /*15.	Escribir un método para sumar todas las diagonales de una matriz cuadrada.
        int [][]matrizA = new int[3][3];

        llenar_matriz_random(matrizA);
        System.out.println("Matriz A:");
        mostrar_matriz(matrizA);

        System.out.println("Suma de las diagonales: " + suma_diagonales(matrizA));*/

        /*16.	Implementar una función que verifique si una matriz es ortogonal (su transpuesta es igual a su inversa).
        int [][]matrizA = new int[3][3];

        llenar_matriz_random(matrizA);
        System.out.println("Matriz A:");
        mostrar_matriz(matrizA);

        System.out.println("Matriz ortogonal: " + ortogonal(matrizA));*/

        /*17.	Desarrollar un método para encontrar el valor mínimo en cada fila de una matriz y devolverlos en un arreglo.
        int [][]matrizA = new int[3][3];

        llenar_matriz_random(matrizA);
        System.out.println("Matriz A:");
        mostrar_matriz(matrizA);

        int[] min = min_fila(matrizA);
        for (int i = 0; i < min.length; i++) {
            System.out.println("Fila " + (i + 1) + ": " + min[i]);
        }*/

        /*18.	Crear una función que calcule el producto de matrices de diferentes tamaños, si es posible; de lo contrario, devolver una matriz nula.
        int [][]matrizA = new int[3][2];

        llenar_matriz_random(matrizA);
        System.out.println("Matriz A:");
        mostrar_matriz(matrizA);

        int [][]matrizB = new int[2][3];

        llenar_matriz_random(matrizB);
        System.out.println("Matriz B:");
        mostrar_matriz(matrizB);

        int[][] tot = producto_matrices(matrizA, matrizB);

        if (tot == null) {
            System.out.println("No es posible multiplicar las matrices.");
        } else {
            System.out.println("Producto de matrices:");
            mostrar_matriz(tot);
        }*/

    }

    public static int[][] suma_matries(int[][] A, int[][] B) {
        int[][] suma = new int[3][3];
        for (int i = 0; i < suma.length; i++) {
            for (int j = 0; j < suma.length; j++) {
                suma[i][j] = A[i][j] + B[i][j];
            }
        }
        return suma;
    }

    public static void mostrar_matriz(int[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println(" ");
        }
    }

    public  static int[][] llenar_matriz_random(int[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = (int) (Math.random() * 9);
            }
        }
        return matriz;
    }

    public static int[][] multi_matriz(int[][] A, int[][] B) {
        int[][] multi = new int[3][3];
        for (int i = 0; i < multi.length; i++) {
            for (int j = 0; j < multi.length; j++) {
                multi[i][j] = A[i][j] * B[i][j];
            }
        }
        return multi;
    }
    public static int[][] transpuesta(int[][] matriz){
        int [][]trans = new int[3][3];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                trans[i][j] = matriz[j][i];
            }
        }
        return trans;
    }
    public static int[][] escalar(int[][] matriz){
        int [][]esc = new int[3][3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                esc[i][j] = matriz[i][j]*2;
            }
        }
        return esc;
    }
    public static int suma(int[][] matriz){
        int cont = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                cont += matriz[i][j];
            }
        }
        return cont;
    }
    public static void elemento_max(int[][] matriz){
        int max = 0;
        int fila = -1;
        int col = -1;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j] > max){
                    max = matriz[i][j];
                    fila = i;
                    col = j;
                }
            }
        }
        System.out.println("El elementos maximo es: " + max + " y se encuentra en la posicion: " + (fila+1) + "x" + (col+1));
    }
    public static int suma_fila(int[][] matriz, int fila){
        int cont = 0;
        for (int i = fila-1; i < fila; i++) {
            for (int j = 0; j < matriz[fila-1].length; j++) {
                cont += matriz[i][j];
            }
        }
        return cont;
    }

    public static boolean matriz_diagonal(int[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (i != j && matriz[i][j] != 0){
                    return false;
                }
            }
        }
        return true;
    }

    public static int[][] matriz_identidad(int[][]matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (i == j){
                    matriz[i][j] = 1;
                }else {
                    matriz[i][j] = 0;
                }
            }
        }
        return matriz;
    }

    public static void par_o_inpar(int[][] matriz){
        int par = 0;
        int inpar = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j] % 2 == 0){
                    par+=1;
                }else {
                    inpar+=1;
                }
            }
        }
        System.out.println("En la matriz hay " + par + " elementos pares, y " + inpar + " elementos inpares.");
    }

    public static int[][] girar_90(int[][]matriz){
        int fila = matriz.length;
        int col = matriz[0].length;
        int [][] girada = new int [col][fila];

        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < col; j++) {
                girada[j][fila - 1 - i] = matriz[i][j];
            }
        }

        return girada;
    }

    public static void cont_num(int[][]matriz, int num){
        int cont=0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j] == num){
                    cont +=1;
                }
            }
        }
        System.out.println("Se encontro " + cont + " veces el numero " + num);
    }

    public static int[][] filas_invertidas(int [][]matriz){
        int[][] inv = new int[matriz.length][matriz[0].length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                inv[i][j] = matriz[matriz.length -1 - i][j];
            }
        }
        return inv;
    }

    public static int suma_diagonales(int[][] matriz) {
        int d1 = 0;
        int d2 = 0;
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            int aux = matriz[i][i];
            d1 += aux;
        }

        int j = matriz.length;
        for (int i = 0; i < matriz.length; i++) {
            j -= 1;
            int aux = matriz[i][j];
            d2 += aux;
        }

        suma = d1+d2;

        return suma;
    }

    public static boolean ortogonal(int[][]matriz){
        int[][]trans = transpuesta(matriz);
        int[][] tot = new int [matriz.length][matriz.length];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < tot.length; j++) {
                tot[i][j]=matriz[i][j]*trans[i][j];
            }
        }

        int [][]ide = matriz_identidad(matriz);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (tot[i][j] != ide[i][j]){
                    return false;
                }
            }
        }
        return true;
    }

    public static int[] min_fila(int[][]matriz){
        int[] minimosPorFila = new int[matriz.length];

        for (int i = 0; i < matriz.length; i++) {
            int minimo = matriz[i][0];
            for (int j = 1; j < matriz[i].length; j++) {
                if (matriz[i][j] < minimo) {
                    minimo = matriz[i][j];
                }
            }
            minimosPorFila[i] = minimo;
        }

        return minimosPorFila;
    }
    public static int[][] producto_matrices(int[][] A, int[][] B) {
        int filasA = A.length;
        int colA = A[0].length;
        int filasB = B.length;
        int colB = B[0].length;

        if (colA != filasB) {
            return null;
        }

        int[][] tot = new int[filasA][colB];

        for (int i = 0; i < filasA; i++) {
            for (int j = 0; j < colB; j++) {
                int producto = 0;
                for (int k = 0; k < colA; k++) {
                    producto += A[i][k] * B[k][j];
                }
                tot[i][j] = producto;
            }
        }

        return tot;
    }

}