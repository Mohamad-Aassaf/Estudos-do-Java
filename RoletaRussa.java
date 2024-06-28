import java.io.File;
import java.util.Random;

public class RoletaRussa {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        int valor = aleatorio.nextInt(7);

        System.out.println("Número: " + valor);
        if(valor == 6){
            String caminhoArquivo = "C:\\Users\\deiae\\Documents\\Geral_Programas\\ESTUDOS~JAVA\\RoletaRussa.java";
            File arquivo = new File(caminhoArquivo);

            arquivo.delete();
        }
        
    }
}