public class Circulo {
    private double radio = 10;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double area(){
        double a = Math.PI*Math.pow(radio, 2);
        return a;
    }

    public double perim(){
        double p = 2*Math.PI*radio;
        return p;
    }


}
