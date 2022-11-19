public class NoDuplo {
    private NoDuplo noAntecessor;
    private NoDuplo noSucessor;
    private int valor;

    public NoDuplo(int novoValor) {
        this.valor = novoValor;
    }

    public NoDuplo getNoAntecessor() {
        return this.noAntecessor;
    }

    public void setNoAntecessor(NoDuplo noAntecessor) {
        this.noAntecessor = noAntecessor;
    }

    public NoDuplo getNoSucessor() {
        return this.noSucessor;
    }

    public void setNoSucessor(NoDuplo noSucessor) {
        this.noSucessor = noSucessor;
    }

    public int getValor() {
        return this.valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

}