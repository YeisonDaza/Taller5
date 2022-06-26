package figurasgeometricas;

import clases.Circulo;
import clases.Hexagono;
import clases.TrianguloEquilatero;
import clases.Rectangulo;

public class Figurasgeometricas {

    public static void main(String[] args) {

        Circulo miCirculo = new Circulo();
        miCirculo.setRadio(3);

            System.out.println("Área del circulo: " + miCirculo.calculoArea());
            System.out.println("Perimetro:" + miCirculo.calculoPerimetro());
            System.out.println("---------------------------------------------");

        TrianguloEquilatero miTrianguloEquilatero = new TrianguloEquilatero();
            miTrianguloEquilatero.setBase(5);
            miTrianguloEquilatero.setAltura(5);
            miTrianguloEquilatero.setLado(5);
        
            System.out.println("Área del triangulo equilatero: " + miTrianguloEquilatero.calculoArea());
            System.out.println("Perimetro: " + miTrianguloEquilatero.calculoPerimetro());
            System.out.println("---------------------------------------------");
        
        Rectangulo miRectangulo = new Rectangulo();
            miRectangulo.setAltura(6);
            miRectangulo.setBase(2);
        
            System.out.println("Área del rectangulo es:" + miRectangulo.calculoArea());
            System.out.println("Perimetro:" + miRectangulo.calculoPerimetro());
            System.out.println("---------------------------------------------");
        
        Hexagono miHexagono = new Hexagono();
            miHexagono.setLado(10);
            miHexagono.setApotema(8.7);

            System.out.println("Área del héxagono: "+miHexagono.calculoArea());
            System.out.println("Perimetro: "+miHexagono.calculoPerimetro());
    }
}
