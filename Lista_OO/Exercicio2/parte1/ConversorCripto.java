// Crie uma classe ConversorCripto que permite converter valores entre diferentes criptomoedas e moedas fiduciárias.
// Implemente três métodos sobrecarregados converter():

//      1. converter(double btc) → Converte um valor em Bitcoin (BTC) para Dólar
//      (USD), assumindo uma taxa de conversão fixa.

//      2. converter(double btc, String paraCripto) → Converte Bitcoin para outra
//      criptomoeda (exemplo: Ethereum).

//      3. converter(double valorReais, double precoBTC) → Converte um valor em
//      Reais (BRL) para Bitcoin, considerando um preço dinâmico para o BTC.

package Exercicio2.parte1;

import java.util.Scanner;

public class ConversorCripto {

    private final double taxa_conversao_usd = 20000.0;
    private final double taxa_conversao_eth = 15.0; 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConversorCripto conversor = new ConversorCripto();
 
        System.out.println("Digite um valor em BTC para converter para USD: ");
        double btc = scanner.nextDouble();
        double valorEmDolares = conversor.converter(btc);
        System.out.println(btc + " BTC é equivalente a: " + valorEmDolares + " USD");

        System.out.println("Digite um valor em BTC para converter para outra criptomoeda (ex: ETH): ");
        btc = scanner.nextDouble();
        System.out.println("Digite a criptomoeda para a qual deseja converter (ex: ETH): ");
        String paraCripto = scanner.next();
        double valorEmCripto = conversor.converter(btc, paraCripto);
        System.out.println(btc + " BTC é equivalente a: " + valorEmCripto + " " + paraCripto);

        System.out.println("Digite um valor em Reais (BRL) para converter para BTC: ");
        double valorReais = scanner.nextDouble();
        System.out.println("Digite o preço atual do BTC: ");
        double precoBTC = scanner.nextDouble();
        double valorEmBTC = conversor.converter(valorReais, precoBTC);
        System.out.println(valorReais + " BRL é equivalente a: " + valorEmBTC + " BTC");

        scanner.close(); 
    }

    public double converter(double btc) {
        return btc * taxa_conversao_usd;
    }

    public double converter(double btc, String paraCripto) {
        double taxaConversao = 0.0;

        switch (paraCripto.toUpperCase()) {
            case "ETH":
                taxaConversao = taxa_conversao_eth;
                break;
            default:
                System.out.println("Criptomoeda não cadastrada.");
                return 0.0;
        }

        double valorConvertido = btc * taxaConversao;
        System.out.println("Convertendo para " + paraCripto + ", fica: " + valorConvertido);
        return valorConvertido;
    }

    public double converter(double valorReais, double precoBTC) {
        return valorReais / precoBTC; 
    }
}