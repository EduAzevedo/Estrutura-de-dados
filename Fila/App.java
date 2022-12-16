public class App {
    public static void main(String[] args) {
        Fila fila = new Fila();

        fila.queue(1);
        fila.queue(2);
        fila.queue(3);
        fila.queue(4);
        fila.queue(5);


        while (!fila.isEmpty()) {
            int x = fila.dequeue();
            System.out.println("Item removido: " + x);
        }

    }
}
