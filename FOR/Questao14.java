package FOR;

class Questao14 {
    public static void main(String[] args) {
        int soma = 0;
        for (int i = 50; i <= 125; i = i + 1) {
            if(i % 3 == 0){
            System.out.println("Números: " + i);
            }
            soma = soma + i;
        }
            System.out.println("Soma: " + soma);
    }
}
