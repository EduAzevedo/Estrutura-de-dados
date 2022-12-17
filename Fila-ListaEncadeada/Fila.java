
public class Fila {
    private ListaEncadeada listaEncadeada;
    private int head;
    private int tail;
    

    public Fila() {
        listaEncadeada = new ListaEncadeada();
        this.head = 0;
        this.tail = 0;
    }

    public void queue(int n) {
        listaEncadeada.add(n);
        this.tail = (this.tail + 1) % this.listaEncadeada.getTamanho();
    }

    public int dequeue() {
        int itemRemovido = listaEncadeada.getNo(0).getDado();
        listaEncadeada.remove();
        return itemRemovido;

    }

    public boolean isEmpty() {
        return (this.listaEncadeada.isEmpty());
    }

}