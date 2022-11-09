class SelectionSort {
    public static void main(String[] args) {
        int vetor[] = { 0, 6, 8, 7, 22, 11, 2, 9, 4, 1 };

        for (int i : vetor) {
            System.out.print(i + " - ");
        }

        System.out.println();
        selectionOrder(vetor);

    }

    public static void selectionOrder(int vetor[]) {
        int posicao_menor, aux;

        for (int i = 0; i < vetor.length; i++) {
            posicao_menor = i;
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[j] < vetor[posicao_menor]) {
                    posicao_menor = j;
                }
            }
            aux = vetor[posicao_menor];
            vetor[posicao_menor] = vetor[i];
            vetor[i] = aux;
        }

        for (int i : vetor) {
            System.out.print(i + " - ");
        }
    }

}