public class Cuadrado extends FiguraPlana {
    private double lados;

    public Cuadrado(double lados) {
        this.lados = lados;
    }

    @Override
    public double CalcularPerimetro() {
        return lados*4;
    }

    @Override
    public double CalcularArea() {
        return lados*lados;
    }
}
