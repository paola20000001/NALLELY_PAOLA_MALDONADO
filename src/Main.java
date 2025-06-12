
import figurasGeometricas.CirculoDibujable;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        figurasGeometricas.CirculoDibujable circulo = new CirculoDibujable(valor1: 100, x: 0, y: 0);

        System.out.println("El perímetro del círculo es: " + circulo.getPerimetro());
        System.out.println("El área del círculo es: " + circulo.getArea());

        JFrame frame = new JFrame();

    }
}