import java.util.Random;

public class TesteArvorePessoas {
    public static void main(String[] args) {
        Random random = new Random();
        ArvoreBinaria<Pessoa> abb = new ArvoreBinaria<>();
        for (int i=1; i<=10; i++){
            int n = random.nextInt(10);
            System.out.println(n + " ");
            abb.insere(new Pessoa(n, "abb"));
        }
        System.out.println(abb);
    }
}