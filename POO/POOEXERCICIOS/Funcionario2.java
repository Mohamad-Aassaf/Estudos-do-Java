package POO.POOEXERCICIOS;

public class Funcionario2 {
    public String nome;
    public double salarioBruto;
    public double imposto;

    public double salario(){
        return salarioBruto - imposto;
    }

    public void aumentarSalario(double porcentagem){
        salarioBruto += (salarioBruto * porcentagem) / 100.0;
    }

    public String toString(){
        return nome
        + ", "
        + "R$ "
        + String.format("%.2f", salario());
    }
}
