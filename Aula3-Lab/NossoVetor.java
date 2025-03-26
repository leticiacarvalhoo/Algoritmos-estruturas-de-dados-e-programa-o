// modelo NUNCA tem print, pois não sabemos com qual tipo de interface estamos lidando

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
    void aumentaVetor(){
        int[] temp = new int[vetor.length*2];
        for (int i=0; i < vetor.length; i++) {
            temp[i] = vetor[i];
        }
        // temp é uma variavel local, fora daqui ele morre
        vetor = temp;
    }
    public void insere (int i) {
        if (estaCheio())
            aumentaVetor();
    }
    public boolean estaCheio() {
        return ocupacao == vetor.length;
    }
    public int remove() {
        if (!estaVazio())
            return vetor[--ocupacao];
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
}	