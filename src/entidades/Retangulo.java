package entidades;

import static java.lang.Math.sqrt;

public class Retangulo {
    public double altura;
    public double largura;

    public double area() {
        return largura * altura;
    }

    public double perimetro() {
        return 2 * (largura + altura);
    }

    public double diagonal() {
        return sqrt((altura * altura) + (largura * largura));
    }

    public String toString(){
        return
        "\nArea: "
        + area()
        +"\nPerimetro: "
        +perimetro()
        +"\nDiagonal: "
        +diagonal();

    }

}
