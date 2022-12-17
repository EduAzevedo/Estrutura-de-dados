
public class Fila {
    private int elements[];
    private int head;
    private int tail;
    private int size;

    public Fila() {
        this.elements = new int[10];
        this.head = 0;
        this.tail = 0;
        this.size = 0;
    }

    public void queue(int n) {
        if (isFull()) {
            throw new IllegalStateException("Queue is full!");
        }
        elements[this.tail] = n;
        this.tail = (this.tail + 1) % this.elements.length;
        this.size++;

    }

    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty!");
        }
        int item = elements[this.head];
        this.head = (this.head + 1) % this.elements.length;
        this.size--;
        return item;

    }

    public boolean isEmpty() {
        return (this.size == 0);
    }

    public boolean isFull() {
        return (this.size == elements.length);
    }

}