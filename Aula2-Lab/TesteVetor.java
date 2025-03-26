public class TesteVetor {
    public static void main(String[] args) {
        NossoVetor v1 = new NossoVetor();
        NossoVetor v2 = new NossoVetor(4);

        //v1.ocupaçao = 23; atributo private, não pode ser acessado
        int i=10;
        while (!v2.estaCheio()) {
            // System.out.println(i);
            v2.insere(i++);
        }
        // temos que ensinar a maquina a promover a ação do Override, convertendo uma String para o metodo toString
        System.out.println(v2);
        while (!v1.estaCheio()) {
            v1.insere(++i);
            // System.out.println(i);
        }
        System.out.println(v1);
    }
 }

// classe object is the root of the class hierarchy