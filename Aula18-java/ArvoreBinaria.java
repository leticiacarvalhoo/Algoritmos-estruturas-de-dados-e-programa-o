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
                atual.setDireita(novo);
            else
                insereRec(novo, atual.getDireita());
        } else {
            if (atual.getEsquerda() == null)
                atual.setEsquerda(novo);
            else
                insereRec(novo, atual.getEsquerda());
        }
    }
    void insereOcorrenciasRec (int info, No atual){
        if (info == atual.getInfo()){
            NoOcorrencias noOcorrencias = (NoOcorrencias)atual;
            //noOcorrencias.setOcorrencias(noOcorrencias.getOcorrencias() + 1);
            //podemos deixar mais bonito:
            noOcorrencias.incrementaOcorrencias();
        }
        else if(info > atual.getInfo()){
            if (atual.getDireita() == null)
                atual.setDireita(new NoOcorrencias(info));
            else
                insereOcorrencias(info, atual.getDireita());
        }
        else{
            if (atual.getEsquerda() == null)
                atual.setEsquerda(new NoOcorrencias(info));
            else
                insereOcorrencias(info, atual.getEsquerda());
        }
    }
    //percursao em ordem simetrica para construir o toString
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

    public int altura(){
        if(arvore() || raiz.getdireita() == null && raiz.getEsquerda() == null)
            return 0;
        return alturaRec(raiz);
    }
    public int alturaRec(No atual){
        //if(atual == null || atual.getDireita() == null && atual.getEsquerda() == null)
        if(atual == null)
            if (atual.getDireita() == null && atual.getEsquerda() == null)
                return 0;
        int alturaEsq = alturaRec(atual.getEsquerda());
        int alturaDir = alturaRec(atual.getEsquerda());
        return alturaDir > alturaEsq ? alturaDir + 1 : alturaEsq + 1;

        //baixo acoplamento
    }
}