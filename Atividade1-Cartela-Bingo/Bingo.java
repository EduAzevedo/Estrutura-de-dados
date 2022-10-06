import java.util.Scanner;

class Bingo {
    public static void main(String[] args) {
        Cartela cartelas[] = new Cartela[10];
        CartelaSemRepeticao cartelasSemRepeticao[] = new CartelaSemRepeticao[10];
        Scanner sc = new Scanner(System.in);
        int option = 0;

        menu();
        option = sc.nextInt();

        switch (option) {
            case 1:
                // Gerar Cartelas(sem verificação de repetições)
                for (int i = 0; i < cartelas.length; i++) {
                    cartelas[i] = new Cartela(5);
                }

                // Exibir Cartelas(sem verificação de repetições)
                for (int i = 0; i < cartelas.length; i++) {
                    System.out.println("========= Cartela " + (i + 1) + " =========");
                    cartelas[i].showNumbers();
                    System.out.println("");
                }
                break;

            case 2:
                // Gerar Cartelas(com verificação de repetições)
                for (int i = 0; i < cartelasSemRepeticao.length; i++) {
                    cartelasSemRepeticao[i] = new CartelaSemRepeticao(5);

                }

                // Exibir Cartelas(com verificação de repetições)
                for (int i = 0; i < cartelasSemRepeticao.length; i++) {
                    System.out.println("========= Cartela " + (i + 1) + " =========");
                    cartelasSemRepeticao[i].showNumbers();
                    System.out.println("");
                }
                break;
        }

        sc.close();

    }

    private static void menu() {
        System.out.println("1 - Sem verifição de repetição\n2 - Com verifição de repetição");
    }
}