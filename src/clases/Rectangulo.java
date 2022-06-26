package clases;

public class Rectangulo extends Figura {

    private double base;
    private double altura;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calculoArea() {

        double rectanguloArea = this.base * this.altura;
        return rectanguloArea;
    }

    @Override
    public double calculoPerimetro() {
        double rectanguloPerimetro = ((2 * this.base) * (2 * this.altura));
        return rectanguloPerimetro;
    }
}
