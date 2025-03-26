// quando referenciamos um objeto, o objeto NUNCA SERÁ nulo, apenas algum atributo dele pode ser

import javax.management.RuntimeErrorException;

public class ListaSimplesCopia {
    private No primeiro;
    private No ultimo;

    //vamos usar o construtor padrao: primeiro = null e ultimo = null
    public boolean estaVazia() {
        return primeiro == null;
    }
    public void insereInicio(int elemento) {
        No novo = new No(elemento);
        if (estaVazia()){
            ultimo = novo;
        }
        else{
            novo.setProximo(primeiro);
        }
        primeiro = novo;
    }
    public int removeInicio(){
        if (estaVazia()){
            throw new RuntimeException("lista vazia, nao ha oq remover");
        }
        int elemento = primeiro.getInfo();
        primeiro = primeiro.getProximo();

        if (primeiro==null){
            ultimo = null;
        }
        return elemento;
    }
    @Override
    public String toString() {
        String s = "lista";
        if(estaVazia()){
            s += " está vazia";
        }
        else{
            No runner = primeiro;
            while (runner != null){ //vai até o final da lista (coiote)
                s += runner + "->";
                runner = runner.getProximo();
            }
            s += "\\\\";
        }
        return s + "\n";
    }
    public void insereFim(int elemento){
        No novo = new No(elemento);
        if (estaVazia()) {
            primeiro = novo;
        } else {
            ultimo.setProximo(novo);
        }
        ultimo = novo;
    }
}

