public class Circulo extends FiguraPlana {
     double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double CalcularPerimetro() {
        return 2*Math.PI*radio;
    }

    @Override
    public double CalcularArea() {
        return Math.PI*radio*radio;
    }
}
