package parte1;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        String enderecoCarteira;
        String dono;
        double saldoBitcoin;
    
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Qual seu endereço de carteira?");
        enderecoCarteira = scanner.next();
        System.out.println("Qual seu nome?");
        dono = scanner.next();
        System.out.println("Com qual saldo deseja iniciar?");
        saldoBitcoin = scanner.nextDouble();

        CarteiraCripto minhaCarteira = new CarteiraCripto(enderecoCarteira, dono, saldoBitcoin);

        int escolha;
        do{
            System.out.println("\nMENU DE OPÇÕES:");
            System.out.println("1) Ver informações da carteira");
            System.out.println("2) Adicionar Bitcoins");
            System.out.println("3) Sacar Bitcoins");
            System.out.println("4) Sair");
            System.out.print("Escolha uma opção: ");
            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                        minhaCarteira.apresentarInfos();
                        break;
                    case 2:
                        System.out.print("Digite a quantidade de Bitcoins a adicionar: ");
                        double adicionar = scanner.nextDouble();
                        minhaCarteira.adicionarBitcoin(adicionar);
                        System.out.println("Novo saldo em Bitcoin: " + saldoBitcoin);
                        break;
                    case 3:
                        System.out.print("Digite a quantidade de Bitcoins a sacar: ");
                        double sacar = scanner.nextDouble();
                        if (sacar > saldoBitcoin) {
                            System.out.println("Operação inválida. Seu saldo é de: " + saldoBitcoin);
                        } else {
                            minhaCarteira.sacarBitcoin(sacar);
                            System.out.println("Novo saldo em Bitcoin: " + saldoBitcoin);
                        }
                        break;
                    case 4:
                        System.out.println("Encerrando programa. Até mais!");
                        break;
                    default:
                        System.out.println("Opção inválida.");
            } 
        }while (escolha != 4);

        scanner.close();
    }
}
