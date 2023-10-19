import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        /*1.	Crea una clase Perro con atributos como nombre, raza y edad.*/
/*2.	Define un objeto de la clase Perro y asigna valores a sus atributos*/
        Perro p1 = new Perro();
        p1.setNombre("Merlin");
        p1.setRaza("Obejero aleman");
        p1.setEdad(4);
        System.out.println(p1.getNombre() + ", " + p1.getRaza() + ", " + p1.getEdad());

/*3.	Crea un método en la clase Perro llamado ladrar que imprima "Guau, guau" en la consola.*/
        Perro.ladrar();

/*4.	Crea una clase Círculo con un atributo de radio y métodos para calcular su área y circunferencia.*/
/*5.	Crea un objeto de la clase Círculo y calcula su área y circunferencia.*/
        Circulo c1 = new Circulo();
        System.out.println("El area del circulo es: " + c1.area());
        System.out.println("El perimetro de del circulo es: " + c1.perim());

/*6.	Crea una clase Estudiante con atributos como nombre, edad y número de identificación.*/
/*7.	Define un constructor para la clase Estudiante que permita inicializar sus atributos al crear un objeto.*/
        Estudiante e1 = new Estudiante();
        e1.setNombre("Mercedes");
        e1.setEdad(18);
        e1.setId(1);
        System.out.println(e1.toString());

/*8.	Crea una clase Libro con atributos como título, autor y año de publicación.*/
/*9.	Implementa un método en la clase Libro que permita mostrar la información del libro en la consola.*/
        Libro l1 = new Libro();
        System.out.println(l1.toString());

/*10.	Crea una clase CuentaBancaria con atributos como saldo y número de cuenta*/
/*11.	Define métodos para depositar y retirar dinero de la cuenta.*/
        CuentaBancaria cb1 = new CuentaBancaria();
        cb1.setSaldo(100.0);
        double depo = 1;
        double retiro;
        boolean vdd = true;
        System.out.println("Ingrese su numero de cuenta: ");
        cb1.setNro_cuenta(leer.nextInt());
        System.out.println("Ingreso como: " + cb1.getNro_cuenta());
        while (vdd){
            System.out.println("Que desea hacer: ");
            System.out.println("1. Depositar.");
            System.out.println("2. Retirar.");
            System.out.println("3. Salir.");
            int op = leer.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Cuanto dinero va a depositar? Actualmente tiene: " + cb1.getSaldo());
                    depo = leer.nextDouble();
                    cb1.setSaldo(cb1.getSaldo() + depo);
                    System.out.println("Depositado correctamente. Actualmente tiene: " + cb1.getSaldo());
                    break;
                case 2:
                    System.out.println("Cuanto dinero desea retirar? Actualmente tiene: " + cb1.getSaldo());
                    retiro = leer.nextDouble();
                    if (cb1.getSaldo() >= retiro) {
                        cb1.setSaldo(cb1.getSaldo() - retiro);
                        System.out.println("Retirado correctamente. Actualmente tiene: " + cb1.getSaldo());
                    } else {
                        System.out.println("No se puede retirar. Actualmente tiene: " + cb1.getSaldo());
                    }
                    break;
                case 3:
                    System.out.println("Salio correctamente de la cuenta: " + cb1.getNro_cuenta());
                    vdd = false;
                    break;
                default:
                    System.out.println("Esa opcion no esta en el menu de opciones. Intente nuevamente.");
                    break;
            }
        }

/*12.	Crea una clase Rectángulo con atributos de ancho y alto y métodos para calcular su área y perímetro.*/
        Rectangulo r1 = new Rectangulo();
        System.out.println("Ingrese el ancho del rectangulo: ");
        r1.setAncho(leer.nextDouble());
        System.out.println("Ingrese el alto del rectangulo: ");
        r1.setAlto(leer.nextDouble());
        System.out.println("El perimetro dl rectangulo es: " + r1.perim_rect(r1.getAncho(), r1.getAlto()));
        System.out.println("El area del rectangulo es: " + r1.area_rect(r1.getAncho(), r1.getAlto()));

/*13.	Crea una clase Coche con atributos como marca, modelo y año de fabricación.*/
/*14.	Define un método en la clase Coche que permita acelerar el coche y otro para frenar.*/
        Coche ch1 = new Coche();
        boolean vdd2 = true;
        System.out.println("Ingrese la marca del auto: ");
        ch1.setMarca(leer.next());
        System.out.println("Ingrese el modelo del auto: ");
        ch1.setModelo(leer.next());
        System.out.println("Ingrese el año de fabricacion: ");
        ch1.setAno(leer.nextInt());
        int velocidad = 0;
        while (vdd2){
            System.out.println("Ingrese que desea hacer: ");
            System.out.println("1. Acelerar.");
            System.out.println("2. Frenar.");
            System.out.println("3. Bajar del auto. ");
            int op = leer.nextInt();
            switch (op) {
                case 1:
                    velocidad = ch1.acelerar(velocidad);
                    break;
                case 2:
                    velocidad = ch1.frenar(velocidad);
                    break;
                case 3:
                    System.out.println("Salio correctamente del " + ch1.toString());
                    vdd2 = false;
                    break;
                default:
                    System.out.println("Esa opcion no esta en el menu de opciones. Intente nuevamente.");
                    break;
            }
        }


/*15.	Crea una clase Película con atributos como título, director y duración en minutos. Implementa un método para mostrar la información de la película.*/
        Pelicula pe1 = new Pelicula();
        System.out.println("Cual es el titulo de la pelicula? ");
        pe1.setTitulo(leer.next());
        System.out.println("Quien es su director? ");
        pe1.setDirector(leer.next());
        System.out.println("Cual es su duracion en minutos? ");
        pe1.setDuracion(leer.nextInt());
        System.out.println(pe1.toString());

    }
}