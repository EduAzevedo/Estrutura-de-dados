import java.util.Random;

public class Cartela {
    private int numeros[][];
    private Random gerador = new Random();

    public Cartela(int totalNum) {
        numeros = new int[totalNum][totalNum];

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros.length; j++) {
                numeros[i][j] = gerador.nextInt((59 + 1));
            }
        }

    }

    public void showNumbers() {
        for (int i = 0; i < numeros.length; i++) {
            String linha = "";
            for (int j = 0; j < numeros.length; j++) {
                linha = linha + " " + numeros[i][j];
            }

            System.out.println(linha);
            
        }
        
        
    }

}
