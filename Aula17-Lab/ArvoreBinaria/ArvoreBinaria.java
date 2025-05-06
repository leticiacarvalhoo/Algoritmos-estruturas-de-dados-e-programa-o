public class ArvoreBinaria {
    private No raiz;

    public boolean arvoreVazia() {
        return raiz == null;
    }

    public void insere(int info) {
        No novo = new No(info);
        if (arvoreVazia()) {
            raiz = novo;
        } else {
            insereRec(novo, raiz);
        }
    }

    public void insereOcorrencias(int info) {
        if(arvoreVazia()){
            raiz = new NoOcorrencias(info);
        }
        else{
            raiz = new NoOcorrencias(info);
        }
    }

    public void insereRec(No novo, No atual) {
        if (novo.getInfo() > atual.getInfo()) {
            if (atual.getDireita() == null)
                atul.setDireita(novo);
            else
                insereRec(novo, atual.getDireita());
        } else {
            if (atual.getEsquerda() == null)
                atul.setEsquerda(novo);
            else
                insereRec(novo, atual.getEsquerda());
        }
    }
    void insereOcorrenciasRec (int info, No atual){
        if (info == atual.getInfo()){

        }
        else if(info > atual.getInfo()){

        }
        else{
            
        }
    }

    @Override
    public String toString() {
        if (arvoreVazia())
            return "arvore vazia";
        return toString(raiz);
    }

    private String toStringRec(No atual) {
        String s = "";
        if (atual.getEsquerda() != null)
            s = s + toStringRec(atual.getEsquerda());
        s = s + atual + " ";
        if (atual.getDireita() != null)
            s = s + toStringRec(atual.getDireita());
        return s;
    }
}