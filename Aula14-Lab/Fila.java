import java.util.Arrays;

public class Fila {
    int[] dados;
    int primeiro, ultimo, ocupacao;

    public Fila(int capacidade){
        primeiro=0;
        ultimo=0;
        ocupacao=0;
        dados = new int[capacidade];
    }
    public Fila(){
        this(10);
    }

    public boolean filaVazia(){
        return ocupacao==0;
    }
    public boolean fileCheia(){
        return ocupacao == dados.length;
    }
    private int proximaPosicao(int posicao){ //permite o comportamento circular do vetor
        return (posicao + 1) % dados.length;
    }
    public void enfileira (int e){
        if (fileCheia()) throw new RuntimeException("fila cheia");
        dados[ultimo++] = e;
        ultimo = proximaPosicao(ultimo);
        ocupacao++;
    }
    public int desenfileira(int e){
        if (filaVazia()) throw new RuntimeException("fila vazia");
        int aux = dados[primeiro];
        primeiro = proximaPosicao(primeiro);
        ocupacao--;
        return aux;
    }
    @Override
    public String toString() {
        if (filaVazia()) throw new RuntimeException("fila vazia");
        String s = "";
        for (int i=primeiro, cont=0; cont<ocupacao; i=proximaPosicao(i), cont++){
            s = s + dados[i] + " ";
        }
        return s + "\n";
    }

}
