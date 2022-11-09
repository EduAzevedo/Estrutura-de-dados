public class Q2 {
    /*
     * Faça um programa para informar qual o valor da soma dos valores de um vetor
     * de
     * inteiros, utilizando o modo iterativo
     */
    public static void main(String[] args) {
        int vetor[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int soma = 0;

        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }
        System.out.println("Soma total: " + soma);
    }

    
}
