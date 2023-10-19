import java.util.Scanner;

public class Coche {
    private String marca;
    private String modelo;
    private int ano;

    public Coche() {
    }

    public Coche(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ano=" + ano +
                '}';
    }

    public int acelerar(int vel){
        Scanner leer = new Scanner((System.in));
        System.out.println("Cuanto desea acelerar? Actualmente va a: " + vel);
        int ace = leer.nextInt();
        vel += ace;
        System.out.println("Acelerando... Actualmente va a: " + vel);
        return  vel;
    }
    public int frenar(int vel){
        Scanner leer = new Scanner((System.in));
        System.out.println("Cuanto desea frenar? Actualmente va a: " + vel);
        int freno = leer.nextInt();
        if (vel >= freno) {
            vel -= freno;
            System.out.println("Frenando... Actualmente va a: " + vel);
        } else {
            vel = 0;
            System.out.println("Totalmente quieto." + vel);
        }
        return vel;
    }
}
