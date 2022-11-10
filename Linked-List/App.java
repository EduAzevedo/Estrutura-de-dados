public class App {
    public static void main(String[] args) throws Exception {
        ListaLigada lista = new ListaLigada();

        // Adicionar itens a lista
        lista.adicionar("Sergipe");
        lista.adicionar("Bahia");
        lista.adicionar("Ceará");
        lista.adicionar("Distrito Federal");

        System.out.println("Tamanho da lista: " + lista.getTamanho());
        System.out.println("Primeiro item: " + lista.getPrimeiro().getValor());
        System.out.println("Último item: " + lista.getUltimo().getValor());

        System.out.println();

        System.out.println("Impressão 1:");
        for (int i = 0; i < lista.getTamanho(); i++) {
            System.out.println(i + ": " + lista.getNo(i).getValor());
        }
        System.out.println("===========================");
        System.out.println();
        System.out.println("Impressão 2:");

        // Remover e adicionar itens a lista
        lista.remover("Sergipe");
        lista.remover("Ceará");

        lista.adicionar("Amazonas");
        System.out.println("Tamanho da lista: " + lista.getTamanho());
        for (int i = 0; i < lista.getTamanho(); i++) {
            System.out.println(i + ": " + lista.getNo(i).getValor());
        }
        System.out.println("===========================");

        System.out.println();
    }
}
