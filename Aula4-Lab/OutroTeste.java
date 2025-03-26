import java.util.Random;

public class OutroTeste {
    public static void main(String[] args) {
        NossoVetor v = new NossoVetor(6);
        Random random = new Random();
        for (int i=1; i<= 100; i++){
            if (random.nextBoolean()){
                v.insere(i);
            }
            else{
                v.remove();
            }
            System.out.println("Tamanho= " + v.getTamanho());
            System.out.println(v);
        }
    }
}
