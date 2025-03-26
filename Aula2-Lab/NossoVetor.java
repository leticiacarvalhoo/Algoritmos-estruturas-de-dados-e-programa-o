public class NossoVetor {
    private int[] vetor;
    private int ocupacao;
    public NossoVetor (int tamanho){
        vetor = new int[tamanho];
        //por clareza, já que todos iniciam com valor 0
        ocupacao = 0;
    }
    public NossoVetor() {
        this(10); //chamada de um construtor dentro de outro
    }
    public void insere (int i) {
        // poderia escrever tambem: vetor [ocupacao++] = i;
        if (!estaCheio())
            vetor[ocupacao] = i;
            ocupacao ++;
    }
    public boolean estaCheio() {
        // poderia escrever return ocupacao == vetor.length

        // alem disso, poderiamos fazer o teste assim:
        // if (ocupacao == vetor.length)
        //     return true;
        // return false;

        //mas de uma forma simplificada, ficaria assim:
        return ocupacao == vetor.length;
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