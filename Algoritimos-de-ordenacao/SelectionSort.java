public class SelectionSort {
    public static void main(String[] args) {
        int[] vetor = new int[10];

        // Preenchendo o vetor com valores aleatórios
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * vetor.length);
        }

        // Exibindo o vetor desordenado
        System.out.println("Desordenado");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println("");

        int posicao_menor, aux;
        for (int i = 0; i < vetor.length; i++) {
            // posicao_menor recebe o valor de i de início e toda vez que concluir o For(j)
            // abaixo.
            posicao_menor = i;
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[j] < vetor[posicao_menor]) {
                    // Armazena o elemento de menor valor e continua a execução do For(j) até o fim
                    // do Vetor.
                    posicao_menor = j;
                }
            }
            // Armazena o valor do elemento em posicao_menor para evitar a "perca".
            aux = vetor[posicao_menor];

            // Troca o valor dentro de i pelo valor dentro de posicao_menor.
            vetor[posicao_menor] = vetor[i];

            // Troca o valor dentro de i pelo valor dentro de aux(que armazenou o menor
            // valor).
            vetor[i] = aux;
        }
        // Exibindo o vetor ordenado
        System.out.println("Ordenado");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
}
