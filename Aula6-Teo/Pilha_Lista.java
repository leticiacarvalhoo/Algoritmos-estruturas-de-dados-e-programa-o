public class Pilha_Lista{
    private No topo;
    //lembrem-se, temos o construtor padrão herdado da classe Object
    public void push(char info){
        No novo = new No(info);
        if (!pilhaVazia()) {
            novo.setProximo(topo);
        }
        topo = novo;
    }

    public boolean pilhaVazia(){
        return topo == null;
    }

    public char pop(){
        if (pilhaVazia()){
            throw new RuntimeException("Pilha vazia fofete, falha no pop");
        }
        // char info = topo; ERRO GRAVEEEE porque a info é uma caixa que topo está referenciando
        char info = topo.getInfo();
        topo = getProximo(topo);
        return info;
    }

    public char peek(){
        //consulta o elemento do topo sem remover
        if (pilhaVazia()){
            throw new RuntimeException("Pilha vazia, não ha o que consultar");
        }
        return topo.getInfo();
    }

    public void invertePilha(){
        Pilha_Lista p = new Pilha_Lista();
        while (!pilhaVazia()) {
            p.push(this.pop());
        }
        this.topo = p.topo;
    }

}



class No{
    private char info;
    private No proximo;
    //nome do parametro é o mesmo do atributo. Isso é uma boa prática de programação, pois facilita a leitura do código.
    public No(char info) {
        this.info = info;
    }
    public char getInfo() {
        return info;
    }
    public void setInfo(char info) {
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
