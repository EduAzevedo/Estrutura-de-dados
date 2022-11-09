public class QuickSort {
    public static void main(String[] args) {
        int[] vetor = new int[10];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) Math.floor(Math.random() * vetor.length);
        }

        System.out.println("Desordenado");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }

        quicksort(vetor, 0, vetor.length - 1);
        System.out.println("");

        System.out.println("Ordenado");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }

    }
    
    static void quicksort(int[] vetor, int left, int right) {
        if (left < right) {
            int pivot = particao(vetor, left, right);
            quicksort(vetor, left, pivot);
            quicksort(vetor, pivot + 1, right);
        }
    }

    static int particao(int[] vetor, int left, int right) {
        int middle = (int) (left + right)
                / 2;
        int pivot = vetor[middle];
        int i = left - 1;
        int j = right + 1;

        while (true) {
            do {
                i++;

            } while (vetor[i] < pivot);
            do {
                j--;
            } while (vetor[j] > pivot);
            if (i >= j) {
                
                return j;
            }
            int aux = vetor[i];
            vetor[i] = vetor[j];
            vetor[j] = aux;
        }
    }
}