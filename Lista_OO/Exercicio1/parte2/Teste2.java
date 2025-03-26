package parte2;
import java.util.Scanner;

public class Teste2 {
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

        Protegendo minhaCarteira = new Protegendo(enderecoCarteira, dono, saldoBitcoin);

        int escolha;
        do{
            System.out.println("\nMENU DE OPÇÕES:");
            System.out.println("1) Ver informações da carteira");
            System.out.println("2) Adicionar Bitcoins");
            System.out.println("3) Sacar Bitcoins");
            System.out.println("4) Mudar de dono");
            System.out.println("5) Sair");
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
                        break;
                    case 3:
                        System.out.print("Digite a quantidade de Bitcoins a sacar: ");
                        double sacar = scanner.nextDouble();
                        minhaCarteira.sacarBitcoin(sacar);
                        break;
                    case 4:
                        System.out.print("Digite o nome do novo dono: ");
                        String novoDono = scanner.next();
                        minhaCarteira.mudarDono(novoDono);
                        break;
                    case 5:
                        System.out.println("Encerrando programa. Até mais!");
                        break;
                    default:
                        System.out.println("Opção inválida.");
            } 
        }while (escolha != 5);

        scanner.close();
    }
}
