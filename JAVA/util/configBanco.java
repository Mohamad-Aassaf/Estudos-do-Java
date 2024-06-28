package util;

public class configBanco {

    private int numeroConta;
    private String nomeConta;
    private double saldoConta;

    public configBanco(int numeroConta, String nomeConta){ // Sobrecarga
        this.numeroConta = numeroConta;  
        this.nomeConta = nomeConta;
    }
    public configBanco(int numeroConta, String nomeConta, double depositoInicial){ 
        this.numeroConta = numeroConta;
        this.nomeConta = nomeConta;
        deposito(depositoInicial);
    }
    public int getNumeroConta(){  // Encapsulamento
        return numeroConta;
    }
    public String getNomeConta(){
        return nomeConta;
    }
    public void setNomeConta(String nomeConta){
        this.nomeConta = nomeConta;
    }
    public double getSaldoConta(){
        return saldoConta;
    }
    public void deposito(double  quantidade){
        saldoConta += quantidade;
    }
    public void retirar(double quantidade){
        saldoConta -= quantidade + 5.0;
    }
    public String toString(){
        return "Conta: "
        + numeroConta
        + ", "
        + "Nome: "
        + nomeConta
        + ", "
        + "Saldo: R$ "
        + String.format(" %.2f%n", saldoConta);
    }
}
