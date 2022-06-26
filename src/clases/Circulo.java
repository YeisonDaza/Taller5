package clases;

public class Circulo extends Figura {

    private double radio;
    private double diametro;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    @Override
    public double calculoArea() {
        double circuloArea = NO_PI * (this.radio * this.radio);

        return circuloArea;
    }

    @Override
    public double calculoPerimetro() {
        double CirculoPerimetro = 2 * this.radio * (NO_PI);
        
        return CirculoPerimetro;
        
    }
}
