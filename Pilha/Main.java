public class Main {
    public static void main(String[] args) {
        Pilha pilha = new Pilha();

        // Adicionando elementos na Pilha
        pilha.push(5);
        pilha.push(4);
        pilha.push(3);
        pilha.push(2);
        pilha.push(1);

        // Removendo elementos da Pilha
        for (int i = 0; i < 5; i++) {
            if (!pilha.isEmpty()) {
                int element = pilha.pop();
                System.out.println("Desempilhado: " + element);
            }
        }

        // Erro de pilha vazia!
        int e = pilha.pop();
    }
}
