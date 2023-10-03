import javax.imageio.stream.FileCacheImageInputStream;
import javax.swing.*;
import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        /*1.	Calcular la media de una serie de números que se leen por teclado.

Programa Java que lea por teclado 10 números enteros y los guarde en un array. A continuación calcula y muestra por separado la media de los valores positivos y la de los valores negativos.*/

        int num_positivo = 0;
        int num_negativo = 0;
        int cont_positivo = 0;
        int cont_negativo = 0;
        int[] nums = new int[10];
        for (int i = 0; i < nums.length; i++) {
            System.out.print("Ingrese el numero " + (i + 1) + ": ");
            nums[i] = leer.nextInt();
            if (nums[i] >= 0) {
                num_positivo = num_positivo + nums[i];
                cont_positivo++;
            } else {
                num_negativo = num_negativo + nums[i];
                cont_negativo++;
            }
        }
        int prom_positivo = num_positivo / cont_positivo;
        int prom_negativo = num_negativo / cont_negativo;

        System.out.println("El promedio de los numeros positivos ingresados es: " + prom_positivo);
        System.out.println("El promedio de los numeros negativos ingresados es: " + prom_negativo);


/*2.	Programa Java que lea 10 números enteros por teclado y los guarde en un array. Calcula y muestra la media de los números que estén en las posiciones pares del array.

Considera la primera posición del array (posición 0) como par.*/

        int p_pares = 0;
        int cont_pares = 0;
        int[] Pares = new int[10];
        for (int i = 0; i < Pares.length; i++) {
            System.out.println("Ingrese el numero " + (i + 1) + ": ");
            Pares[i] = leer.nextInt();
            if (i == 0 || i % 2 == 0) {
                p_pares = p_pares + Pares[i];
                cont_pares++;
            }
        }
        int prom_pares = p_pares / cont_pares;
        System.out.println("El promedio de los numeros en posiciones pares es de: " + prom_pares);


/*3. Programa que lee por teclado la nota de los alumnos de una clase y calcula la nota media del grupo. También muestra los alumnos con notas superiores a la media. El número de alumnos se lee por teclado.
Este programa utiliza un array de elementos de tipo double que contendrá las notas de los alumnos.
El tamaño del array será el número de alumnos de la clase, por lo tanto primero se pedirá por teclado el número de alumnos y a continuación se creará el array.
Se realizan 3 recorridos sobre el array, el primero para asignar a cada elemento las notas introducidas por teclado, el segundo para sumarlas y calcular la media y el tercero para mostrar los alumnos con notas superiores a la media.*/

        System.out.print("Ingrese la cantidad de alumnos: ");
        int alumnos = leer.nextInt();
        double prom = 0;
        int cont = 0;

        double[] notas = new double[alumnos];

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Ingrese la nota del alumno " + (i + 1) + ": ");
            notas[i] = leer.nextDouble();
            prom = prom + notas[i];
            cont++;
        }

        double prom_notas = prom / cont;

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= prom_notas) {
                System.out.println("El alumno " + (i + 1) + " esta por encima del promedio de " + prom_notas + " con una nota de " + notas[i]);
            }
        }


        /*4.	Programa que crea un array de 20 elementos llamado Pares y guarde los 20 primeros números pares. Mostrar por pantalla el contenido del array creado.*/


        int[] Par = new int[20];
        int contador = 0;

        for (int i = 0; i < Par.length; i++) {
            if (contador % 2 == 0) {
                Pares[i] = contador;
                contador++;
            } else {
                contador++;
                i--;
            }
        }

        System.out.println("Los primeros 20 numeros pares son: ");
        for (int j : Par) {
            System.out.print(j + " ");
        }


        /*5.	Programa Java que guarda en un array 10 números enteros que se leen por teclado. A continuación se recorre el array y calcula cuántos números son positivos, cuántos negativos y cuántos ceros.*/

        int posi= 0;
        int neg = 0;
        int cero = 0;

        int[] entero = new int[10];
        for (int i = 0; i < entero.length; i++) {
            System.out.print("Ingrese el numero " + i + ": ");
            entero[i] = leer.nextInt();
            if (entero[i] > 0) {
                posi++;
            } else if (entero[i] < 0) {
                neg++;
            } else {
                cero++;
            }
        }
        System.out.println("Numeros positivos: " + posi);
        System.out.println("Numeros negativos: " + neg);
        System.out.println("Cantidad de 0: " + cero);



/*6.	Programa Java que llene un array con 10 números enteros que se leen por teclado. A continuación calcula y muestra la media de los valores positivos y la de los valores negativos del array.*/


        int positivo = 0;
        int negativos = 0;
        int cont_posi = 0;
        int cont_neg = 0;
        int[] num = new int[10];
        for (int i = 0; i < num.length; i++) {
            System.out.print("Ingrese el numero " + (i + 1) + ": ");
            num[i] = leer.nextInt();
            if (num[i] >= 0) {
                positivo = positivo + num[i];
                cont_posi++;
            } else {
                negativos = negativos + num[i];
                cont_neg++;
            }
        }
        int total_p = positivo / cont_posi;
        int total_n = negativos / cont_neg;

        System.out.println("El promedio de los numeros positivos ingresados es de: " + total_p);
        System.out.println("El promedio de los numeros negativos ingresados es de: " + total_n);


        /*7. Programa Java para leer la altura de N personas y calcular la altura media. Calcular cuántas personas tienen una altura superior a la media y cuántas tienen una altura inferior a la media. El valor de N se pide por teclado y debe ser entero positivo.}*/


        System.out.println("Ingrese la cantidad de personas: ");
        int N = leer.nextInt();
        double[] personas = new double[N];
        double altura = 0;
        int cont_personas = 0;
        int altas = 0;
        int bajas = 0;

        for (int i = 0; i < personas.length; i++) {
            System.out.print("Altura de la persona " + (i + 1) + ": ");
            personas[i] = leer.nextDouble();
            altura = altura + personas[i];
            cont_personas++;
        }

        double prom_altura = altura / cont_personas;

        for (int i = 0; i < personas.length; i++) {
            if (personas[i] >= prom_altura) {
                altas++;
            } else {
                bajas++;
            }
        }

        System.out.println("La altura media es de: " + prom_altura + " metros");
        System.out.println("Hay un total de " + altas + " personas que son mas altas que la media");
        System.out.println("Hay un total de " + bajas + " personas que son mas bajas que la media");

/*8.	Programa Java que lea el nombre y el sueldo de 20 empleados y muestre el nombre y el sueldo del empleado que más gana.

Para hacerlo utilizaremos dos arrays:
Un array de String para los nombres de los empleados
Un array de tipo double para los sueldos de cada empleado.

Al mismo tiempo que leemos los datos de los empleados iremos comprobando cuál es el que tiene el mayor sueldo. Para ello tomamos el sueldo del primer empleado que se lee como mayor sueldo y después vamos comprobando el resto de sueldos. Cuando encontramos alguno mayor que el mayor actual este sueldo se convierte en el nuevo mayor.

En general para calcular el mayor de una serie de números tomamos el primero como mayor y después comparamos el resto de números.*/


        String[] empleados = new String[20];
        double[] sueldos = new double[20];
        double max = 0;
        String empleado_max = "";

        for (int i = 0; i < empleados.length; i++) {
            System.out.print("Ingrese el nombre del empleado " + (i + 1) + ": ");
            empleados[i] = leer.nextLine();
            String incial_mayuscula = empleados[i].toUpperCase().charAt(0) + empleados[i].substring(1, empleados[i].length()).toLowerCase();
            empleados[i] = incial_mayuscula;
        }

        for (int i = 0; i < sueldos.length; i++) {
            System.out.print("Ingrese el sueldo de " + empleados[i] + ": ");
            sueldos[i] = leer.nextDouble();
            if (sueldos[i] > max) {
                max = sueldos[i];
                empleado_max = empleados[i];
            }
        }

        System.out.println("El empleado con el mayor sueldo es " + empleado_max + " con un sueldo de $" + max);



/*9.	En esta entrada vamos a escribir un método Java que llene un array de enteros con números aleatorios.

Los números aleatorios deberán estar comprendidos entre dos límites (desde,  hasta) ambos incluidos.

El método recibe como parámetros los valores desde, hasta y el tamaño del array.

El método devuelve mediante return el array de enteros creado.

Para obtener números enteros aleatorios usaremos el método nextInt() de la clase Random.

Para que los números aleatorios obtenidos estén dentro de los limites utilizaremos el método nextInt() de la siguiente forma:

nextInt(hasta - desde + 1) + desde

Ayuda*/

        System.out.print("Ingrese el tamaño del arreglo: ");
        int array = leer.nextInt();
        System.out.print("Ingrese un numero incial: ");
        int num1 = leer.nextInt();
        System.out.print("Ingrese el numero final: ");
        int num2 = leer.nextInt();
        int[] array_metodo = aleatorio(array, num1, num2);

        for (int i = 0; i < array_metodo.length; i++) {
            System.out.print(array_metodo[i] + ",");
        }

/*10.	 Programa Java para sumar dos matrices de número enteros.
A) A partir de dos matrices A y B el programa obtendrá una matriz C que contendrá la suma de las dos matrices.
Las matrices A y B que vamos a sumar se crean dentro del programa. El número de filas y columnas de A y B se introduce por teclado, así como los valores que contienen.
La suma de dos matrices se realiza de la siguiente forma:
La matriz suma de dos matrices A y B se obtiene sumando los elementos de A y B que se encuentran en la misma posición. Por ejemplo, si las matrices A y B son estas:*/


        int filas, columnas;
        do {
            System.out.print("Introduce número de filas: ");
            filas = leer.nextInt();
            if (filas < 2) {
                System.out.println("Valor no válido");
            }
        } while (filas < 2);

        do {
            System.out.print("Introduce número de columnas: ");
            columnas = leer.nextInt();
            if (columnas < 2) {
                System.out.println("Valor no válido");
            }
        } while (columnas < 2);


        int[][] matriz_A = new int[filas][columnas];
        int[][] matriz_B = new int[filas][columnas];
        int[][] matriz_C = new int[filas][columnas];

        System.out.println("Datos de la matriz A: ");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Ingrese el valor de la fila " + i + ", columna " + j + ": ");
                matriz_A[i][j] = leer.nextInt();
            }
        }

        System.out.println("Datos de la matriz B:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Ingrese el valor de la fila " + i + ", columna " + j + ": ");
                matriz_B[i][j] = leer.nextInt();
            }
        }

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz_C[i][j] = matriz_A[i][j] + matriz_B[i][j];
            }
        }

        System.out.println("Matriz C: ");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz_C[i][j] + " ");
            }
            System.out.println();
        }


        /*B) SUMA DE MATRICES EN JAVA UTILIZANDO MÉTODOS

En esta segunda versión del programa para sumar matrices realizaremos el programa utilizando los siguientes métodos:
-	Un método para leer un número entero. Este método lee un número entero por teclado y lo devuelve.
-	Un método para crear una matriz. El método recibe el número de filas y columnas y crea y devuelve una matriz de ese tamaño.
-	Un método para llenar una matriz con números enteros. El método recibe la matriz y asigna a cada elemento un valor entero que se introduce por teclado.
-	Un método para mostrar una matriz por pantalla. El método recibe la matriz a mostrar.
-	Un método que realiza la suma de dos matrices. El método recibe las dos matrices a sumar y devuelve una matriz con el resultado de la suma de ambas matrices.
Ayuda*/

        int filas_met = ingrese_nums();
        int columnas_met = ingrese_nums();
        int [][] Matriz_A = crear(filas_met,columnas_met);
        int [][] Matriz_B = crear(filas_met,columnas_met);

        System.out.println("Matriz A: ");
        llenar(Matriz_A);
        System.out.println("Matriz B: ");
        llenar(Matriz_B);
        System.out.println();

        System.out.println("Matriz A: ");
        mostrar(Matriz_A);
        System.out.println("Matriz B: ");
        mostrar(Matriz_B);
        System.out.println("Suma de ambas matrices: ");
        int [][] Matriz_C = sumar(Matriz_A,Matriz_B);
        mostrar(Matriz_C);

/*11.	 Programa Java para obtener la matriz transpuesta de una matriz.
Dada una matriz A su transpuesta AT se obtiene intercambiando las filas por columnas y las columnas por filas.
Por ejemplo, si tenemos la matriz A de 2 filas y 4 columnas:

La primera fila de A se convierte en la primera columna de la matriz transpuesta y la segunda fila de A se convierte en la segunda columna de la matriz transpuesta.
Si la dimensión de la matriz A es 2 x 3 (2 filas y 3 columnas) la dimensión de su matriz transpuesta será 3 x 2 (3 filas y 2 columnas).
En general si la matriz A se ha creado de tamaño A[filas][columnas] su matriz transpuesta se debe crear de tamaño AT[columnas]filas].
*/

        System.out.print("Ingrese la cantidad de filas de la matriz: ");
        int filas_normales = leer.nextInt();
        System.out.print("Ingrese la cantidad de columnas de la matriz: ");
        int columnas_normales = leer.nextInt();

        int [][] matriz_normal = new int[filas_normales][columnas_normales];

        System.out.println("Ingrese los datos de la matriz: ");
        for (int i = 0; i < filas_normales; i++){
            for (int j = 0; j < columnas_normales; j++){
                System.out.print("Fila "+i+" Columna "+j);
                matriz_normal[i][j] = leer.nextInt();
            }
        }

        System.out.println("Matriz ingresada: ");
        for (int i = 0; i < matriz_normal.length; i++){
            for (int j = 0; j < matriz_normal.length; j++){
                System.out.print(matriz_normal[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Matriz Traspuesta:");
        for (int i = 0; i < matriz_normal.length; i++){
            for (int j = 0; j < matriz_normal.length; j++){
                System.out.print(matriz_normal[j][i]+" ");
            }
            System.out.println();
        }
    }

    public static int ingrese_nums (){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int numero = sc.nextInt();
        return numero;
    }

    public static int[][] crear(int filas, int columnas){
        int [][] matriz = new int [filas][columnas];
        return matriz;
    }

    public static int [][] llenar(int [][] matriz){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz.length; j++){
                System.out.print("Fila "+i+" Columna "+j+": ");
                matriz[i][j] = sc.nextInt();
            }
        }
        return matriz;
    }

    public static int [][] mostrar(int [][] matriz){
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz.length; j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
        return matriz;
    }

    public static int [][] sumar(int [][] matriz_1, int [][] matriz_2){
        int [][] matriz_3 = crear(matriz_1.length, matriz_1[0].length);
        for (int i = 0; i < matriz_1.length; i++){
            for (int j = 0; j < matriz_1[i].length; j++){
                matriz_3[i][j] = matriz_1[i][j] + matriz_2[i][j];
            }
        }
        return matriz_3;
    }

    public static int[] aleatorio(int tamanio, int desde, int hasta){
        Random random = new Random();
        int [] arreglo = new int[tamanio];
        for (int i = 0; i < arreglo.length; i++){
            arreglo[i] = random.nextInt(hasta+1) + desde;
        }
        return arreglo;
    }
}
