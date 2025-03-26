// objetos = instancias concretas construidas de acordo com os modelos (classes)
// pacotes que definem os conjuntos de informações e procedimentos qur podem ser executados neles

// classe = modelo 

// instâncias = ocorrencias concretas

// mais fechado para mais aberto:
// private -> defaut -> protected -> public

// construtor = metodo compilado de inicialização de construção de objetos

// https://docs.oracle.com/javase/8/docs/ 


public class NossoVetor {
    private int[] vetor;
    private int ocupacao;
    public NossoVetor (int tamanho){
        vetor = new int[tamanho];
        //por clareza, já que todos iniciam com valor 0
        ocupacao = 0;
    }
    public NossoVetor() {
        new NossoVetor (10);
    }
    public void insere (int i) {
        // poderia escrever tambem: vetor [ocupacao++] = i;
        vetor[ocupacao] = i;
        ocupacao ++;
    }
    public boolean estaCheio() {
        // poderia escrever return ocupacao == vetor.length
        if (ocupacao == vetor.length)
            return true;
        return false;
    }
}