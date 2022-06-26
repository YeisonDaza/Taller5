package clases;

public class TrianguloEquilatero extends Figura {

    private double base;
    private double altura;
    private double lado;

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

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calculoPerimetro() {
        double trianguloPerimetro = this.lado * 3;

        return trianguloPerimetro;

    }

    @Override
    public double calculoArea() {
        double trianguloArea = this.base * this.altura / 2;

        return trianguloArea;

    }
}
