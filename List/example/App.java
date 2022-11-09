import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();

        // A lista é iniciada com 0 de tamanho.
        System.out.println("Tamanho da lista(início): " + lista.size());
        System.out.println();

        // O método .add() é o responsável por adicionar um item a lista.
        lista.add(2);
        // Também é possível especificar onde quer adicionar o item, basta adicionar
        // mais um parametro no método
        // EX: .add(index, item) / .add(posição da lista: 3, item: 2).
        // A posição especificada deve existir previamente, é óbvio.
        lista.add(0, 3);

        // Ao adicionar um item a lista aumenta o seu tamanho.
        // O tamanho da lista aumentou.
        System.out.println("Tamanho da lista(após adicionar item): " + lista.size());
        // Imprimindo o valor adicionado na primeira posição(0) com o método
        // .get(posição).
        System.out.println("Item adicionado na posição 0: " + lista.get(0));

        System.out.println();
        // Removendo item da lista quando se o valor é conhecido e desejado.
        lista.remove(0);
        // O tamanho da lista diminuiu após a remoção.
        System.out.println("Tamanho da lista(após remover item): " + lista.size());

        // O método .addAll() adiciona todos os itens de uma lista(B) para o final da
        // lista(A)
        // desejada
        // na mesma ordem que eles estão organizados dentro da lista(B)
        List<Integer> listaA = new ArrayList<>();
        List<Integer> listaB = new ArrayList<>();
        // Adicionando valores a lista (A)
        listaA.add(1);
        listaA.add(2);
        listaA.add(3);
        // Adicionando valores a lista (B)
        listaB.add(4);
        listaB.add(5);
        listaB.add(6);
        // Adicionando valores da lista (B) para dentro da lista (A)
        listaA.addAll(listaB);

        // Imprimindo Lista (A) após adicionar itens da lista (B)
        for (Integer element : listaA) {
            System.out.print(element + " ");
        }

        System.out.println();

        // Para copiar alguns itens de uma lista(A) para outra lista(B) basta utilizar o
        // método .sublist(De, Até);
        List<Integer> tempLista = listaA.subList(0, 3);
        for (Integer element : tempLista) {
            System.out.print(element + " ");
        }
        System.out.println();

        // Para remover itens especificos basta utilizar o método .removeIf(n -> (n ==
        // valor desejado)) || .removeIf(n -> (n != valor desejado))
        // Funciona com qualquer tipo de valor, incluíndo Strings
        // É uma função do tipo Lambda.
        // O (n) é apenas o elemento da lista
        listaA.removeIf(n -> (n == 4));
        for (Integer element : listaA) {
            System.out.print(element + " ");
        }
    }

}