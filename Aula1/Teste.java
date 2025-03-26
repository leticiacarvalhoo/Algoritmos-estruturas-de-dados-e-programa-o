import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        int i;
        int[] v;
        System.out.println("Qual tamanho do vetor?");
        Scanner scanner = new Scanner(System.in);
        i = scanner.nextInt();
        v = new int[5];
        scanner.close();
    }
}
