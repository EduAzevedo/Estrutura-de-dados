import javax.management.RuntimeErrorException;

public class Pilha {
    int numeros[];
    int top;

    public Pilha() {
        numeros = new int[10];
        top = -1;
    }

    public void push(int e) {
        if (isFull()) {
            throw new RuntimeException("A pilha está cheia!");
        }
        top++;
        numeros[top] = e;
    }

    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("A pilha está vazia!");
        }
        int e;
        e = numeros[top];
        top--;
        return e;

    }

    public int top() {
        if (isEmpty()) {
            throw new RuntimeException("A pilha está vazia!");
        }
        return numeros[top];
    }

    public boolean isEmpty() {
        return (top == -1);

    }

    public boolean isFull() {
        return (top == 9);

    }
}