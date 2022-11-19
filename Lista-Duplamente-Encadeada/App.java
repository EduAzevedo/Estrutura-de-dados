public class App {
    public static void main(String[] args) {
        Lista lista = new Lista();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);
        for (int i = 0; i < lista.getTamanho(); i++) {

            System.out.println((i+1) + ": " + lista.getNoDuplo(i).getValor());
        }
       
        System.out.println("Tamanho da lista: " + lista.getTamanho());
        
        System.out.println("===============================================");

        lista.add(3, 7);
        for (int i = 0; i < lista.getTamanho(); i++) {

            System.out.println(i + ": " + lista.getNoDuplo(i).getValor());
        }
        System.out.println("Tamanho da lista: " + lista.getTamanho());
        System.out.println("===============================================");
        lista.remover(2);
        for (int i = 0; i < lista.getTamanho(); i++) {

            System.out.println(i + ": " + lista.getNoDuplo(i).getValor());
        }
        System.out.println("Tamanho da lista: " + lista.getTamanho());
    }
}