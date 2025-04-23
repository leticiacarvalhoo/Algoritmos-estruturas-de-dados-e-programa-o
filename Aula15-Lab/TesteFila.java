import java.util.Random;

public class TesteFila {
    public static void main(String[] args) {
        FilaLigada fila = new FilaLigada();
        Random random = new Random();

        for (int i=0; i <= 20; i++){
            try {
                if(random.nextBoolean()){
                    fila.enfileira(i);
    
                }
                else{
                    fila.desenfileira();
                }
                System.out.println(fila);
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }
            
        }
    }
}
