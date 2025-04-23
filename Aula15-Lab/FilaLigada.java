public class FilaLigada {
    private No primeiro;
    private No ultimo;
    //construtor padrão

    public boolean filaVazia(){
        return primeiro == null;
    }
    public void enfileira (int e) {
        No novo = new No(e);
        if (filaVazia())
            primeiro = novo;
        else
            ultimo.setProximo(novo);
        ultimo = novo;
    }
    public int desenfileira(){
        if (filaVazia()) throw new RuntimeException("falha na remocao");
        int temp = primeiro.getInfo();
        primeiro = primeiro.getProximo();
        // primeiro == null = filaVazia()
        // quando usamos filaVazia() estamops priorizando a legibilidade
        if (primeiro == null) // esvaziou fila
            ultimo = null; //evitar memory leak
        return temp;
    }
    @Override
    public String toString(){
        if (filaVazia()) return "fila vazia";
        String s = "";
        No runner = primeiro;
        while (runner != null){
            s = s + runner + "->";
            runner = runner.getProximo();
        }
        return s;
    }
}
class No {
    private int info;
    private No proximo;
    public No(int info){
        this.info = info;
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
    public String toString(){
        return "[" + info + "]";
    }
}
