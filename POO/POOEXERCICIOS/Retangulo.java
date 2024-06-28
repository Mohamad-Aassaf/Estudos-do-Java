package POO.POOEXERCICIOS;

public class Retangulo {
    public double altura;
    public double largura;

    public double areaRetangulo(){
        double resultadoArea = (altura * largura);

        return resultadoArea;
    }
    public double perimetroRetangulo(){
        double resultadoPerimetro = 2 * (altura + largura);

        return resultadoPerimetro;
    }
    public double diagonalRetangulo(){
        double resultadoDiagonal = Math.sqrt(Math.pow(altura, 2) + Math.pow(largura, 2));

        return resultadoDiagonal;
    }
}
// DA PRA FAZER ASSIM:
/*
 * public double area() {
return width * height;
}
public double perimeter() {
return 2 * (width + height);
}
public double diagonal() {
return Math.sqrt(width * width + height * height);
}
 */