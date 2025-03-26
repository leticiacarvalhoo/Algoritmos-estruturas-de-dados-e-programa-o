package lista_simples;
public class TesteLista {
    public static void main(String[] args) {
        ListaSimples lista = new ListaSimples();
        System.out.println("lista criada:\n" + lista);

        lista.insereInicio(5);
        lista.insereInicio(8);
        lista.insereInicio(15);
        System.out.println("lista depois das inserções de inicio:\n" + lista);

        try {
            System.out.println(lista.removeInicio() + " foi removido do inicio!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("lista depois das inserções de inicio:\n" + lista);

        lista.insereFim(100);
        lista.insereFim(200);
        System.out.println("lista depois das inserções de fim:\n" + lista);

        try {
            System.out.println(lista.removeFim() + " foi removido do final!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("lista depois das inserções de fim:\n" + lista);

    }
}
