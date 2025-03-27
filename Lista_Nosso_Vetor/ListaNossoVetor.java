import java.util.Random;

public class ListaNossoVetor{
    private int[] vetor;
    private int ocupacao;

    public ListaNossoVetor(int tamanho) {
        vetor = new int[tamanho];
        ocupacao = 0;
    }

    public ListaNossoVetor() {
        this(10);
    }

    void redimensionaVetor(int novoTamanho) {
        int[] temp = new int[novoTamanho];
        for (int i = 0; i < ocupacao; i++) {
            temp[i] = vetor[i];
        }
        // temp é uma variavel local, fora daqui ele morre
        vetor = temp;
    }

    public void insere (int i) {
        if (estaCheio())
            redimensionaVetor(vetor.length*2);
        vetor[ocupacao++] = i;
    }

    // FIZZ
    public void inserePosicao(int i, int posicao) {
        if (estaCheio())
            redimensionaVetor(vetor.length*2);
            for (int j = ocupacao; j > posicao; j--) {
                vetor[j] = vetor[j - 1];
            }   
            vetor[posicao] = i;
            ocupacao++;
    }

    // FIZZ
    public int quantasVezes(int i) {
        int contador = 0;
        if (estaVazio()) {
            throw new VetorVazioException("Vetor vazio, não há o que analisar");
        } else {
            for (int j = 0; j < ocupacao; j++) {
                if (vetor[j] == i) {
                    contador++;
                }
            }
        }
        return contador;
    }
    
    // FIZZ
    public int removePosicao(int posicao) {
        if (estaVazio()) {
            throw new VetorVazioException("Vetor vazio, não há o que analisar");
        }
        if (posicao < 0 || posicao >= ocupacao) {
            throw new IllegalArgumentException("Posição inválida. A posição deve estar entre 0 e " + (ocupacao - 1));
        }

        int elementoRemovido = vetor[posicao];

        for (int i = posicao; i < ocupacao - 1; i++) {
            vetor[i] = vetor[i + 1];
        }

        vetor[ocupacao - 1] = 0;
        ocupacao--;

        if (vetor.length >= 6 && ocupacao <= vetor.length / 4) {
            redimensionaVetor(vetor.length / 2);
        }
        return elementoRemovido;
    }

        // FIZZ
        public int removePrimeiraOcorrencia(int i, int valor) throws Exception {
            if (estaVazio()) {
                throw new VetorVazioException("Vetor vazio, não há o que analisar");
            } 
            else {
                for (i = 0; i < ocupacao; i++) {
                    if (vetor[i] == valor){
                        int elementoRemovido = vetor[i];

                        for (int j = i; j < ocupacao - 1; j++) {
                            vetor[j] = vetor[j + 1];
                        }
            
                        vetor[ocupacao - 1] = 0;
                        ocupacao--;

                        if (vetor.length >= 6 && ocupacao <= vetor.length / 4) {
                            redimensionaVetor(vetor.length / 2);
                        }

                        return i;
                    }
                }
            }
            throw new Exception("Elemento " + valor + " não encontrado.");
        }


    public boolean estaCheio() {
        return ocupacao == vetor.length;
    }

    public boolean estaVazio() {
        return ocupacao == 0;
    }

    public int remove() {
        if (estaVazio()) {
            VetorVazioException e = new VetorVazioException("Vetor vazio, não ha o que remover");
            throw e;
            // poderiamos fzer direto:
            // throw new VetorVazioException("Vetor vazio, não ha o que remover");
        }
        int aux = vetor[--ocupacao];
        if (vetor.length >= 6 && ocupacao <= vetor.length / 4) {
            redimensionaVetor(vetor.length / 2);
        }
        return aux;
    }

    public boolean contem(int elemento) {
        for (int i = 0; i < ocupacao; i++)
            if (vetor[i] == elemento)
                return true;
        return false;
    }

    public int indiceDe(int elemento) {
        if (estaVazio())
            throw new VetorVazioException("vetor esta vazio");
        for (int i = 0; i < ocupacao; i++)
            if (vetor[i] == elemento)
                return i;
        throw new ElementoNaoEcontradoException(elemento + " não encontrado");
    }

    @Override
    public String toString() {
        String s = "ocupacao = " + ocupacao + "\n";
        for (int i = 0; i < ocupacao; i++) {
            s += vetor[i] + " ";
        }
        return s + "\n";
    }

    public int getTamanho() {
        return vetor.length;
    }

    public void preencheVetor() {
        Random random = new Random();
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(vetor.length * 10);
        }
        ocupacao = vetor.length;
    }

    public void bubbleSort() {
        for (int i = 1; i < vetor.length; i++) {
            for (int j = 0; j < vetor.length - i; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                }
            }
        }
    }

    void selectionsort() {
        for (int i = 0; i < vetor.length - 1; ++i) {
            int min = i;
            for (int j = i + 1; j < vetor.length; ++j)
                if (vetor[j] < vetor[min])
                    min = j;
            int x = vetor[i];
            vetor[i] = vetor[min];
            vetor[min] = x;
        }
    }

    // https://www.toptal.com/developers/sorting-algorithms
    void insertionsort() {
        for (int j = 1; j < vetor.length; ++j) {
            int x = vetor[j];
            int i;
            for (i = j - 1; i >= 0 && vetor[i] > x; --i)
                vetor[i + 1] = vetor[i];
            vetor[i + 1] = x;
        }
    }

}

class VetorVazioException extends RuntimeException {
    public VetorVazioException(String msg) {
        super(msg); // pegamos uns construtir de uma classe de cima, da mãe. Se usamos "This", é de
                    // uma mesma classe
    }
}

class ElementoNaoEcontradoException extends RuntimeException {
    public ElementoNaoEcontradoException(String msg) {
        super(msg);
    }
}