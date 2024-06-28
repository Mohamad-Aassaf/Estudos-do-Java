package POO;

public class Produto {

    public String nome;
    public double preço;
    public int quantidade; // usa this pra chamar isso

    public double valorTotalEmEstoque(){
        return preço * quantidade;

        }

        public void adicionarProduto(int quantidade){ // para referenciar o atributo da classe, usaremos THIS
            this.quantidade += quantidade; // soma o quantidade da classe + o do argumento
        }
        public void removerProduto(int quantidade){
            this.quantidade -= quantidade;
        }
        public String toString(){ // retorna produto1 com as especificações abaixo
            return nome
            + ", $"
            + String.format("%.2f", preço) //retorna o preço com 2 casas decimais
            + ", "
            + quantidade
            + " unidades, Total: $"
            + String.format("%.2f", valorTotalEmEstoque());
        }
    }

