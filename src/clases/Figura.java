
package clases;


public abstract class  Figura implements IFigura{
    protected String nombreFigura;
    public abstract double calculoPerimetro();

    public String getNombreFigura() {
        return nombreFigura;
    }

    public void setNombreFigura(String nombreFigura) {
        this.nombreFigura = nombreFigura;
    }
    
    
}
