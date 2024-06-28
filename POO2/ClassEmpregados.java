package POO2;

public class ClassEmpregados {
    private int Id;
    private String nome;
    private Double salario;

    public ClassEmpregados(){
    }

    public int getId() {
        return Id;
    }
    public String getNome() {
        return nome;
    }
    public Double getSalario() {
        return salario;
    }
    public void setId(int id) {
        this.Id = id;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setSalario(Double salario) {
        this.salario = salario;
    }
    public void aumentarSalario(double porcentagem){
        salario += salario * porcentagem / 100.0;
    }

        public String toString(){
        return "Id: "
        + Id
        + "Nome: "
        + nome
        + "Salário: "
        + String.format("%.2f", salario);
        
    }
}
