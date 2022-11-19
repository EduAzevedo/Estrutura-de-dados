public class ListaLigada {
    private No primeiro;
    private No ultimo;
    private int tamanho;

    public ListaLigada() {
        this.tamanho = 0;
    }

    public No getPrimeiro() {
        return primeiro;

    }

    public void setPrimeiro(No primeiro) {
        this.primeiro = primeiro;
    }

    public No getUltimo() {
        return ultimo;
    }

    public void setUltimo(No ultimo) {
        this.ultimo = ultimo;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public void adicionar(String novoValor) {
        No novoNo = new No(novoValor);
        if (this.primeiro == null && this.ultimo == null) {
            this.primeiro = novoNo;
            this.ultimo = novoNo;

        } else {
            this.ultimo.setProxNo(novoNo);
            this.ultimo = novoNo;
        }
        this.tamanho++;

    }

    public void adicionar(int posicao, String novoValor) {
        No novoNo = new No(novoValor);

        if (posicao == 0) {
            System.out.println("Item adicionado no inicio!");
            novoNo.setProxNo(primeiro);
            this.primeiro = novoNo;
        } else if (posicao == this.tamanho) {
            System.out.println("Item adicionado no fim!");
            this.ultimo.setProxNo(novoNo);
            this.ultimo = novoNo;
        } else {
            System.out.println("Item adicionado no meio!");
            No temp = this.getNo(posicao - 1);
            No antecessor = this.getNo(posicao - 2);
            antecessor.setProxNo(novoNo);
            novoNo.setProxNo(temp);
        }
        this.tamanho++;
    }

    public void remover(String valor) {
        No anterior = null;
        No atual = this.primeiro;
        for (int i = 0; i < this.getTamanho(); i++) {
            if (atual.getValor().equalsIgnoreCase(valor)) {
                if (this.tamanho == 1) {
                    this.primeiro = null;
                    this.ultimo = null;
                } else if (atual == this.primeiro) {
                    this.primeiro = atual.getProxNo();
                    atual.setProxNo(null);
                } else if (atual == this.ultimo) {
                    this.ultimo = anterior;
                    anterior.setProxNo(null);
                } else {
                    anterior.setProxNo(atual.getProxNo());
                    atual = null;
                }

                this.tamanho--;
                break;
            }
            anterior = atual;
            atual = atual.getProxNo();
        }
    }

    public No getNo(int posicao) {
        No atual = this.primeiro;
        for (int i = 0; i < posicao; i++) {
            if (atual.getProxNo() != null) {
                atual = atual.getProxNo();

            }
        }
        return atual;
    }

}