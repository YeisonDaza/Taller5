package clases;

public class Hexagono extends Figura {

    private double lado;
    private double apotema;

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getApotema() {
        return apotema;
    }

    public void setApotema(double apotema) {
        this.apotema = apotema;
    }


    @Override
    public double calculoPerimetro() {
        double HexagonoPerimetro = this.lado*6;

        return HexagonoPerimetro;
    }

    @Override
    public double calculoArea() {
        double HexagonoArea = this.calculoPerimetro()*this.apotema / 2;
        
        return HexagonoArea;
        
    }

}
