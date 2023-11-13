import java.util.ArrayList;
import java.util.Date;

public class Factura {
    private int num_fac;
    private Date emision;
    private String cliente;
    private ArrayList<String> art = new ArrayList<>();
    private double precio;
    private int cantidad;
    private double subtotal;
    private double iva;
    private double total;

    public Factura(int num_fac, Date emision, String cliente, double precio, int cantidad) {
        this.num_fac = num_fac;
        this.emision = emision;
        this.cliente = cliente;
        this.precio = precio;
        this.cantidad = cantidad;
        this.art = new ArrayList<>();
    }

    public void agregarArticulo(String nuevoArticulo) {
        art.add(nuevoArticulo);
        System.out.println("Se agregó correctamente: " + nuevoArticulo);
    }

    public double calcularSubtotal() {
        subtotal = 0;
        for (String articulo : art) {
            subtotal += precio * cantidad;
        }
        return subtotal;
    }

    public double calcularIVA() {
        iva = subtotal * 0.16;
        return iva;
    }

    public double calcularTotal() {
        total = subtotal + iva;
        return total;
    }

    @Override
    public String toString() {
        return "Factura{" +
                "num_fac=" + num_fac +
                ", emision=" + emision +
                ", cliente='" + cliente + '\'' +
                ", art=" + art +
                ", precio=" + precio +
                ", cantidad=" + cantidad +
                ", subtotal=" + subtotal +
                ", iva=" + iva +
                ", total=" + total +
                '}';
    }
}
