package Exercicio3;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        AssistenteVirtual assistenteVirtual = new AssistenteVirtual();
        AssistenteFinanceiro assistenteFinanceiro = new AssistenteFinanceiro();

        System.out.println("Seja bem-vindo ao Chatbot!");

        int escolha;
        do {
            System.out.println("\nMENU DE OPÇÕES:");
            System.out.println("1) Assistente Virtual Geral");
            System.out.println("2) Assistente Financeiro");
            System.out.println("3) Sair");
            System.out.print("Escolha uma opção: ");
            escolha = scanner.nextInt();
            scanner.nextLine();

            switch (escolha) {
                case 1:
                    System.out.print("Digite sua pergunta: ");
                    String perguntaGeral = scanner.nextLine();
                    System.out.println("Assistente Virtual: " + assistenteVirtual.responderPergunta(perguntaGeral));
                    break;
                case 2:
                    System.out.print("Digite sua pergunta financeira: ");
                    String perguntaFinanceira = scanner.nextLine();
                    System.out.println("Assistente Financeiro: " + assistenteFinanceiro.responderPergunta(perguntaFinanceira));
                    break;
                case 3:
                    System.out.println("Encerrando programa. Até mais!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (escolha != 3);

        scanner.close();
    }
}