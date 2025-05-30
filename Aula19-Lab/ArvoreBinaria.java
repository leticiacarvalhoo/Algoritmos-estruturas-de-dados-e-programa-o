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
            insereOcorrenciasRec(info, raiz);
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

    public void removeValor(int info){
        if (arvoreVazia()) throw new RuntimeException("falha n remocao");
        if (info == raiz){
            if (raiz.getEsquerda() == null && raiz.getDireita() == null){
                raiz = null;
            }
            else if (raiz.getEsquerda() == null){
                //só tem filho da direita
                raiz = raiz.getDireita();
            }
            else if(raiz.getDireita() == null){
                // só tem filho da esquerda
                raiz = raiz.getEsquerda();
            }
            else{
                //só tem dois filhos
                No noSucessor = sucessor(raiz);
                sucessor.setEsquerda(raiz.getEsquerda());
                raiz = noSucessor;
            }
        }
        else if ( info > raiz.getInfo()){
            removeValorRec(info, raiz.getDireita(), raiz, true);
        }
        else{
            removeValorRec(info, raiz.getEsquerda(), raiz, false);
        }
    }

    private void removeValorRec(int info, No atual, No pai, boolean eFilhoDireito){
        if (info == atual.getInfo()){
            if(atual.getDireita() == null && atual.getEsquerda() == null){
                if (eFilhoDireito)
                    pai.setDireita(null);
                else
                    pai.setEsquerda(null);
            }
            else if(atual.getDireita() == null){
                if(eFilhoDireito)
                    pai.setDireita(atual.getEsquerda());
                else
                    pai.setEsquerda(atual.getEsquerda());
            }
            else if(atual.getEsquerda() == null){
                if(eFilhoDireito)
                    pai.setDireita(atual.getDireita());
                else
                    pai.setEsquerda(atual.getDireita());
            }
            else{
                //sucessor é o menor valor maior que info
                No sucNo = sucessor(atual);
                sucNo.setEsquerda(atual.getEsquerda());
                if (eFilhoDireito)
                    pai.setDireita(sucNo);
                else
                    pai.setEsquerda(sucNo);
            }
        }
        else if(info > atual.getInfo()){
            removeValorRec(info, atual.getDireita(), atual, true);
        }
        else{
            removeValorRec(info, atual.getEsquerda(), atual, false);
        }
    }
    private No sucessor (No atual){
        No sucNo = atual.getDireita();
        No runner = sucNo.getEsquerda();
        No pai =  null;
        while (runner != null){
            pai =  sucNo;
            sucNo = runner;
            runner = runner.getEsquerda();
        }
        if (sucNo != atual.getDireita()){
            pai.setEsquerda(sucNo.getDireita());
            sucNo.setDireita(atual.getDireita());
        }
        return sucNo;
    }



}
