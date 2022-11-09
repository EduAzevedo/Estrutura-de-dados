public class MergeSort {
    public static void main(String[] args) {
        int[] numeros = {6, 2, 21, 4, 12, 0, 1, 32, 3, 5};

        mergeSort(0, numeros.length, numeros);

        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
    }


    public static void mergeSort(int inicio, int fim, int[] vetor) {

        if(inicio < fim - 1) {

            int meio = (inicio + fim) / 2;
            mergeSort(inicio, meio, vetor);

            mergeSort(meio, fim, vetor);

            intercala(vetor, inicio, meio, fim);
        }
    }

    public static void intercala(int[] vetor, int inicio, int meio, int fim) {

        int novoVetor[] = new int[fim - inicio];

        int i = inicio;

        int m = meio;

        int pos = 0;


        while(i < meio && m < fim) {

            if(vetor[i] <= vetor[m]) {
                novoVetor[pos] = vetor[i];
                pos = pos + 1;
                i = i + 1;

            } else {
                novoVetor[pos] = vetor[m];
                pos = pos + 1;
                m = m + 1;
            }
        }

        while(i < meio) {
            novoVetor[pos] = vetor[i];
            pos = pos + 1;
            i = i + 1;
        }


        while(m < fim) {
            novoVetor[pos] = vetor[m];
            pos = pos + 1;
            m = m + 1;
        }

        for(pos = 0, i = inicio; i < fim; i++, pos++) {
            vetor[i] = novoVetor[pos];
        }
    }
}
