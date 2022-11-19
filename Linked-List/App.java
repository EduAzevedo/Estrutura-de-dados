
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
        System.out.println("Tamanho da lista: " + lista.getTamanho());
        for (int i = 0; i < lista.getTamanho(); i++) {
            System.out.println(i + ": " + lista.getNo(i).getValor());
        }
        System.out.println("===========================");
        System.out.println();
        System.out.println("Impressão 2:");

        // Remover itens da lista
        lista.remover("Sergipe");
        lista.remover("Ceará");

        //Adiciona no fim
        lista.adicionar("São Paulo");
        //Adiciona onnde quiser
        lista.adicionar(1, "Maranhao");

        
        for (int i = 0; i < lista.getTamanho(); i++) {
            System.out.println(i + ": " + lista.getNo(i).getValor());
        }
        System.out.println("Tamanho da lista: " + lista.getTamanho());
  
    }
}
