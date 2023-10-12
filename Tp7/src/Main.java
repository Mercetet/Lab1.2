import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*1.	Ordenar un array de números enteros de menor a mayor.
        int [] arr = {9,3,7,5,6,4,8,2};
        Arrays.sort(arr);
        for (int i:arr) {
            System.out.println(i +" ");
        }*/

        /*2.	Ordenar un array de números enteros de mayor a menor.
        Integer[] arr = {9, 3, 7, 5, 6, 4, 8, 2};
        Arrays.sort(arr, Collections.reverseOrder());
        for (int i:arr) {
            System.out.println(i + " ");
        }*/

/*3.	Ordenar un array de números flotantes de menor a mayor.
        double [] arr = {9.4,3.6,7,5.32,6.1,4,8.4,2, 8.3};
        Arrays.sort(arr);
        for (double i:arr) {
            System.out.println(i +" ");
        }*/

/*4.	Ordenar un array de números flotantes de mayor a menor.
        Double [] arr = {9.4,3.6,7.0,5.32,6.1,4.0,8.4,2.0, 8.3};
        Arrays.sort(arr, Collections.reverseOrder());
        for (double i:arr) {
            System.out.println(i +" ");
        }*/

        /*5.	Ordenar un array de cadenas de texto en orden alfabético.
        String [] arr = {"hola", "pepe", "aves", "teen wolf", "miraculous"};
        Arrays.sort(arr);
        for (String i:arr) {
            System.out.println(i + " ");
        }*/

/*6.	Ordenar un array de cadenas de texto en orden inverso.
        String [] arr = {"hola", "pepe", "aves", "teen wolf", "miraculous"};
        Arrays.sort(arr, Collections.reverseOrder());
        for (String i:arr) {
            System.out.println(i + " ");
        }

        /*9.	Ordenar un array de números enteros utilizando el algoritmo de ordenamiento burbuja.
        int [] arr = {9,3,7,5,6,4,8,2};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j + 1] < arr[j]) {
                    int aux = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = aux;
                }
            }
        }

        for (int k:arr) {
            System.out.println(k+ " ");
        }*/


        /*10.	Ordenar un array de números enteros utilizando el algoritmo de ordenamiento por selección.
        int [] arr = {9,3,7,5,6,4,8,2};
        for (int i = 0; i < arr.length; i++) {
            int menor = arr[i];
            int pos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < menor) {
                    menor = arr[j];
                    pos = j;
                }
            }
            if (pos != i) {
                int tmp = arr[i];
                arr[i] = arr[pos];
                arr[pos] = tmp;
            }
        }
        for (int k:arr) {
                System.out.print(k+ " ");
            }*/

        /*11.	Ordenar un array de números enteros utilizando el algoritmo de ordenamiento por inserción.
        int [] arr = {9,3,7,5,6,4,8,2};
        for (int i = 0; i < arr.length; i++) {
            int aux = arr[i];
            int j = i - 1;
            while ((j >= 0) && (aux < arr[j])){
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = aux;
        }
        for (int k:arr) {
            System.out.print(k + " ");
        }*/

        /*12.	Ordenar un array de números enteros utilizando el algoritmo de ordenamiento por mezcla.
        int[] arr = {9, 3, 7, 5, 6, 4, 8, 2};
        int izq = 0;
        int der = arr.length - 1;
        int i = izq;
        int j = der;
        int pivote = arr[izq];

        while (i < j) {
            while (arr[i] <= pivote && i < j) {
                i++;
            }
            while (arr[j] > pivote) {
                j--;
            }
            if (i < j) {
                int aux = arr[i];
                arr[i] = arr[j];
                arr[j] = aux;
            }
        }

        arr[izq] = arr[j];
        arr[j] = pivote;
        if (izq < j - 1) {
            int nuevoIzq = izq;
            int nuevoDer = j - 1;
            i = nuevoIzq;
            j = nuevoDer;
            pivote = arr[nuevoIzq];

            while (i < j) {
                while (arr[i] <= pivote && i < j) {
                    i++;
                }
                while (arr[j] > pivote) {
                    j--;
                }
                if (i < j) {
                    int aux = arr[i];
                    arr[i] = arr[j];
                    arr[j] = aux;
                }
            }

            arr[nuevoIzq] = arr[j];
            arr[j] = pivote;
        }

        if (j + 1 < der) {
            // Ordenar la sublista derecha
            int nuevoIzq = j + 1;
            int nuevoDer = der;
            i = nuevoIzq;
            j = nuevoDer;
            pivote = arr[nuevoIzq];

            while (i < j) {
                while (arr[i] <= pivote && i < j) {
                    i++;
                }
                while (arr[j] > pivote) {
                    j--;
                }
                if (i < j) {
                    int aux = arr[i];
                    arr[i] = arr[j];
                    arr[j] = aux;
                }
            }

            arr[nuevoIzq] = arr[j];
            arr[j] = pivote;
        }

        for (int k : arr) {
            System.out.print(k + " ");
        }*/

/*13.	Ordenar un array de números enteros utilizando el algoritmo de ordenamiento shell.
        int[] arr = {9, 3, 7, 5, 6, 4, 8, 2};
        for (int i = arr.length / 2; i != 0; i /= 2) {
            boolean si = true;
            while (si) {
                si = false;
                for (int j = i; j < arr.length; j++)
                {
                    if (arr[j - i] > arr[j]) {
                        int aux = arr[j];
                        arr[j] = arr[j - i];
                        arr[j - i] = aux;
                        si = true;
                    }
                }
            }
        }

        for (int k : arr) {
            System.out.print(k + " ");
        }*/

/*14.	Codifique un algoritmo que permita cargar un array de una dimensión de 20 elementos enteros. Finalizada la carga de los 20 elementos el programa debe solicitar como se desea ordenar el array ASCENDENTE O DESCENDENTE y que método de ordenamiento aplicar (inserción, burbuja, selección), según las opciones elegidas aplique el algoritmos fundamental de ordenamiento que corresponda. Muestre por pantalla el array original desordenado y su resultante ordenado según las opciones elegidas.

        Scanner leer = new Scanner(System.in);
        Integer[] arr = new Integer[5];
        System.out.println("Ingrese 20 numeros enteros: ");
        for (int i = 0; i < 5; i++) {
            System.out.println((i +1) + ": ");
            arr[i] = leer.nextInt();
        }

        System.out.println("Como desea ordenar el array?");
        System.out.println("1. Ascendente. ");
        System.out.println("2. Descendente. ");
        int op1 = leer.nextInt();

        switch (op1){
            case 1:
                System.out.println("Que metodo desea utilizar? ");
                System.out.println("1. Insercion.");
                System.out.println("2. Burbuja.");
                System.out.println("3. Seleccion. ");
                int op2 = leer.nextInt();
                for (int k: arr) {
                    System.out.print(k + " ");
                }
                System.out.println("");
                switch (op2) {
                    case 1 -> {
                        for (int i = 0; i < arr.length; i++) {
                            int aux = arr[i];
                            int j = i - 1;
                            while ((j >= 0) && (aux < arr[j])) {
                                arr[j + 1] = arr[j];
                                j--;
                            }
                            arr[j + 1] = aux;
                        }
                        for (int k : arr) {
                            System.out.print(k + " ");
                        }
                    }
                    case 2 -> {
                        for (int i = 0; i < arr.length; i++) {
                            for (int j = 0; j < arr.length - i - 1; j++) {
                                if (arr[j + 1] < arr[j]) {
                                    int aux = arr[j + 1];
                                    arr[j + 1] = arr[j];
                                    arr[j] = aux;
                                }
                            }
                        }
                        for (int k : arr) {
                            System.out.print(k + " ");
                        }
                        System.out.println("");
                    }
                    case 3 -> {
                        for (int i = 0; i < arr.length; i++) {
                            int menor = arr[i];
                            int pos = i;
                            for (int j = i + 1; j < arr.length; j++) {
                                if (arr[j] < menor) {
                                    menor = arr[j];
                                    pos = j;
                                }
                            }
                            if (pos != i) {
                                int tmp = arr[i];
                                arr[i] = arr[pos];
                                arr[pos] = tmp;
                            }
                        }
                        for (int k : arr) {
                            System.out.print(k + " ");
                        }
                        System.out.println("");
                    }
                }
                break;

            case 2:
                System.out.println("Que metodo desea utilizar? ");
                System.out.println("1. Insercion.");
                System.out.println("2. Burbuja.");
                System.out.println("3. Seleccion. ");
                int op3 = leer.nextInt();
                for (int k: arr) {
                    System.out.print(k + " ");
                }
                System.out.println("");
                switch (op3) {
                    case 1 -> {
                        for (int i = 0; i < arr.length; i++) {
                            int aux = arr[i];
                            int j = i - 1;
                            while ((j >= 0) && (aux > arr[j])) {
                                arr[j + 1] = arr[j];
                                j--;
                            }
                            arr[j + 1] = aux;
                        }
                        for (int k : arr) {
                            System.out.print(k + " ");
                        }
                    }
                    case 2 -> {
                        for (int i = 0; i < arr.length; i++) {
                            for (int j = 0; j < arr.length - i - 1; j++) {
                                if (arr[j + 1] > arr[j]) {
                                    int aux = arr[j + 1];
                                    arr[j + 1] = arr[j];
                                    arr[j] = aux;
                                }
                            }
                        }
                        for (int k : arr) {
                            System.out.print(k + " ");
                        }
                    }
                    case 3 -> {
                        for (int i = 0; i < arr.length; i++) {
                            int menor = arr[i];
                            int pos = i;
                            for (int j = i + 1; j < arr.length; j++) {
                                if (arr[j] > menor) {
                                    menor = arr[j];
                                    pos = j;
                                }
                            }
                            if (pos != i) {
                                int tmp = arr[i];
                                arr[i] = arr[pos];
                                arr[pos] = tmp;
                            }
                        }
                        for (int k : arr) {
                            System.out.print(k + " ");
                        }
                        System.out.println("");
                    }
                }
        }*/
    }
}