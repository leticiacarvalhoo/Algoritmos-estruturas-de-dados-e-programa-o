// listas ligadas

public class No{
    private int info;
    private No proximo;

    //estamos alocando uma caixa em momoria e dizendo que o ponteiro aponta para ninguem
    public No(int info){
        this.info = info;
        this.proximo = null;
    }

    public int getInfo() {
        return info;
    }
    public void setInfo(int info) {
        this.info = info;
    }

    public No getProximo() {
        return proximo;
    }
    public void setProximo(No proximo) {
        this.proximo = proximo;
    }

    @Override
    public String toString() {
        return "[" + info + "]";
    }

}