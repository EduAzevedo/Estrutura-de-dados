
public class Fila {
    private int elementos[];
    private int primeiro;
    private int ultimo;
    private int total;

    public Fila() {
        this.elementos = new int[10];
        this.primeiro = 0;
        this.ultimo = 0;
        this.total = 0;
    }

    public void queue(int n) {
        if (isFull()) {
            throw new IllegalStateException("Fila Cheia!");
        }
        elementos[this.ultimo] = n;
        this.ultimo = (this.ultimo + 1) % this.elementos.length;
        this.total++;

    }

    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Fila Vazia!");
        }
        int item = elementos[this.primeiro];
        this.primeiro = (this.primeiro + 1) % this.elementos.length;
        this.total--;
        return item;

    }

    public boolean isEmpty() {
        return (this.total == 0);
    }

    public boolean isFull() {
        return (this.total == elementos.length);
    }

}