import java.util.Random;

public class TesteArvore {
    public static void main(String[] args) {
        Random random = new Random();
        ArvoreBinaria abb =  new ArvoreBinaria();
        for (int i=1; i<=30; i++){
            int n = random.nextInt(100);
            System.out.println(n + " ");
            abb.insere(n);
        }
        System.out.println();
        System.out.println(abb);
    }
}
