package Exercicio4;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        ListaRecomendacoes lista = new ListaRecomendacoes(10);
        Scanner scanner = new Scanner(System.in);
        int menu;

        System.out.println("Bem-vindo à Lista de Recomendações de Produtos!");

        do {
            System.out.println("\nEscolha:");
            System.out.println("1 - Adicionar produto");
            System.out.println("2 - Remover produto");
            System.out.println("3 - Obter produtos");
            System.out.println("4 - Verificar tamanho da lista");
            System.out.println("0 - Sair");

            System.out.print("Opção: ");
            menu = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (menu) {
                case 1:
                    System.out.print("Digite o nome do produto: ");
                    String produto = scanner.nextLine();
                    lista.adicionar(produto);
                    System.out.println("Produto adicionado!");
                    break;

                case 2:
                    System.out.print("Digite o nome do produto para remover: ");
                    String removerProduto = scanner.nextLine();
                    lista.remover(removerProduto);
                    System.out.println("Produto removido!");
                    break;

                case 3:
                    System.out.println("Lista de Produtos:");
                    if (lista.verificarTamanho() == 0) {
                        System.out.println("Nenhum produto na lista.");
                    } else {
                        for (int i = 0; i < lista.verificarTamanho(); i++) {
                            System.out.println("- " + lista.obter(i));
                        }
                    }
                    break;

                case 4:
                    System.out.println(lista.verificarTamanho() + " é o tamanho da lista!");
                    break;

                case 0:
                    System.out.println("Obrigado, volte sempre!");
                    break;

                default:
                    System.out.println("Opção inválida, tente novamente.");
                    break;
            }
        } while (menu != 0);

        scanner.close();
    }
}
