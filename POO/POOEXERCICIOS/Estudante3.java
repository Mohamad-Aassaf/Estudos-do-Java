package POO.POOEXERCICIOS;

public class Estudante3 {
    public String nome;
    public double nota1, nota2, nota3;

    public double notaTotal(){
        return nota1 + nota2 + nota3;

    }

    public double pontosRestantes() {
        if(notaTotal() < 60.0) {
            return 60.0 - notaTotal();
        }
        else {
            return 0.0;
        }
    }
}
