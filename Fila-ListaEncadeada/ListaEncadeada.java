public class ListaEncadeada {
    private No primeiroNo;
    private No ultimoNo;
    private int tamanho;

    public ListaEncadeada() {
        this.tamanho = 0;
    }

    public void add(int n) {
        No newNo = new No(n);
        if (this.primeiroNo == null && this.ultimoNo == null) {
            this.primeiroNo = newNo;
            this.ultimoNo = newNo;
        } else {
            this.ultimoNo.setProxNo(newNo);
            this.ultimoNo = newNo;
        }
        this.tamanho++;
    }

    public void remove() {
        this.primeiroNo = primeiroNo.getProxNo();
        this.tamanho--;
    }

    public No getNo(int posicao) {
        No atual = this.primeiroNo;
        for (int i = 0; i < posicao; i++) {
            if (atual.getProxNo() != null) {
                atual = atual.getProxNo();

            }
        }
        return atual;
    }

    public boolean isEmpty() {
        return (tamanho == 0);
    }

    public No getPrimeiro() {
        return primeiroNo;

    }

    public void setPrimeiro(No primeiro) {
        this.primeiroNo = primeiro;
    }

    public No getUltimo() {
        return ultimoNo;
    }

    public void setUltimo(No ultimo) {
        this.ultimoNo = ultimo;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
}
