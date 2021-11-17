public class Rectangulo extends FiguraPlana {
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double CalcularArea() {
        return base*altura;
    }

    @Override
    public double CalcularPerimetro() {
        return 2*base+2*altura;
    }
}
