import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
/*1.	Crea un ArrayList de números enteros y agrega 5 números a la lista.
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el " + (i+1) + " numero: ");
            int num = leer.nextInt();
            nums.add(num);
        }
        mostrar_array_int(nums);*/

/*2.	Crea un ArrayList de cadenas y agrega 3 nombres a la lista.
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Pepe");
        arr.add("Juan");
        arr.add("Lola");

        mostrar_array_st(arr);*/

/*3.	Imprime todos los elementos de un ArrayList de enteros.
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(23);
        nums.add(34);
        nums.add(521);
        nums.add(1);

        mostrar_array_int(nums);*/

/*4.	Encuentra la longitud (número de elementos) de un ArrayList de caracteres.
        ArrayList<Character> arr = new ArrayList<>();
        arr.add('P');
        arr.add('a');
        arr.add('b');
        arr.add('l');
        arr.add('i');
        arr.add('t');
        arr.add('o');

        int tot = arr.size();
        System.out.println(tot);*/

/*5.	Elimina un elemento específico de un ArrayList de cadenas.
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Pepe");
        arr.add("Juan");
        arr.add("Lola");

        mostrar_array_st(arr);
        arr.remove(1);
        mostrar_array_st(arr);*/

/*6.	Comprueba si un ArrayList de números enteros está vacío.
        ArrayList<Integer> nums = new ArrayList<>();
        if (nums.isEmpty()){
            System.out.println("Esta vacio. ");
        }*/

/*7.	Encuentra el elemento más grande en un ArrayList de números.
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el " + (i+1) + " numero: ");
            int num = leer.nextInt();
            nums.add(num);
        }

        mostrar_array_int(nums);

        int max = 0;
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i)>max){
                max = nums.get(i);
            }
        }

        System.out.println("El numero mas grande es: " + max);*/

/*8.	Copia todos los elementos de un ArrayList en otro ArrayList nuevo.
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el " + (i+1) + " numero: ");
            int num = leer.nextInt();
            nums.add(num);
        }

        mostrar_array_int(nums);

        ArrayList<Integer> copy = new ArrayList<>(nums);

        mostrar_array_int(copy);*/


/*9.	Invierte un ArrayList de enteros (el primer elemento se convierte en el último y viceversa).
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el " + (i+1) + " numero: ");
            int num = leer.nextInt();
            nums.add(num);
        }

        mostrar_array_int(nums);

        Collections.reverse(nums);

        mostrar_array_int(nums);*/

/*10.	Combina dos ArrayLists de enteros en uno solo.
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el " + (i+1) + " numero: ");
            int num = leer.nextInt();
            nums.add(num);
        }

        ArrayList<Integer> nums2 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el " + (i+1) + " numero: ");
            int num2 = leer.nextInt();
            nums2.add(num2);
        }

        mostrar_array_int(nums);
        mostrar_array_int(nums2);

        nums.addAll(nums2);
        mostrar_array_int(nums);*/

        /*11.	Crea un ArrayList de números enteros y elimina todos los elementos pares.
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el " + (i+1) + " numero: ");
            int num = leer.nextInt();
            nums.add(num);
        }

        mostrar_array_int(nums);

        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 == 0){
                nums.remove(i);
            }
        }

        mostrar_array_int(nums);*/

/*12.	Busca un elemento específico en un ArrayList de cadenas y devuelve su índice.
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Pepe");
        arr.add("Juan");
        arr.add("Lola");

        mostrar_array_st(arr);
        String busc = "Lola";
        int indice = arr.indexOf(busc);

        if (indice != -1) {
            System.out.println("El elemento '" + busc + "' se encuentra en el índice " + (indice+1));
        }*/

/*13.	Comprueba si dos ArrayLists son iguales (tienen los mismos elementos en el mismo orden).
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el " + (i+1) + " numero: ");
            int num = leer.nextInt();
            nums.add(num);
        }

        mostrar_array_int(nums);

        System.out.println("Segundo arrayList: ");
        ArrayList<Integer> nums2 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el " + (i+1) + " numero: ");
            int num2 = leer.nextInt();
            nums2.add(num2);
        }

        mostrar_array_int(nums2);

        boolean bo = true;
        if (nums.size() == nums2.size()){
            for (int i = 0; i < nums.size(); i++) {
                if (!nums.get(i).equals(nums2.get(i))){
                    bo = false;
                    break;
                }else {
                    bo = true;
                }
            }
        }else {
            bo = false;
        }

        if (bo){
            System.out.println("Los arrays son iguales. ");
        }else {
            System.out.println("Los arrays son diferentes. ");
        }*/

/*14.	Encuentra el elemento más pequeño en un ArrayList de números.
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el " + (i+1) + " numero: ");
            int num = leer.nextInt();
            nums.add(num);
        }

        mostrar_array_int(nums);

        int min = 99999999;
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) < min){
                min = nums.get(i);
            }
        }
        System.out.println("El numero mas pequeño del array es: " + min);*/

/*15.	Crea un ArrayList de números enteros y suma todos los elementos.
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el " + (i+1) + " numero: ");
            int num = leer.nextInt();
            nums.add(num);
        }

        mostrar_array_int(nums);

        int sum = 0;
        for (int i = 0; i < nums.size(); i++) {
            sum += nums.get(i);
        }
        System.out.println("La suma de los numeros del array es: " + sum);*/

/*16.	Crea un ArrayList de cadenas y concatena todas las cadenas en una sola.
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Pepe");
        arr.add("Juan");
        arr.add("Lola");

        mostrar_array_st(arr);
        String concat = "";

        for (int i = 0; i < arr.size(); i++) {
             concat += arr.get(i);
        }

        System.out.println(concat);*/

/*17.	Elimina todos los elementos duplicados de un ArrayList de cadenas.
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Pepe");
        arr.add("Juan");
        arr.add("Lola");
        arr.add("Pepe");
        arr.add("Lola");
        arr.add("Juan");

        mostrar_array_st(arr);

        for (int i = 0; i < arr.size(); i++) {
            for (int j = i+1; j < arr.size(); j++) {
                if (arr.get(i)==arr.get(j)){
                    arr.remove(j);
                    j--;
                }
            }
        }

        mostrar_array_st(arr);*/

/*18.	Crea un ArrayList de enteros y encuentra la suma de los elementos en índices pares.
        ArrayList<Integer> nums = new ArrayList<>();
        ArrayList<Integer> pares = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el " + (i+1) + " numero: ");
            int num = leer.nextInt();
            nums.add(num);
        }

        mostrar_array_int(nums);
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) %2 == 0){
                pares.add(nums.get(i));
            }
        }

        int sum = 0;
        for (int i = 0; i < pares.size(); i++) {
            sum += pares.get(i);
        }
        System.out.println("La suma de los numeros pares del array es: " + sum);*/

/*19.	Comprueba si un ArrayList de enteros contiene un número específico.
        ArrayList<Integer> nums = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el " + (i+1) + " numero: ");
            int num = leer.nextInt();
            nums.add(num);
        }

        mostrar_array_int(nums);
        boolean bo = false;
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) == 5){
                bo = true;
                break;
            }
        }

        if (bo){
            System.out.println("El array contene el numero 5");
        }else{
            System.out.println("El array no contiene el numero 5");
        }*/

/*20.	Encuentra el elemento en un ArrayList de cadenas que tiene la longitud más larga.
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Pepito");
        arr.add("Juanito");
        arr.add("Lolita");
        arr.add("Lula");

        mostrar_array_st(arr);
        String max = "";
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).length() > max.length()){
                max = arr.get(i);
            }
        }

        System.out.println("La palabra mas larga es: " + max);*/

/*21.	Encuentra el promedio de todos los elementos en un ArrayList de números enteros.
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el " + (i+1) + " numero: ");
            int num = leer.nextInt();
            nums.add(num);
        }

        mostrar_array_int(nums);

        int sum = 0;
        for (int i = 0; i < nums.size(); i++) {
            sum += nums.get(i);
        }

        int tot = sum/nums.size();
        System.out.println("El promedio de los numeros del array es: " + tot);*/

/*22.	Crea un ArrayList de enteros y ordénalo de forma ascendente.
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el " + (i+1) + " numero: ");
            int num = leer.nextInt();
            nums.add(num);
        }

        mostrar_array_int(nums);

        Collections.sort(nums);

        mostrar_array_int(nums);*/

/*23.	Crea un ArrayList de números enteros y elimina todos los elementos mayores que un valor específico.
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el " + (i+1) + " numero: ");
            int num = leer.nextInt();
            nums.add(num);
        }

        mostrar_array_int(nums);
        for (int i = 0; i < nums.size(); i++) {
            if(nums.get(i) > 5){
                nums.remove(i);
            }
        }

        mostrar_array_int(nums);*/
        
/*24.	Encuentra la cantidad de veces que un elemento específico aparece en un ArrayList de cadenas.
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el " + (i+1) + " numero: ");
            int num = leer.nextInt();
            nums.add(num);
        }

        mostrar_array_int(nums);
        int count = 0;
        for (int i = 0; i < nums.size(); i++) {
            if(nums.get(i) == 3){
                count +=1;
            }
        }

        System.out.println("El numero 3 aparece " + count + " veces en el array.");*/

        /*25.	Crea un ArrayList de cadenas y ordena las cadenas alfabéticamente.
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Pepito");
        arr.add("Juanito");
        arr.add("Lolita");
        arr.add("Lula");

        mostrar_array_st(arr);

        Collections.sort(arr);

        mostrar_array_st(arr);*/
    }

    public static void mostrar_array_int(ArrayList<Integer> arr){
        for (int num:arr) {
            System.out.print(num + ", ");
        }
        System.out.println("");
    }

    public static void mostrar_array_st(ArrayList<String> arr){
        for (String st:arr) {
            System.out.println(st);
        }
        System.out.println("");
    }
}