public class Pilha {
    private int topo;
    private int[] dados; 

    public Pilha(){
        this(10);
    }
    public int getTopo() {
        return topo;
        
    }
    public int setTopo(int topo) {
        this.topo = topo;
        
        return topo;
    }
    public Pilha(int capacidade){
        setTopo(0);
        dados = new int[capacidade];
    }
    public boolean pilhaVazia (){
        return getTopo() == 0;
    }
    public boolean pilhaCheia(){
        return getTopo() == dados.length;
    }
    public boolean push (int elemento) {
        if (pilhaCheia()) return false;
        dados[topo++] = elemento;
        return true;
    }
    public int pop(){
        if (pilhaVazia()) return -1;
        return dados[--topo];
    }
    public int peak(){
        if (pilhaVazia()) return -1;
        // não estmos reduzindo o topo, só consultando
        return dados[getTopo()-1];
    }
}
