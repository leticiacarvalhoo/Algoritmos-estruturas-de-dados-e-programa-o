import java.util.Random;

public class TesteFila {
    public static void main(String[] args) {
        Fila fila = new Fila();
        Random random = new Random();

        for (int i=0; i <= 20; i++){
            try {
                if(random.nextBoolean()){
                    fila.enfileira(i);
    
                }
                else{
                    fila.desenfileira(i);
                }
                System.out.println(fila);
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }
            
        }
    }
}
