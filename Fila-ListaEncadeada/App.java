public class App {
    public static void main(String[] args) {
        Fila fila = new Fila();

        fila.queue(0);
        fila.queue(1);
        fila.queue(2);
        fila.queue(3);
        fila.queue(4);
        fila.queue(5);

        for (int i = 0; i < 5; i++) {
            System.out.println("Removeu: " + fila.dequeue());
        } 
    }
}
