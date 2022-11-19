public class Lista {
    private NoDuplo primeiroNo;
    private NoDuplo ultimoNo;
    private int tamanho;

    public NoDuplo getPrimeiroNo() {
        return this.primeiroNo;
    }

    public void setPrimeiroNo(NoDuplo primeiroNo) {
        this.primeiroNo = primeiroNo;
    }

    public NoDuplo getUltimoNo() {
        return this.ultimoNo;
    }

    public void setUltimoNo(NoDuplo ultimoNo) {
        this.ultimoNo = ultimoNo;
    }

    public int getTamanho() {
        return this.tamanho;
    }

    public void add(int novoValor) {
        NoDuplo novoNo = new NoDuplo(novoValor);
        if (this.primeiroNo == null && this.ultimoNo == null) {
            this.primeiroNo = novoNo;
            this.ultimoNo = novoNo;
        } else {
            this.ultimoNo.setNoSucessor(novoNo);
            novoNo.setNoAntecessor(this.ultimoNo);
            this.ultimoNo = novoNo;
        }
        this.tamanho++;
    }

    public void add(int posicao, int novoValor) {
        NoDuplo novoNo = new NoDuplo(novoValor);
        NoDuplo posDesejada = getNoDuplo(posicao - 2);
        // NoDuplo noAntecessor = posDesejada.getNoAntecessor();
        NoDuplo noSucessor = posDesejada.getNoSucessor();

        if (this.primeiroNo == null && this.ultimoNo == null) {

            this.primeiroNo = novoNo;
            this.ultimoNo = novoNo;
        } else if (posicao == 0) {
            System.out.println("Item adicionado no inicio!");
            novoNo.setNoSucessor(posDesejada);
            posDesejada.setNoAntecessor(novoNo);
            this.primeiroNo = novoNo;
        } else if (posicao == this.tamanho) {
            System.out.println("Item adicionado no fim!");
            novoNo.setNoAntecessor(this.ultimoNo);
            this.ultimoNo.setNoSucessor(novoNo);
            this.ultimoNo = novoNo;
        } else {
            System.out.println("Item adicionado no meio!");
            posDesejada.setNoSucessor(novoNo);
            noSucessor.setNoAntecessor(novoNo);
            novoNo.setNoSucessor(noSucessor);
            novoNo.setNoAntecessor(posDesejada);
        }
        this.tamanho++;
    }

    public void remover(int posicao) {
        NoDuplo noDesejado = getNoDuplo(posicao - 1);
        NoDuplo noAntecessor = noDesejado.getNoAntecessor();
        NoDuplo noSucessor = noDesejado.getNoSucessor();

        if (posicao > this.tamanho || posicao < 0) {
            System.out.println("Valor inválido!");
        } else if (posicao == 0) {
            System.out.println("Removeu o primeiro item!");
            noSucessor.setNoAntecessor(null);
            this.primeiroNo = noSucessor;
            noDesejado.setNoSucessor(null);
        } else if (posicao == this.tamanho) {
            System.out.println("Removeu o último item!");
            noAntecessor.setNoSucessor(null);
            noDesejado.setNoAntecessor(null);
            this.ultimoNo = noAntecessor;
        } else {
            System.out.println("Removeu item do meio!");
            noAntecessor.setNoSucessor(noSucessor);
            noSucessor.setNoAntecessor(noAntecessor);
            noDesejado.setNoSucessor(null);
            noDesejado.setNoAntecessor(null);
        }
        this.tamanho--;
    }

    public NoDuplo getNoDuplo(int posicao) {
        NoDuplo atual = this.primeiroNo;
        for (int i = 0; i < posicao; i++) {
            if (atual.getNoSucessor() != null) {
                atual = atual.getNoSucessor();
            }
        }
        return atual;
    }
}