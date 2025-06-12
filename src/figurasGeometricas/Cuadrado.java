package figurasGeometricas;

public class Cuadrado extends Figura {
    public Cuadrado(double valor1){
        super(valor1);
    }

    @Override
    public double getArea(){
        return Math.pow(this.valor1, 2);
    }

    @Override
    public double getPerimetro(){
        return 4 * this.valor1;
    }
}
