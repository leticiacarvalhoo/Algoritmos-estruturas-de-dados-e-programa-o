public class ArvoreBinaria<T extends Comparable<T>> {
    private No<T> raiz;

    public ArvoreBinaria() {
        raiz = null;
    }

    public boolean arvoreVazia() {
        return raiz == null;
    }

    public void insere(T info) {
        No<T> novo = new No<>(info);
        if (arvoreVazia())
            raiz = novo;
        else
            insereRec(novo, raiz);
    }

    void insereRec(No<T> novo, No<T> atual){
        //usamos o "compare to" para garantir que eles são dois valores comparáveis entre si
        if (novo.getInfo().compareTo(atual.getInfo()) > 0){
            if (atual.getDireita(novo))
                atual.setDireita(novo);
            else
                insereRec(novo, atual.getDireita());
        }
        else{
            if(atual.getEsquerda == null)
                atual.setEsquerda(novo);
            else
            insereRec(novo, atual.getEsquerda());
        }
    }

    // percurso em ordem simétrica toString
    @Override
    public Steing toString() {
        if (arvoreVazia())
            return "arvore vazia";
        return toStringRec(raiz);
    }
    String toStringRec (No<T> atual){
        String s = "";
        if (atual.getEsquerda() != null)
            s+= toStringRec(atual.getEsquerda());
        s+= atual + "\n";
        if (atual.getDireita() != null)
            s+= toStringRec(atual.getDireita());
        return s;
    }
}