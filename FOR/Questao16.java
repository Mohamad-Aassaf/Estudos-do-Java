package FOR;

class Questao16 {
    public static void main(String[] args) {
        for (int a = 10; a <= 150; a = a + 1){
            if(a % 7 == 0){
            System.out.println("Números de 7 " + a);
            }
        }
        for (int i = 10; i <= 150; i = i + 1) {
            if(i % 3 == 0){
            System.out.println("Números de 3: " + i);
            }
        }
    }
}