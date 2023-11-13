import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
import java.util.Date;
import java.util.Date;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        /*1.	Diseñar un programa que lea y guarde marcas de Autos en un ArrayList de tipo
String. El programa pedirá una marca de Auto en un bucle, el mismo se guardará
en la lista y después se le preguntará al usuario si quiere guardar otro Auto o si
quiere salir. Si decide salir, se mostrará todos los autos guardados en el ArrayList.
        ArrayList<String> auto = new ArrayList<>();
        boolean bo = true;

        do{
            System.out.println("Ingrese una marca de auto. X para salir: ");
            String marca = leer.next().toUpperCase();
            if (marca.equals("X")){
                System.out.println("Saliendo...");
                bo = false;
            }else {
                auto.add(marca);
            }
        }while (bo);

        System.out.println("Lista de autos ingresados: ");
        for (String i : auto) {
            System.out.println(i);
        }*/

/*2.	Define una clase EquipoDeFútbol que utiliza un ArrayList para mantener una lista de jugadores. La clase debe permitir agregar nuevos jugadores, eliminar jugadores y listar la plantilla.
        EquipoDeFutbol ef = new EquipoDeFutbol();
        ArrayList<String> equipo = new ArrayList<>();
        boolean bo = true;

        while (bo){
            System.out.println("Que desea hacer? ");
            System.out.println("1. Agregar jugador. ");
            System.out.println("2. Eliminar jugador. ");
            System.out.println("3. Listar plantilla");
            System.out.println("0. Salir. ");
            int op = leer.nextInt();

            switch (op){
                case 0:
                    System.out.println("Saliendo...");
                    bo = false;
                    break;
                case 1:
                    System.out.println("Ingrese el nombre del nuevo jugador. ");
                    ef.setJugador(leer.next());
                    equipo.add(ef.getJugador());
                    break;
                case 2:
                    System.out.println("Ingrese el nombre del jugador a eliminar: ");
                    String eli = leer.next();
                    boolean bo2 = equipo.contains(eli);
                    if (bo2) {
                        equipo.remove(eli);
                        System.out.println("Se removio correctamente. ");
                    } else {
                        System.out.println("No se encontro el jugador. ");
                    }
                    break;
                case 3:
                    System.out.println("Lista de jugadores: ");
                    for (String i: equipo) {
                        System.out.println(i);
                    }
                    break;
                default:
                    System.out.println("Ingreso mal el numero, intente otra vez.");
            }
        }*/


/*3.	Crear una clase llamada Factura que represente una factura comercial. La clase debe tener los siguientes atributos:

•	Número de factura: Un número único para identificar la factura.
•	Fecha de emisión: La fecha en la que se emitió la factura.
•	Cliente: El cliente al que se le emite la factura.
•	Artículos: Una lista de artículos vendidos en la factura.
•	Precio unitario: El precio unitario de cada artículo.
•	Cantidad: La cantidad de cada artículo vendido.
•	Subtotal: El subtotal de la factura sin impuestos.
•	IVA: El impuesto sobre el valor añadido (IVA) de la factura.
•	Total: El total de la factura, incluyendo el IVA.
•
La clase debe tener los siguientes métodos:

•	Constructor: Un constructor que inicializa los atributos de la factura.
•	Agregar artículo: Un método que agrega un artículo a la factura.
•	Calcular subtotal: Un método que calcula el subtotal de la factura.
•	Calcular IVA: Un método que calcula el IVA de la factura.
•	Calcular total: Un método que calcula el total de la factura*/

        Factura factura = new Factura(1, new Date(), "Cliente1", 10.0, 3);

        factura.agregarArticulo("Papas");
        factura.agregarArticulo("Galleta");
        factura.agregarArticulo("Perfume");

        double subtotal = factura.calcularSubtotal();
        double iva = factura.calcularIVA();
        double total = factura.calcularTotal();

        System.out.println("Detalles de la factura:");
        System.out.println(factura);
        System.out.println("Subtotal: " + subtotal);
        System.out.println("IVA: " + iva);
        System.out.println("Total: " + total);
    }
}
