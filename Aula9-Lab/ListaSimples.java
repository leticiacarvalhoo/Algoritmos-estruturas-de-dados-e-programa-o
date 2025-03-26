import javax.management.RuntimeErrorException;

public class ListaSimples {
    private No primeiro;
    //vamos usar o construtor padrao: primeiro = null
    public boolean estaVazia() {
        return primeiro == null;
    }
    public void insereInicio(int elemento) {
        No novo = new No(elemento);
        if (!estaVazia()){
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
            No runner = primeiro;
            while (runner.getProximo() != null) { // vai até o ultimo da lista (papaleguas)
                runner = runner.getProximo();
            }
            runner.setProximo(novo);
        }
    }
}
