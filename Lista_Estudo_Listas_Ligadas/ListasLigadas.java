public class ListasLigadas {
    No primeiro;
    No ultimo;
    int tamanho = 0;

    public ListasLigadas() {
        primeiro = null;
        ultimo = null;
    }

    public int quantasVezes(int valor) {
        No atual = primeiro;
        int contador = 0;
        while (atual != null) {
            if (atual.getInfo() == valor) {
                contador++;
            }
            atual = atual.getProximo();
        }
        return contador;
    }

    public int devolvePrimeiraOcorrencia(int valor){
        No atual = primeiro;
        int contador = 0;
        while (atual != null) {
            if (atual.getInfo() == valor) {
                return contador;
            }
            atual = atual.getProximo();
            contador++;
        }
        return -1; 
    }

    public long somarElementos(){
        No atual = primeiro;
        long soma = 0;
        while (atual != null) {
            soma += atual.getInfo();
            atual = atual.getProximo();
        }
        return soma;
    }

    public void adiciona(int valor) {
        No novo = new No(valor); 
        if (primeiro == null) { 
            primeiro = novo;
            ultimo = novo;
        } else { 
            ultimo.setProximo(novo);
            ultimo = novo;
        }
        tamanho++; 
    }

    public ListasLigadas copiaLista() {
        ListasLigadas novaLista = new ListasLigadas(); 
        No atual = primeiro; 
    
        while (atual != null) {
            novaLista.adiciona(atual.getInfo()); 
            atual = atual.getProximo();
        }
        return novaLista; 
    }
    
    public void esvaziarLista() {
        primeiro = null; 
        ultimo = null; 
        tamanho = 0; 
    }

    public int getTamanho() {
        return tamanho; 
    }

    public int maiorElemento() {
        if (primeiro == null) { 
            return -1; 
        }
        int maior = primeiro.getInfo(); 
        No atual = primeiro.getProximo(); 
        while (atual != null) {
            if (atual.getInfo() > maior) {
                maior = atual.getInfo(); 
            }
            atual = atual.getProximo(); 
        }
        return maior; 
    }

    public int posicaoMaiorElemento(){
        if (primeiro == null) { 
            return -1; 
        }
        int posicaoAtual = 0;
        int posicaoMaior = 0;
        int maior = primeiro.getInfo(); 
        No atual = primeiro.getProximo();

        while (atual != null) {
            posicaoAtual++;
            if (atual.getInfo() > maior) {
                maior = atual.getInfo();
                posicaoMaior = posicaoAtual; 
            }
            atual = atual.getProximo();
        }
        return posicaoMaior;
    }

    public void inserePosicao(int valor, int posicao){

    }

    public void menorElementoPosicaoZero(){
        if (primeiro == null) { 
            return; 
        }
        int menor = primeiro.getInfo(); 
        No atual = primeiro.getProximo();

        while (atual != null) {
            if (atual.getInfo() < menor) {
                menor = atual.getInfo();
            }
            atual = atual.getProximo(); 
        }
        primeiro.setInfo(menor);
    }

    public void removePosicao(int posicao) {
        if (posicao < 0 || posicao >= tamanho) { 
            return; 
        }
        
        if (posicao == 0) { 
            primeiro = primeiro.getProximo(); 
            if (primeiro == null) { 
                ultimo = null; 
            }
        } else {
            No atual = primeiro;
            for (int i = 0; i < posicao - 1; i++) {
                atual = atual.getProximo(); 
            }
            No removido = atual.getProximo(); 
            atual.setProximo(removido.getProximo()); 
            if (removido == ultimo) { 
                ultimo = atual; 
            }
        }
        tamanho--; 
    }

}
