// modelo NUNCA tem print, pois não sabemos com qual tipo de interface estamos lidando

import java.util.Random;

public class NossoVetor{
    private int[] vetor;
    private int ocupacao;
    public NossoVetor (int tamanho){ 
        vetor = new int[tamanho];
        ocupacao = 0;
    }

    public NossoVetor() {
        this(10);
    }

    void redimensionaVetor(int novoTamanho){
        int[] temp = new int[novoTamanho];
        for (int i=0; i < ocupacao; i++) {
            temp[i] = vetor[i];
        }
        // temp é uma variavel local, fora daqui ele morre
        vetor = temp;
    }
    // void aumentaVetor(){
    //     int[] temp = new int[vetor.length*2];
    //     for (int i=0; i < ocupacao; i++) {
    //         temp[i] = vetor[i];
    //     }
    //     // temp é uma variavel local, fora daqui ele morre
    //     vetor = temp;
    // }
    // void reduzVetor(){
    //     int[] temp = new int[vetor.length/2];
    //     for (int i=0; i < ocupacao; i++) {
    //         temp[i] = vetor[i];
    //     }
    //     // temp é uma variavel local, fora daqui ele morre
    //     vetor = temp;
    public void insere (int i) {
        if (estaCheio())
            redimensionaVetor(vetor.length*2);
        vetor[ocupacao++] = i;
    }

    public boolean estaCheio() {
        return ocupacao == vetor.length;
    }

    public int remove() {
        if (!estaVazio()) {
            int aux = vetor[--ocupacao];
            if (vetor.length <= 6 && ocupacao <= vetor.length/4)
                redimensionaVetor(vetor.length / 2);
            return aux;
        }
        return -1;
    }
    public boolean estaVazio() {
        return ocupacao==0;
    }

    @Override
    public String toString() {
        String s = "ocupacao = " + ocupacao + "\n";
        for (int i=0; i < ocupacao; i++) {
            s += vetor[i] + " ";
        }
        return s + "\n";
    }

    public int getTamanho(){
        return vetor.length;
    }
    public void preencheVetor(){
        Random random = new Random();
        for (int i=0; i< vetor.length; i++){
            vetor[i] = random.nextInt(vetor.length * 10);
        }
        ocupacao= vetor.length;
    }
}	