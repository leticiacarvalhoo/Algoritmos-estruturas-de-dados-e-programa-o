import java.util.Scanner;

public class TesteOrdenacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NossoVetor v;
        int t;
        System.out.print("escolha o tamanho do vetor, 0 encerra: ");
        t = scanner.nextInt();
        while (t > 0){
            v = new NossoVetor(t);
            v.preencheVetor();
            System.out.println(v);
            System.out.println("\nescolha o novo tamanho, 0 encerra: ");
            t = scanner.nextInt();
        }
        scanner.close();
    }
}
