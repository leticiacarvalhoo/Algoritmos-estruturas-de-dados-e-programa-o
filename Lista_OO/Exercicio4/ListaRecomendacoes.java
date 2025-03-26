// Crie uma classe ListaRecomendacoes<T> que funciona como uma lista dinâmica para armazenar recomendações personalizadas de produtos.
// A classe deve possuir:
//      • Um array interno para armazenar os elementos.
//      • Um contador de tamanho.
//      • Métodos para adicionar, remover, obter um item e verificar o tamanho da lista.

package Exercicio4;

public class ListaRecomendacoes {
    private String[] produtos;
    private int ocupacao;

    public ListaRecomendacoes(int tamanho) {
        produtos = new String[tamanho];
        ocupacao = 0;
    }

    public void adicionar(String produto) {
        produtos[ocupacao] = produto;
        ocupacao++;
    }

    public void remover(String produto){
        for (int i = 0; i < ocupacao; i++) {
            if (produtos[i].equals(produto)) {
                for (int j = i; j < ocupacao - 1; j++) {
                    produtos[j] = produtos[j + 1];
                }
                produtos[ocupacao - 1] = null;
                ocupacao--;
                return;
            }
        }
    }

    public String obter(int indice) {
        if (indice >= 0 && indice < ocupacao) {
            return produtos[indice];
        }
        return null;
    }

    public int verificarTamanho() {
        return ocupacao;
    }
}
