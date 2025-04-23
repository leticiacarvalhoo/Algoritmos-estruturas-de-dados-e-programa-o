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
        if (fileCheia()) throw new RuntimeException("falha na insercao");
        dados[ultimo++] = e;
        ultimo = proximaPosicao(ultimo);
        ocupacao++;
    }
    public int desenfileira(int e){
        if (filaVazia()) throw new RuntimeException("falha na remocao");
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
        return s;
    }

    public String stringVetor(){
        int i=0;
        String s = "";
        if (filaVazia())
            for (i=0; i<dados.length; i++)
            s = s + "_ ";
        else if(fileCheia()){
            for (i=0; i<dados.length; i++)
            s = s + dados[i] + " ";
        }
        else if(primeiro<ultimo){
            for (i=0; i < primeiro; i++){
                s = s + "_ ";
            }
            for(i=primeiro; i<ultimo; i++){
                s = s + dados[i] + " ";
            }
            for(i=ultimo; i<dados.length; i++){
                s = s + "_ ";
            }
        }
        else{
            for (i=0; i < ultimo; i++){
                s = s + dados[i] + " ";
            }
            for(i=ultimo; i<primeiro; i++){
                s = s + "_ ";
            }
            for(i=ultimo; i<dados.length; i++){
                s = s + dados[i] + " ";
            }
        }
        return s;
    }

}
