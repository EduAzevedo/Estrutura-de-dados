public class Q1 {

    /*
     * Faça um programa para contar os valores de um vetor de números decimais que
     * são
     * inteiros, utilizando o modo iterativo.
     */
    public static void main(String[] args) {
        // length = 10;
        double vetor[] = { 1.0, 22.1, 32.0, 2.4, 7.1, 2.0, 9.5, 10.0, 84.1, 65.0 };
        int contador = 0;

        for (int i = 0; i < vetor.length; i++) {

            if (vetor[i] == (int) vetor[i]) {
                contador++;
            }
        }
        System.out.println("Total de números inteiros: " + contador);

    }
}
