public class BubbleSort {
    public static void main(String args[]) {
        int[] vetor = { 5, 2, 4, 3, 0, 9, 7, 8, 1, 6 };

        ordenar(vetor);
        for (int num : vetor) {
            System.out.print(num + " ");
        }

    }

    public static void ordenar(int[] v) {
        for (int i = 0; i < v.length - 1; i++) {
            for (int j = 0; j < v.length - 1 - i; j++) {
                if (v[j] > v[j + 1]) {
                    int aux = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = aux;
                }
            }
        }
    }
}