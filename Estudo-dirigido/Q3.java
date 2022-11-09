public class Q3 {
    /* Altere as questões anteriores para utilizar o método recursivo */
    public static void main(String[] args) {
        double vetor[] = { 1.0, 22.1, 32.0, 2.4, 7.1, 2.0, 9.5, 10.0, 84.1, 65.0 };
        int vetorSoma[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        // Q1
        int totalInt = isInt(vetor, 0);
        System.out.println("Total de números inteiros: " + totalInt);

        // Q2
         int result = somarVetor(vetorSoma, 0);
         System.out.println("Soma total: " + result);
    }

    // Q1
    public static int isInt(double vetor[], int aux) {
        int totalInt = 0;

        if (aux < vetor.length) {
            if (vetor[aux] == (int) vetor[aux]) {
                totalInt++;
            }
            return totalInt + isInt(vetor, aux + 1);

        } else {
            return 0;
        }

    }

    // Q2
    public static int somarVetor(int vetor[], int aux) {

        if (aux < vetor.length) {
            return vetor[aux] + somarVetor(vetor, aux + 1);
        } else {
            return 0;
        }

    }
}
