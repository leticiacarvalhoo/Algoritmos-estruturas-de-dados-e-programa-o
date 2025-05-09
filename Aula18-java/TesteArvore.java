import java.util.Random;

public class TesteArvore {
    public static void main(String[] args) {
        Random random = new Random();
        ArvoreBinaria abb =  new ArvoreBinaria();
        ArvoreBinaria abbOcorrencias = new ArvoreBinaria();
        for (int i=1; i<=30; i++){
            int n = random.nextInt(100);
            System.out.println(n + " ");
            abb.insere(n);
            abbOcorrencias.insereOcorrencias(n);
        }
        System.out.println();
        System.out.println(abb);
        System.out.println(abbOcorrencias);

        System.out.println("\nAltura na arvore com repetição: " + abb.altura());
        System.out.println("\naltura da arvore com ocorrencias: " + abbOcorrencias.altura());
    }
}
