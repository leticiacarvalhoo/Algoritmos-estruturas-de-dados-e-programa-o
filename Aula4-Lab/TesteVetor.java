import java.util.Scanner;

public class TesteVetor {
    static Scanner scanner;

    static int menu() {
        System.out.println("\nEscolha:");
        System.out.println("1 para inserir");
        System.out.println("2 para remover");
        System.out.println("3 para exibir");
        System.out.println("0 para sair");
        return scanner.nextInt();
    }

    public static void main(String[] args) {
        NossoVetor v1 = new NossoVetor();
        NossoVetor v2 = new NossoVetor(4);
        scanner = new Scanner(System.in);

        // v1.ocupacao = 23; atributo private, não pode ser acessado
        // int i=10;
        // while (!v2.estaCheio()) {
        // //System.out.println(i);
        // v2.insere(i++);
        // }
        // System.out.println(v2);
        // System.out.println();
        // while (!v1.estaCheio()) {
        // v1.insere(++i);
        // //System.out.println(i);
        // }
        // System.out.println(v1);

        int opcao = menu();
        while (opcao > 0) {
            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor: ");
                    // ou v1.insere(scanner.nextInt());
                    int i = scanner.nextInt();
                    v1.insere(i);
                    break;
                case 2:
                    if (!v1.estaCheio())
                        System.out.println(v1.remove() + " foi removido");
                        // int i = v1.remove();
                        // System.out.println(i + "foi removido");
                    else
                    System.out.println("vetor vazio");
                    break;
                case 3:
                    System.out.println(v1);
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
            opcao = menu();
        }
        System.out.println("Obrigado, volte sempre!");
        scanner.close();
    }
}